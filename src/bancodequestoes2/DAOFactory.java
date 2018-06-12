package bancodequestoes2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JCheckBox;
/**
 *
 * @author jackson
 */
public class DAOFactory {
    private static int numInterrogacao = 0;
    public static ArrayList<String> comparacao = new ArrayList();
    private static String query =   "select d.nome, q.id_questao, q.enunciado, q.tema, q.tipo, q.imagem, q.nota, q.justificativa, a.*"+
                                                        " from disciplina as d inner join questoes as q"+
                                                        " on d.ID_disciplina = q.FK_disciplina"+
                                                        " left join alternativas as a"+
                                                        " on q.ID_questao = a.FK_questao";
    private static Connection connection = null;
    
    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection aConnection) {
        connection = aConnection;
    }
    
    public static void abrirConexão() throws Exception {
        String driverName = "com.mysql.jdbc.Driver";
        String serverName = "localhost";
        String dataBase = "provadb";
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://" + serverName + "/" + dataBase;
        // Registrar o driver
        Class.forName(driverName);
        // Capturar a conexão
        Connection conn = DriverManager.getConnection(url, user, pass);
        // Retorna a conexao aberta
        System.out.println("Conexão Iniciada");
        setConnection(conn);
    }
    
    public static void fecharConexão(Connection conn) throws Exception{
        try{
            getConnection().close();
            System.out.println("Conexao Fechada");
        }catch(SQLException e){
            System.out.println("erro ao fechar conexao");
        }
    }
    
    public static void reiniciar() throws Exception{
        fecharConexão(getConnection());
        System.out.println("Preparando para reiniciar conexão");
        
        DAOFactory.abrirConexão();
        System.out.println("Conexão Reiniciada");
    }
    static int foreignTemp;
    static boolean foreignNow = false;
    
    private static void setEmDisciplina(String disciplina){
        
        boolean igual = false;
        
        ArrayList<DisciplinaKey> disciplinasKey = DAOFactory.getDisciplinasKey();
        DisciplinaKey d;
        if(!disciplinasKey.isEmpty())
        for(int i = 0; i < disciplinasKey.size(); i++){
            d = disciplinasKey.get(i);
            if(d.disciplina.equals(disciplina)){
                foreignTemp = d.id;
                foreignNow = true;
                igual = true;
            }
        }
        if(!igual){
            String sql = "INSERT INTO disciplina(nome) VALUES(?)";

            try {
                PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);

                stmt.setString(1, disciplina);
                stmt.execute();
                stmt.close();
                System.out.println("Sucesso ao inserir na tabela disciplina!");
            } catch (SQLException ex) {
                System.out.println("Erro ao inserir na tabela disciplina!");
            }
        }
    }
    
    private static void setEmQuestoes(String enunciado, String tipo, String tema, String imagem, String nota, int foreignKey){
        
        String sql;
        if(tema.equals("Selecione")){
            sql = "INSERT INTO questoes(enunciado, tipo, imagem, nota, fk_disciplina) VALUES(?, ?, ?, ?, ?)";
        }else{
            sql = "INSERT INTO questoes(enunciado, tipo, tema, imagem, nota, fk_disciplina) VALUES(?, ?, ?, ?, ?, ?)";
        }
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            if(tema.equals("Selecione")){
                stmt.setString(1, enunciado);
                stmt.setString(2, tipo);
                stmt.setString(3, imagem);
                stmt.setString(4, nota);
                stmt.setInt(5, foreignKey);
            }else{
                stmt.setString(1, enunciado);
                stmt.setString(2, tipo);
                stmt.setString(3, tema);
                stmt.setString(4, imagem);
                stmt.setString(5, nota);
                stmt.setInt(6, foreignKey);
            }
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela questoes!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela questoes!");
        }
    }
    
    private static void setEmQuestoesComJustificativa(String enunciado, String tipo, String tema, String imagem, String nota, String justificativa, int foreignKey){
        String sql;
            sql = "INSERT INTO questoes(enunciado, tipo, tema, imagem, nota, justificativa, fk_disciplina) VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            
            stmt.setString(1, enunciado);
            stmt.setString(2, tipo);
            stmt.setString(3, tema);
            stmt.setString(4, imagem);
            stmt.setString(5, nota);
            stmt.setString(6, justificativa);
            stmt.setInt(7, foreignKey);
            
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela questoes com justificativa!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela questoes com justificativa!");
        }
    }
    
    private static int getLastIdDisciplina(){
        String sql = "SELECT max(id_disciplina) FROM disciplina";
        int id = 0;
        
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
            }
            stmt.close();
            rs.close();
            return id;
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar foreignKey!");
            return 0;
        }
    }
    
    private static int getLastIdQuestoes(){
        String sql = "SELECT max(id_questao)'id' FROM questoes";
        int id = 0;
        
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
            }
            stmt.close();
            rs.close();
            return id;
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar foreignKey!");
            return 0;
        }
    }
    
    private static void setEm2Alternativas(String alt1, String alt2, JCheckBox mark1, JCheckBox mark2, int foreignKey){
        String sql = "INSERT INTO alternativas(alt1, esta_correta1, alt2, esta_correta2, fk_questao) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            
            stmt.setString(1, alt1);
            if(mark1.isSelected() == true)
                stmt.setInt(2, 1);
            else
                stmt.setInt(2, 0);
            
            stmt.setString(3, alt2);
            if(mark2.isSelected() == true)
                stmt.setInt(4, 1);
            else
                stmt.setInt(4, 0);
            
            stmt.setInt(5, foreignKey);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela alternativas!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela alternativas!");
        }
    }
    
    private static void setEm3Alternativas(String alt1, String alt2, String alt3, JCheckBox mark1, JCheckBox mark2, JCheckBox mark3, int foreignKey){
        String sql = "INSERT INTO alternativas(alt1, esta_correta1, alt2, esta_correta2, alt3, esta_correta3, fk_questao) VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            
            stmt.setString(1, alt1);
            if(mark1.isSelected() == true)
                stmt.setInt(2, 1);
            else
                stmt.setInt(2, 0);
            
            stmt.setString(3, alt2);
            if(mark2.isSelected() == true)
                stmt.setInt(4, 1);
            else
                stmt.setInt(4, 0);
            
            stmt.setString(5, alt3);
            if(mark3.isSelected() == true)
                stmt.setInt(6, 1);
            else
                stmt.setInt(6, 0);
            
            stmt.setInt(7, foreignKey);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela alternativas!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela alternativas!");
        }
    }
    
    private static void setEm4Alternativa(String alt1, String alt2, String alt3, String alt4, JCheckBox mark1, JCheckBox mark2, JCheckBox mark3, JCheckBox mark4, int foreignKey){
        String sql = "INSERT INTO alternativas(alt1, esta_correta1, alt2, esta_correta2, alt3, esta_correta3, alt4, esta_correta4, fk_questao) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            
            stmt.setString(1, alt1);
            if(mark1.isSelected() == true)
                stmt.setInt(2, 1);
            else
                stmt.setInt(2, 0);
            
            stmt.setString(3, alt2);
            if(mark2.isSelected() == true)
                stmt.setInt(4, 1);
            else
                stmt.setInt(4, 0);
            
            stmt.setString(5, alt3);
            if(mark3.isSelected() == true)
                stmt.setInt(6, 1);
            else
                stmt.setInt(6, 0);
            
            stmt.setString(7, alt4);
            if(mark4.isSelected() == true)
                stmt.setInt(8, 1);
            else
                stmt.setInt(8, 0);
            
            stmt.setInt(9, foreignKey);
            
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela alternativas!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela alternativas!");
        }
    }
    
    private static void setEm5Alternativa(String alt1, String alt2, String alt3, String alt4, String alt5, JCheckBox mark1, JCheckBox mark2, JCheckBox mark3, JCheckBox mark4, JCheckBox mark5, int foreignKey){
        String sql = "INSERT INTO alternativas(alt1, esta_correta1, alt2, esta_correta2, alt3, esta_correta3, alt4, esta_correta4, alt5, esta_correta5, fk_questao) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            
            stmt.setString(1, alt1);
            if(mark1.isSelected() == true)
                stmt.setInt(2, 1);
            else
                stmt.setInt(2, 0);
            
            stmt.setString(3, alt2);
            if(mark2.isSelected() == true)
                stmt.setInt(4, 1);
            else
                stmt.setInt(4, 0);
            
            stmt.setString(5, alt3);
            if(mark3.isSelected() == true)
                stmt.setInt(6, 1);
            else
                stmt.setInt(6, 0);
            
            stmt.setString(7, alt4);
            if(mark4.isSelected() == true)
                stmt.setInt(8, 1);
            else
                stmt.setInt(8, 0);
            
            stmt.setString(9, alt5);
            if(mark5.isSelected() == true)
                stmt.setInt(10, 1);
            else
                stmt.setInt(10, 0);
            
            stmt.setInt(11, foreignKey);
            
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela alternativas!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela alternativas!");
        }
    }
    
    public static void inserirQuestaoVF(String disciplina, String enunciado, String tipo, String tema, String imagem, String nota, JCheckBox mark1, JCheckBox mark2, String alt1, String alt2){
        int foreignKey = -1;
        
        
        try{
            setEmDisciplina(disciplina);
            if(foreignNow){
                foreignKey = foreignTemp;
            }else{
                foreignKey = getLastIdDisciplina();
            }
            setEmQuestoes(enunciado, tipo, tema, imagem, nota, foreignKey);
            foreignKey = getLastIdQuestoes();
            setEm2Alternativas(alt1, alt2, mark1, mark2, foreignKey);
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }
    
    public static void inserirQuestaoD(String disciplina, String enunciado, String tipo, String tema, String imagem, String nota, String justificativa){
        int foreignKey = -1;
        
        try{
            setEmDisciplina(disciplina);
            if(foreignNow){
                foreignKey = foreignTemp;
            }else{
                foreignKey = getLastIdDisciplina();
            }
            setEmQuestoesComJustificativa(enunciado, tipo, tema, imagem, nota, justificativa, foreignKey);
            
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }
    
    public static void inserirEmAlternativas(String disciplina, String enunciado, String tipo, String tema, String imagem, String nota,  JCheckBox mark1, JCheckBox mark2, JCheckBox mark3, String alt1, String alt2, String alt3){
        int foreignKey = -1;
        
        try{
            setEmDisciplina(disciplina);
            if(foreignNow){
                foreignKey = foreignTemp;
            }else{
                foreignKey = getLastIdDisciplina();
            }
            setEmQuestoes(enunciado, tipo, tema, imagem, nota, foreignKey);
            foreignKey = getLastIdQuestoes();
            setEm3Alternativas(alt1, alt2, alt3, mark1, mark2, mark3, foreignKey);
            
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }

    public static void inserirEmAlternativas(String disciplina, String enunciado, String tipo, String tema, String imagem, String nota,  JCheckBox mark1, JCheckBox mark2, JCheckBox mark3, JCheckBox mark4,  String alt1, String alt2, String alt3, String alt4){
        int foreignKey = -1;
        
        try{
            setEmDisciplina(disciplina);
            if(foreignNow){
                foreignKey = foreignTemp;
            }else{
                foreignKey = getLastIdDisciplina();
            }
            setEmQuestoes(enunciado, tipo, tema, imagem, nota, foreignKey);
            foreignKey = getLastIdQuestoes();
            setEm4Alternativa(alt1, alt2, alt3, alt4, mark1, mark2, mark3, mark4, foreignKey);
            
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }
      
     public static void inserirEmAlternativas(String disciplina, String enunciado, String tipo, String tema, String imagem, String nota,  JCheckBox mark1, JCheckBox mark2, JCheckBox mark3, JCheckBox mark4, JCheckBox mark5, String alt1, String alt2, String alt3, String alt4, String alt5){
        int foreignKey = -1;
        
        try{
            setEmDisciplina(disciplina);
            if(foreignNow){
                foreignKey = foreignTemp;
            }else{
                foreignKey = getLastIdDisciplina();
            }
            setEmQuestoes(enunciado, tipo, tema, imagem, nota, foreignKey);
            foreignKey = getLastIdQuestoes();
            setEm5Alternativa(alt1, alt2, alt3, alt4, alt5, mark1, mark2, mark3, mark4, mark5, foreignKey);
            
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }
     
    public static ArrayList<String> getTemas(){
         ArrayList<String> temas = new ArrayList();
         String sql = "SELECT tema FROM questoes";
        
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                if(rs.getString("tema") != null){
                    if(!temas.contains(rs.getString("tema")))
                        temas.add(rs.getString("tema"));
                }
            }
            
            stmt.close();
            rs.close();
            System.out.println("Sucesso ao pegar temas!");
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar temas!");
        }
         
         return temas;
     }
     
     public static ArrayList<String> getDisciplinas(){
         ArrayList<String> disciplinas = new ArrayList();
         String sql = "SELECT nome FROM disciplina";
        
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                if(rs.getString("nome") != null){
                    if(!disciplinas.contains(rs.getString("nome")))
                        disciplinas.add(rs.getString("nome"));
                }
            }
            
            stmt.close();
            rs.close();
            System.out.println("Sucesso ao pegar disciplinas!");
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar disciplinas!");
        }
         
         return disciplinas;
     }
     
     public static ArrayList<DisciplinaKey> getDisciplinasKey(){
         ArrayList<DisciplinaKey> disciplin = new ArrayList();
         DisciplinaKey d = new DisciplinaKey();
         String sql = "SELECT id_disciplina, nome FROM disciplina";
        
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                System.out.println("next");
                d.id = rs.getInt("id_disciplina");
                System.out.println(d.id);
                d.disciplina = rs.getString("nome");
                System.out.println(d.disciplina);
                
                disciplin.add(d);
            }
            
            stmt.close();
            rs.close();
            System.out.println("Sucesso ao pegar disciplinas!");
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar disciplinas!");
        }
         
         return disciplin;
     }
     
     public static ArrayList<DataQuestions> getQuestoes(String incremento){
         ArrayList<DataQuestions> questoes = new ArrayList();
         String sql;
         if(!comparacao.isEmpty()){
            sql = query + incremento;
         }else{
            sql = query;
         }
        
        try {
            PreparedStatement stm = DAOFactory.getConnection().prepareStatement(sql);
            
            if(!comparacao.isEmpty()){
                for(int i = 0; i < numInterrogacao; i++){
                    stm.setString(i+1, comparacao.get(i));
                }
            }
            
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                DataQuestions questao = new DataQuestions();
                
                if(rs.getString("nome") != null){
                    questao.disciplina = rs.getString("nome");
                }
                if(rs.getString("id_questao") != null){
                    questao.idQuestao = rs.getInt("id_questao");
                }
                if(rs.getString("enunciado") != null){
                    questao.enunciado = rs.getString("enunciado");
                }
                if(rs.getString("tema") != null){
                    questao.tema = rs.getString("tema");
                }
                if(rs.getString("tipo") != null){
                    questao.tipo = rs.getString("tipo");
                }
                if(rs.getString("imagem") != null){
                    questao.caminhoImagem = rs.getString("imagem");
                }
                if(rs.getString("nota") != null){
                    questao.nota = rs.getString("nota");
                }
                
                
                if(rs.getString("alt1") != null){
                    if(rs.getInt("esta_correta1") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt1"), true);
                        questao.alternativa1 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt1"), false);
                        questao.alternativa1 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa1 = alt;
                }
                
                if(rs.getString("alt2") != null){
                    if(rs.getInt("esta_correta2") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt2"), true);
                        questao.alternativa2 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt2"), false);
                        questao.alternativa2 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa2 = alt;
                }
                
                if(rs.getString("alt3") != null){
                    if(rs.getInt("esta_correta3") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt3"), true);
                        questao.alternativa3 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt3"), false);
                        questao.alternativa3 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa3 = alt;
                }
                
                if(rs.getString("alt4") != null){
                    if(rs.getInt("esta_correta4") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt4"), true);
                        questao.alternativa4 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt4"), false);
                        questao.alternativa4 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa4 = alt;
                }
                
                if(rs.getString("alt5") != null){
                    if(rs.getInt("esta_correta5") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt5"), true);
                        questao.alternativa5 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt5"), false);
                        questao.alternativa5 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa5 = alt;
                }
                
                if(rs.getString("justificativa") != null){
                    questao.respostaDiscursiva = rs.getString("justificativa");
                }else{
                    questao.respostaDiscursiva = "";
                }
                
                questoes.add(questao);
            }
            
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar disciplinas!");
        }
         
        comparacao.clear();
        numInterrogacao = 0;
         System.out.println(questoes.size());
         return questoes;
     }
     
      public static ArrayList<DataQuestions> getProva(int idQuestao){
         ArrayList<DataQuestions> questoes = new ArrayList();
         String sql = query + "where questoes.id_Questao = ?";
        
        try {
            PreparedStatement stm = DAOFactory.getConnection().prepareStatement(sql);
            
            stm.setInt(1, idQuestao);
            
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                DataQuestions questao = new DataQuestions();
                
                if(rs.getString("nome") != null){
                    questao.disciplina = rs.getString("nome");
                }
                if(rs.getString("id_questao") != null){
                    questao.idQuestao = rs.getInt("id_questao");
                }
                if(rs.getString("enunciado") != null){
                    questao.enunciado = rs.getString("enunciado");
                }
                if(rs.getString("tema") != null){
                    questao.tema = rs.getString("tema");
                }
                if(rs.getString("tipo") != null){
                    questao.tipo = rs.getString("tipo");
                }
                if(rs.getString("imagem") != null){
                    questao.caminhoImagem = rs.getString("imagem");
                }
                if(rs.getString("nota") != null){
                    questao.nota = rs.getString("nota");
                }
                
                if(rs.getString("alt1") != null){
                    if(rs.getInt("esta_correta1") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt1"), true);
                        questao.alternativa1 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt1"), false);
                        questao.alternativa1 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa1 = alt;
                }
                
                if(rs.getString("alt2") != null){
                    if(rs.getInt("esta_correta2") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt2"), true);
                        questao.alternativa2 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt2"), false);
                        questao.alternativa2 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa2 = alt;
                }
                
                if(rs.getString("alt3") != null){
                    if(rs.getInt("esta_correta3") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt3"), true);
                        questao.alternativa3 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt3"), false);
                        questao.alternativa3 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa3 = alt;
                }
                
                if(rs.getString("alt4") != null){
                    if(rs.getInt("esta_correta4") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt4"), true);
                        questao.alternativa4 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt4"), false);
                        questao.alternativa4 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa4 = alt;
                }
                
                if(rs.getString("alt5") != null){
                    if(rs.getInt("esta_correta5") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt5"), true);
                        questao.alternativa5 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt5"), false);
                        questao.alternativa5 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa5 = alt;
                }
                
                if(rs.getString("justificativa") != null){
                    questao.respostaDiscursiva = rs.getString("justificativa");
                }else{
                    questao.respostaDiscursiva = "";
                }
                
                questoes.add(questao);
            }
            
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar disciplinas!");
        }
         
         return questoes;
     }
     
     public static String incrementQuery(String condicao, String comp){
         String increment = "";
         if(condicao == "clausa"){
             increment += " where";
         }
         if(condicao == "tema"){
             increment += " q.tema = ?";
             comparacao.add(comp);
             numInterrogacao ++;
         }
         if(condicao == "tipo"){
             increment += " q.tipo = ?";
             comparacao.add(comp);
             numInterrogacao ++;
         }
         if(condicao == "disciplina"){
             increment += " d.nome = ?";
             comparacao.add(comp);
             numInterrogacao ++;
         }
         if(condicao == "pesquisa"){
             increment += " q.enunciado like ?";
             comparacao.add(comp);
             numInterrogacao ++;
         }
         System.out.println(comparacao.size());
         return increment;
     }
     
     public static void deleteAlternativas(String tabela, int idQuestao){
         String sql = "delete from "+tabela+" where "+tabela+".FK_questao = ?";
        
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            
            stmt.setInt(1, idQuestao);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao deletar da tabela questoes!");
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar da tabela questoes!");
        }
     }
     
     public static void deleteQuestion(int idQuestao){
         String sql = "delete from questoes where questoes.id_questao = ?";
        
        try {
            PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);
            
            stmt.setInt(1, idQuestao);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao deletar da tabela questoes!");
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar da tabela questoes!");
        }
     }
     
     public static DataQuestions getQuestao(int idQuestao){
         String sql = query + " where q.id_Questao = ?";
        DataQuestions questao = new DataQuestions();
        
        try {
            PreparedStatement stm = DAOFactory.getConnection().prepareStatement(sql);
            
            stm.setInt(1, idQuestao);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                
                if(rs.getString("nome") != null){
                    questao.disciplina = rs.getString("nome");
                }
                if(rs.getString("id_questao") != null){
                    questao.idQuestao = rs.getInt("id_questao");
                }
                if(rs.getString("enunciado") != null){
                    questao.enunciado = rs.getString("enunciado");
                }
                if(rs.getString("tema") != null){
                    questao.tema = rs.getString("tema");
                }
                if(rs.getString("tipo") != null){
                    questao.tipo = rs.getString("tipo");
                }
                if(rs.getString("imagem") != null){
                    questao.caminhoImagem = rs.getString("imagem");
                }
                if(rs.getString("nota") != null){
                    questao.nota = rs.getString("nota");
                }
                
                if(rs.getString("alt1") != null){
                    if(rs.getInt("esta_correta1") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt1"), true);
                        questao.alternativa1 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt1"), false);
                        questao.alternativa1 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa1 = alt;
                }
                
                if(rs.getString("alt2") != null){
                    if(rs.getInt("esta_correta2") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt2"), true);
                        questao.alternativa2 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt2"), false);
                        questao.alternativa2 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa2 = alt;
                }
                
                if(rs.getString("alt3") != null){
                    if(rs.getInt("esta_correta3") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt3"), true);
                        questao.alternativa3 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt3"), false);
                        questao.alternativa3 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa3 = alt;
                }
                
                if(rs.getString("alt4") != null){
                    if(rs.getInt("esta_correta4") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt4"), true);
                        questao.alternativa4 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt4"), false);
                        questao.alternativa4 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa4 = alt;
                }
                
                if(rs.getString("alt5") != null){
                    if(rs.getInt("esta_correta5") == 1){
                        AnswerData alt = new AnswerData(rs.getString("alt5"), true);
                        questao.alternativa5 = alt;
                    }else{
                        AnswerData alt = new AnswerData(rs.getString("alt5"), false);
                        questao.alternativa5 = alt;
                    }
                }else{
                    AnswerData alt = new AnswerData("", false);
                    questao.alternativa5 = alt;
                }
                
                if(rs.getString("justificativa") != null){
                    questao.respostaDiscursiva = rs.getString("justificativa");
                }else{
                    questao.respostaDiscursiva = "";
                }
                
            }
            
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar disciplinas!");
        }
         
         return questao;
     }
     
     public static void updateDisciplina(int primaryDisciplina, String disciplina){
         String sql = "UPDATE disciplina SET nome = ? WHERE ID_disciplina = ?";

            try {
                PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);

                stmt.setString(1, disciplina);
                stmt.setInt(2, primaryDisciplina);
                stmt.execute();
                stmt.close();
                System.out.println("Sucesso ao atualizar a tabela disciplina!");
            } catch (SQLException ex) {
                System.out.println("Erro ao atualizar a tabela disciplina!");
            }
     }
     
     public static void updateQuestoes(String enunciado, String tema, String tipo, int primaryDisciplina, int primaryQuestao){
         String sql = "UPDATE questoes SET enunciado = ?, tema = ?, tipo = ?, fk_disciplina = ? WHERE ID_questao = ?";

            try {
                PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);

                stmt.setString(1, enunciado);
                stmt.setString(2, tema);
                stmt.setString(3, tipo);
                stmt.setInt(4, primaryDisciplina);
                stmt.setInt(5, primaryQuestao);
                stmt.execute();
                stmt.close();
                System.out.println("Sucesso ao atualizar a tabela questoes!");
            } catch (SQLException ex) {
                System.out.println("Erro ao atualizar a tabela questoes!");
            }
     }
     
     public static void updateQuestoesComJustificativa(String enunciado, String tema, String tipo, String justificativa, int primaryDisciplina, int primaryQuestao){
         String sql = "UPDATE questoes SET enunciado = ?, tema = ?, tipo = ?, justificativa = ?, fk_disciplina = ? WHERE ID_questao = ?";

            try {
                PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);

                stmt.setString(1, enunciado);
                stmt.setString(2, tema);
                stmt.setString(3, tipo);
                stmt.setString(4, justificativa);
                stmt.setInt(5, primaryDisciplina);
                stmt.setInt(6, primaryQuestao);
                System.out.println(stmt.toString());
                stmt.execute();
                stmt.close();
                System.out.println("Sucesso ao atualizar a tabela questoes com justificativa!");
            } catch (SQLException ex) {
                System.out.println("Erro ao atualizar a tabela questoes com justificativa!");
            }
     }
     
     public static void updateAlternativas(String alt1, JCheckBox mark1, String alt2, JCheckBox mark2, int primaryQuestao){
         String sql = "UPDATE alternativas SET alt1 = ?, esta_correta1 = ?, alt2 = ?, esta_correta2 = ? WHERE ID_alternativas = ?";

            try {
                PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);

                stmt.setString(1, alt1);
                if(mark1.isSelected() == true)
                    stmt.setInt(2, 1);
                else
                    stmt.setInt(2, 0);
                stmt.setString(3, alt2);
                if(mark2.isSelected() == true)
                    stmt.setInt(4, 1);
                else
                    stmt.setInt(4, 0);
                stmt.setInt(5, primaryQuestao);
                stmt.execute();
                stmt.close();
                System.out.println("Sucesso ao atualizar a tabela alternativas!");
            } catch (SQLException ex) {
                System.out.println("Erro ao atualizar a tabela alternativas!");
            }
     }
     
     public static void updateAlternativas(String alt1, JCheckBox mark1, String alt2, JCheckBox mark2, String alt3, JCheckBox mark3, int primaryQuestao){
         String sql = "UPDATE alternativas SET alt1 = ?, esta_correta1 = ?, alt2 = ?, esta_correta2 = ?, alt3 = ?, esta_correta3 = ? WHERE ID_alternativas = ?";

            try {
                PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);

                stmt.setString(1, alt1);
                if(mark1.isSelected() == true)
                    stmt.setInt(2, 1);
                else
                    stmt.setInt(2, 0);
                stmt.setString(3, alt2);
                if(mark2.isSelected() == true)
                    stmt.setInt(4, 1);
                else
                    stmt.setInt(4, 0);
                if(mark3.isSelected() == true)
                    stmt.setInt(5, 1);
                else
                    stmt.setInt(6, 0);
                stmt.setInt(7, primaryQuestao);
                stmt.execute();
                stmt.close();
                System.out.println("Sucesso ao atualizar a tabela alternativas!");
            } catch (SQLException ex) {
                System.out.println("Erro ao atualizar a tabela alternativas!");
            }
     }
     
     public static void updateAlternativas(String alt1, JCheckBox mark1, String alt2, JCheckBox mark2, String alt3, JCheckBox mark3, String alt4, JCheckBox mark4, int primaryQuestao){
           String sql = "UPDATE alternativas SET alt1 = ?, esta_correta1 = ?, alt2 = ?, esta_correta2 = ?, alt3 = ?, esta_correta3 = ?, alt4 = ?, esta_correta4 = ? WHERE ID_alternativas = ?";

            try {
                PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);

                stmt.setString(1, alt1);
                if(mark1.isSelected() == true)
                    stmt.setInt(2, 1);
                else
                    stmt.setInt(2, 0);
                stmt.setString(3, alt2);
                if(mark2.isSelected() == true)
                    stmt.setInt(4, 1);
                else
                    stmt.setInt(4, 0);
                if(mark3.isSelected() == true)
                    stmt.setInt(5, 1);
                else
                    stmt.setInt(6, 0);
                if(mark4.isSelected() == true)
                    stmt.setInt(7, 1);
                else
                    stmt.setInt(8, 0);
                stmt.setInt(9, primaryQuestao);
                stmt.execute();
                stmt.close();
                System.out.println("Sucesso ao atualizar a tabela alternativas!");
            } catch (SQLException ex) {
                System.out.println("Erro ao atualizar a tabela alternativas!");
            }
     }
     
     public static void updateAlternativas(String alt1, JCheckBox mark1, String alt2, JCheckBox mark2, String alt3, JCheckBox mark3, String alt4, JCheckBox mark4, String alt5, JCheckBox mark5, int primaryQuestao){
         String sql = "UPDATE alternativas SET alt1 = ?, esta_correta1 = ?, alt2 = ?, esta_correta2 = ?, alt3 = ?, esta_correta3 = ?, alt4 = ?, esta_correta4 = ?, alt5 = ?, esta_correta5 = ? WHERE ID_alternativas = ?";

            try {
                PreparedStatement stmt = DAOFactory.getConnection().prepareStatement(sql);

                stmt.setString(1, alt1);
                if(mark1.isSelected() == true)
                    stmt.setInt(2, 1);
                else
                    stmt.setInt(2, 0);
                stmt.setString(3, alt2);
                if(mark2.isSelected() == true)
                    stmt.setInt(4, 1);
                else
                    stmt.setInt(4, 0);
                if(mark3.isSelected() == true)
                    stmt.setInt(5, 1);
                else
                    stmt.setInt(6, 0);
                if(mark4.isSelected() == true)
                    stmt.setInt(7, 1);
                else
                    stmt.setInt(8, 0);
                if(mark5.isSelected() == true)
                    stmt.setInt(9, 1);
                else
                    stmt.setInt(10, 0);
                stmt.setInt(11, primaryQuestao);
                stmt.execute();
                stmt.close();
                System.out.println("Sucesso ao atualizar a tabela alternativas!");
            } catch (SQLException ex) {
                System.out.println("Erro ao atualizar a tabela alternativas!");
            }
     }
     
     public static void updateQuestaoFinalVF(int primaryDisciplina, int primaryQuestao, String disciplina, String enunciado, String tema, String tipo, String alt1, JCheckBox mark1, String alt2, JCheckBox mark2){
         
         updateDisciplina(primaryDisciplina, disciplina);
         updateQuestoes(enunciado, tema, tipo, primaryDisciplina, primaryQuestao);
         updateAlternativas(tipo, mark1, tipo, mark2, primaryQuestao);
     }
     
     public static void updateQuestaoFinalDisertativa(int primaryDisciplina, int primaryQuestao, String disciplina, String enunciado, String tema, String tipo, String justificativa){
         
         updateDisciplina(primaryDisciplina, disciplina);
         updateQuestoesComJustificativa(enunciado, tema, tipo, justificativa, primaryDisciplina, primaryQuestao);
     }
     
     public static void updateQuestaoFinalAlternativas(int primaryDisciplina, int primaryQuestao, String disciplina, String enunciado, String tema, String tipo, String alt1, JCheckBox mark1, String alt2, JCheckBox mark2, String alt3, JCheckBox mark3){
         
         updateDisciplina(primaryDisciplina, disciplina);
         updateQuestoes(enunciado, tema, tipo, primaryDisciplina, primaryQuestao);
         updateAlternativas(alt1, mark1, alt2, mark2, alt3, mark3, primaryQuestao);
     }
     
     public static void updateQuestaoFinalAlternativas(int primaryDisciplina, int primaryQuestao, String disciplina, String enunciado, String tema, String tipo, String alt1, JCheckBox mark1, String alt2, JCheckBox mark2, String alt3, JCheckBox mark3, String alt4, JCheckBox mark4){
         
         updateDisciplina(primaryDisciplina, disciplina);
         updateQuestoes(enunciado, tema, tipo, primaryDisciplina, primaryQuestao);
         updateAlternativas(alt1, mark1, alt2, mark2, alt3, mark3, alt4, mark4, primaryQuestao);
     }
     
     public static void updateQuestaoFinalAlternativas(int primaryDisciplina, int primaryQuestao, String disciplina, String enunciado, String tema, String tipo, String alt1, JCheckBox mark1, String alt2, JCheckBox mark2, String alt3, JCheckBox mark3, String alt4, JCheckBox mark4, String alt5, JCheckBox mark5){
         
         updateDisciplina(primaryDisciplina, disciplina);
         updateQuestoes(enunciado, tema, tipo, primaryDisciplina, primaryQuestao);
         updateAlternativas(alt1, mark1, alt2, mark2, alt3, mark3, alt4, mark4, alt5, mark5, primaryQuestao);
     }
}