
package bancodequestoes2;

/**
 *
 * @author jacks
 */
public class DataQuestions {
    public int idQuestao;
        public String disciplina = "";
        public String enunciado = "";
        public String tipo = "";
        public String tema = "";
        public String nota = "";
        public AnswerData alternativa1;
        public AnswerData alternativa2;
        public AnswerData alternativa3;
        public AnswerData alternativa4;
        public AnswerData alternativa5;
        public String respostaDiscursiva = "";
        public String caminhoImagem = "";
        
    public DataQuestions(){
        disciplina = "";
        enunciado = "";
        tipo = "";
        tema = "";
        nota = "";
        respostaDiscursiva = "";
        caminhoImagem = "";
    }

    public void show(){
        System.out.println(idQuestao);
        System.out.println(disciplina);
        System.out.println(enunciado);
        System.out.println(tipo);
        System.out.println(tema);
    }
}
