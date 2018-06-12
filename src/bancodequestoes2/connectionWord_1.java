/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodequestoes2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;

/**
 *
 * @author jacks
 */
public class connectionWord_1 {
        public static FileOutputStream docSaida = null;
        public static InputStream imagem = null;
    public static void criarProva(String disciplina, String professor, String tipoProva, String periodo, String turno, String curso, String bimestre, ArrayList<DataQuestions> questoes) {
        
        XWPFDocument doc = new XWPFDocument();
        
        try {
            Calendar cal = Calendar.getInstance();
            String ano = ""+cal.get(Calendar.YEAR);
            if(cal.get(Calendar.MONTH)<6){
                ano += ".1";
            }else{
                ano += ".2";
            }
            //Criando Arquivo .doc
            File file = new File(javax.swing.filechooser.FileSystemView.getFileSystemView().getDefaultDirectory() + "\\BancodeQuestões\\Provas\\"+"FACAM - "+disciplina+" - "+periodo+" periodo - "+turno+" - "+"Tipo "+tipoProva+" - "+ano);
            File file2 = new File(javax.swing.filechooser.FileSystemView.getFileSystemView().getDefaultDirectory() + "\\BancodeQuestões\\Provas\\"+"FACAM - "+disciplina+" - "+periodo+" periodo - "+turno+" - "+"Tipo "+tipoProva+" - "+ano+".doc");
            int e = 1;
            String path = file.getAbsolutePath() + "_";
            boolean existe = false;
            while(file2.exists()){
                file = new File(path + e);
                path = file.getAbsoluteFile().toString();
                file2 = new File(path +".doc");
                if(!file2.exists()){
                    existe = true;
                }
                e++;
                if(e < 11){
                    path = path.substring(0, path.length()-1);
                }else if(e < 100){
                    path = path.substring(0, path.length()-2);
                }else{
                    path = path.substring(0, path.length()-3);
                }
            }
            if(!existe)
                docSaida = new FileOutputStream(new File(file.getAbsoluteFile() + ".doc"));
            else
                docSaida = new FileOutputStream(new File(file.getAbsoluteFile() + ".doc"));
            //Carregando imagem
//            imagem = new FileInputStream(new File("C:\\Users\\jacks\\OneDrive\\Área de Trabalho\\BancoQuestoes4\\BancoQuestoes4.0\\build\\classes\\img\\logo.jpg"));
            //Ajustando as margens da pagina
            CTSectPr sectPr = doc.getDocument().getBody().addNewSectPr();
            CTPageMar pageMar = sectPr.addNewPgMar();
            pageMar.setLeft(BigInteger.valueOf(1700L));
            pageMar.setTop(BigInteger.valueOf(1700L));
            pageMar.setRight(BigInteger.valueOf(1135L));
            pageMar.setBottom(BigInteger.valueOf(1135L));
            //Criando Cabeçalho
            XWPFHeaderFooterPolicy headerFooter = new XWPFHeaderFooterPolicy(doc);
            XWPFHeader header = headerFooter.createHeader(XWPFHeaderFooterPolicy.DEFAULT);
            XWPFFooter footer = headerFooter.createFooter(XWPFHeaderFooterPolicy.DEFAULT);
            //Criando paragrafo da imagem
//            XWPFParagraph pCabecalhoImagem = header.createParagraph();
//            pCabecalhoImagem.setAlignment(ParagraphAlignment.LEFT);
//            
//            XWPFRun exec = pCabecalhoImagem.createRun();
//            exec.addBreak();
//            exec.addBreak();
//            exec.addBreak();
//            try {
//                exec.addPicture(imagem, XWPFDocument.PICTURE_TYPE_JPEG, "logo.jpg", Units.toEMU(98.5f), Units.toEMU(70.5f));
//            } catch (InvalidFormatException ex) {
//                Logger.getLogger(connectionWord_1.class.getName()).log(Level.SEVERE, null, ex);
//            }
            
            //Criando Cabeçalho da descrição da instituição
           XWPFParagraph pCabecalho = header.createParagraph();
           pCabecalho.setAlignment(ParagraphAlignment.CENTER);
           pCabecalho.setSpacingBetween(1);
           
           XWPFRun exec1 = pCabecalho.createRun();
           XWPFRun exec2 = pCabecalho.createRun();
           XWPFRun exec3 = pCabecalho.createRun();
           
           exec1.setFontFamily("Tahoma");
           exec1.setFontSize(20);
           exec1.setText("  FACAM -- FACULDADE DO MARANHÃO");
           exec1.addBreak();
           exec2.setFontFamily("Tahoma");
           exec2.setFontSize(12);
           exec2.setText("  SOMAR SOCIEDADE MARANHENSE DE ENSINO SUPERIOR LTDA");
           exec2.addBreak();
           exec3.setFontFamily("Tahoma");
           exec3.setFontSize(10);
           exec3.setText("  CNPJ 04.855.275/0001-68");
           exec3.addBreak();
           exec3.setText("  GRADUAÇÃO -- PÓS-GRADUAÇÃO -- ENSINO A DISTÂNCIA");
           exec3.addBreak();
           exec3.setText("______________________________________________________________________________________");
           //Criando rodapé da pagina
           XWPFParagraph pRodape = footer.createParagraph();
           pRodape.setAlignment(ParagraphAlignment.CENTER);
           pRodape.setSpacingBetween(1);
           
           XWPFRun exec4 = pRodape.createRun();
           exec4.setFontFamily("Tahoma");
           exec4.setFontSize(10);
           exec4.setText("______________________________________________________________________________________");
           exec4.addBreak();
           exec4.setText("Rua 38, Lote 03, Bequimão -- São Luís (MA) -- CEP: 65062-340");
           exec4.addBreak();
           exec4.setText("Fone: (98) 3227-1238 / 3227-7912 / 3227-8916");
           exec4.addBreak();
           exec4.setText("Site: www.facam-ma.com.br E-mail: faleconosco@facam-ma.com.br");
           
           XWPFParagraph pBreak = doc.createParagraph();
           pBreak.setSpacingBetween(0);
           
            //Escrevendo informações no Arquivo
            XWPFParagraph pCabecalhoInfo = doc.createParagraph();
           pCabecalhoInfo.setAlignment(ParagraphAlignment.LEFT);
           pCabecalhoInfo.setBorderBottom(Borders.DOUBLE);
           pCabecalhoInfo.setBorderLeft(Borders.DOUBLE);
           pCabecalhoInfo.setBorderRight(Borders.DOUBLE);
           pCabecalhoInfo.setBorderTop(Borders.DOUBLE);
           pCabecalhoInfo.setSpacingBetween(1.5f);
           
           XWPFRun exec5 = pCabecalhoInfo.createRun();
           XWPFRun exec6 = pCabecalhoInfo.createRun();
           exec5.setBold(true);
           exec5.setFontFamily("Times New Roman");
           exec5.setFontSize(9);
           exec5.addBreak();
           exec5.setText("  DISCIPLINA: " + disciplina);
           exec5.addBreak();
           exec5.setText("  PROFESSOR(A): " + professor);
           exec5.addBreak();
           exec5.setText("  CURSO:          ");
           exec5.setText(curso + "                             ");
           exec5.setText("PERIODO:  " + periodo + "            ");
           exec5.setText("TURNO:  " + turno);
           exec5.addBreak();
           exec5.setText("  DATA:_____________                                                    ");
           exec5.setText("TIPO: " + tipoProva);
           exec5.addBreak();
           exec5.setText("  ALUNO(A):___________________________________________________________");
           exec5.addBreak();
           exec6.setFontSize(4);
           exec6.setColor("ffffff");
           exec6.setText("diminuir");
           
           XWPFParagraph pBimestre = doc.createParagraph();
           pBimestre.setSpacingBetween(1);
           pBimestre.setAlignment(ParagraphAlignment.CENTER);
           XWPFRun exec7 = pBimestre.createRun();
           XWPFRun exec77 = pBimestre.createRun();
           XWPFRun exec777 = pBimestre.createRun();
           
           exec77.setFontSize(0);
           exec77.setColor("ffffff");
           exec77.setText("diminuir");
           exec7.setBold(true);
           exec7.setFontFamily("Times New Roman");
           exec7.setFontSize(9);
           exec7.addBreak();
           exec7.setText("AVALIAÇÃO -- " + bimestre + " BIMESTRE");
           exec7.addBreak();
           exec777.setFontSize(4);
           exec777.setColor("ffffff");
           exec777.setText("diminuir");
            
           XWPFParagraph pNormas = doc.createParagraph();
           pNormas.setSpacingBetween(1);
           pNormas.setAlignment(ParagraphAlignment.LEFT);
           pNormas.setBorderBottom(Borders.DOUBLE);
           pNormas.setBorderLeft(Borders.DOUBLE);
           pNormas.setBorderRight(Borders.DOUBLE);
           pNormas.setBorderTop(Borders.DOUBLE);
           
           XWPFRun exec8 = pNormas.createRun();
           XWPFRun exec9 = pNormas.createRun();
           XWPFRun exec10 = pNormas.createRun();
           XWPFRun exec11 = pNormas.createRun();
           XWPFRun exec12 = pNormas.createRun();
           XWPFRun exec13 = pNormas.createRun();
           XWPFRun exec14 = pNormas.createRun();
           exec8.setBold(true);
           exec8.setFontFamily("Times New Roman");
           exec8.setFontSize(9);
           exec8.addBreak();
           exec8.setText(" PARA RESPONDER, SIGA AS INSTRUÇÕES:");
           exec8.addBreak();
           exec8.addBreak();
           exec8.setText(" 1. Utilizar caneta esferográfica azul ou preta para preencher a FOLHA RESPOSTA.");
           exec8.addBreak();
           exec8.setText(" 2. Será atribuída nota “ZERO” ao aluno que utilizar meios ilícitos ou não autorizados pelo professor. (conforme   Regimento Institucional).");
           exec8.addBreak();
           exec8.setText(" 3. Não será permitido o uso de celulares para a realização de ");
           exec9.setBold(true);
           exec9.setFontFamily("Times New Roman");
           exec9.setFontSize(9);
           exec9.setUnderline(UnderlinePatterns.SINGLE);
           exec9.setText("Provas");
           exec10.setBold(true);
           exec10.setFontFamily("Times New Roman");
           exec10.setFontSize(9);
           exec10.setText(" em que houver ");
           exec11.setBold(true);
           exec11.setFontFamily("Times New Roman");
           exec11.setFontSize(9);
           exec11.setUnderline(UnderlinePatterns.SINGLE);
           exec11.setText("cálculos.");
           exec12.setBold(true);
           exec12.setFontFamily("Times New Roman");
           exec12.setFontSize(9);
           exec12.setText(" Permite-e-à somente o uso de ");
           exec13.setBold(true);
           exec13.setFontFamily("Times New Roman");
           exec13.setFontSize(9);
           exec13.setUnderline(UnderlinePatterns.SINGLE);
           exec13.setText("calculadora.");
           exec14.setBold(true);
           exec14.setFontFamily("Times New Roman");
           exec14.setFontSize(9);
           exec14.addBreak();
           exec14.setText(" 4. Caligrafia ilegível, assim como desorganização, rasuras excessivas e incoerências nas respostas poderá ocasionar   invalidação do item.");
           exec14.addBreak();
           exec14.setText(" 5. Nos itens de múltipla escolha, as opções rasuradas, inclusive por uso de corretivo, serão invalidadas.");
           exec14.addBreak();
           exec14.setText(" 6. Nos itens de múltipla escolha, as opções deverão ser registradas na FOLHA RESPOSTA, conforme modelo. Ex.: Item   01 – (A).");
           exec14.addBreak();
           exec14.setText(" 7. A FOLHA DE ITENS pode ser usada como “borrão”.");
           exec14.addBreak();
           exec14.setText(" 8. A FOLHA RESPOSTA deverá ser devolvida juntamente com a FOLHA DE ITENS.");
           exec14.addBreak();
           exec14.setText(" 9. TEMPO DE PROVA: 1h40min.");
           exec14.addBreak();
           exec14.addTab();
           exec14.addTab();
           exec14.addTab();
           exec14.addTab();
           exec14.addTab();
           exec14.addTab();
           exec14.addTab();
           exec14.addTab();
           exec14.addTab();
           exec14.addTab();
           exec14.addTab();
           exec14.setText("BOA PROVA!");
           
           DataQuestions ques;
           
            for (int j = 0; j < questoes.size(); j++) {
                ques = questoes.get(j);
                
                char[] letra = ques.enunciado.toCharArray();
                char[] letra2 = ques.alternativa1.textoAlternativa.toCharArray();
                char[] letra3 = ques.alternativa2.textoAlternativa.toCharArray();
                char[] letra4 = ques.alternativa3.textoAlternativa.toCharArray();
                char[] letra5 = ques.alternativa4.textoAlternativa.toCharArray();
                char[] letra6 = ques.alternativa5.textoAlternativa.toCharArray();
                
                if(j <10){
                    XWPFParagraph pQuestao1 = doc.createParagraph();
                    XWPFRun exec15 = pQuestao1.createRun();
                    exec15.addBreak();
                    exec15.setBold(true);
                    exec15.setFontFamily("Times New Roman");
                    exec15.setFontSize(9);
                    exec15.setText("EX_0" + (j+1)  + "   (Nota: " + ques.nota + ")");
                }else if(j >10){
                    XWPFParagraph pQuestao1 = doc.createParagraph();
                    XWPFRun exec15 = pQuestao1.createRun();
                    exec15.addBreak();
                    exec15.setBold(true);
                    exec15.setFontFamily("Times New Roman");
                    exec15.setFontSize(9);
                    exec15.setText("EX_" + (j+1)  + "   (Nota: " + ques.nota + ")");
                    exec15.addBreak();
                }
                //Escrevendo o enunciado
                XWPFParagraph pQuestaoTemp = doc.createParagraph();
                for(int i = 0; i < letra.length; i++){
                    String keyImg = "";
                    if(i+8 < letra.length){
                        for( int h=i;h<(i+8);h++){
                            keyImg += letra[h];
                        }
                    }
                    if(letra[i] == '\n'){
                        XWPFRun execTemp = pQuestaoTemp.createRun();
                        execTemp.setFontFamily("Times New Roman");
                        execTemp.setFontSize(9);
                        execTemp.addBreak();
                    }else if(letra[i] == '\t'){
                        XWPFRun execTemp = pQuestaoTemp.createRun();
                        execTemp.setFontFamily("Times New Roman");
                        execTemp.setFontSize(9);
                        execTemp.addTab();
                    }else if(keyImg.equals("<pImage>")){
                        XWPFRun execTemp = pQuestaoTemp.createRun();
                        pQuestaoTemp.setAlignment(ParagraphAlignment.LEFT);
                        execTemp.addBreak();
                        File arq = null;
                        arq = new File(ques.caminhoImagem);
                        InputStream in= new FileInputStream(arq);
                        float x = ImageConfig.alturaMaiorQueBase(arq);
                        execTemp.addPicture(in, XWPFDocument.PICTURE_TYPE_JPEG, arq.getName(), Units.toEMU(118.75f), Units.toEMU(118.75f*x));
                        execTemp.addBreak();
                        execTemp.addBreak();
                        i += 8;
                    }else if(keyImg.equals("<mImage>")){
                        XWPFRun execTemp = pQuestaoTemp.createRun();
                        pQuestaoTemp.setAlignment(ParagraphAlignment.LEFT);
                        execTemp.addBreak();
                        File arq = null;
                        arq = new File(ques.caminhoImagem);
                        InputStream in= new FileInputStream(arq);
                        float x = ImageConfig.alturaMaiorQueBase(arq);
                        execTemp.addPicture(in, XWPFDocument.PICTURE_TYPE_JPEG, arq.getName(), Units.toEMU(237.5f), Units.toEMU(237.5f*x));
                        execTemp.addBreak();
                        execTemp.addBreak();
                        i += 8;
                    }else if(keyImg.equals("<gImage>")){
                        XWPFRun execTemp = pQuestaoTemp.createRun();
                        pQuestaoTemp.setAlignment(ParagraphAlignment.LEFT);
                        execTemp.addBreak();
                        File arq = null;
                        arq = new File(ques.caminhoImagem);
                        InputStream in= new FileInputStream(arq);
                        float x = ImageConfig.alturaMaiorQueBase(arq);
                        execTemp.addPicture(in, XWPFDocument.PICTURE_TYPE_JPEG, arq.getName(), Units.toEMU(450f), Units.toEMU(450*x));
                        execTemp.addBreak();
                        execTemp.addBreak();
                        i += 8;
                    }else{
                        XWPFRun execTemp = pQuestaoTemp.createRun();
                        execTemp.setFontFamily("Times New Roman");
                        execTemp.setFontSize(9);
                        execTemp.setText("" + letra[i]);
                    }
                }
                    XWPFParagraph pQuestaoTemp1 = doc.createParagraph();
                    XWPFRun exec16 = pQuestaoTemp1.createRun();
                    exec16.addBreak();
                    //Escrevendo a alternativa A
                    if(letra2.length != 0){
                        exec16.setText("a) ");
                    }
                if(letra2.length != 0){
                    for(int l = 0; l < letra2.length; l ++){
                        switch (letra2[l]) {
                            case '\t':
                                exec16.addTab();
                                break;
                            case '\n':
                                exec16.addBreak();
                                break;
                            default:
                                exec16.setText("" + letra2[l]);
                                break;
                        }
                    }
                }
                if(letra3.length != 0){
                    exec16.addBreak();
                    exec16.setText("b) ");
                }
                    //Escrevendo a alternativa B
                if(letra3.length != 0){
                    for(int l = 0; l < letra3.length; l ++){
                        switch (letra3[l]) {
                            case '\t':
                                exec16.addTab();
                                break;
                            case '\n':
                                exec16.addBreak();
                                break;
                            default:
                                exec16.setText("" + letra3[l]);
                                break;
                        }
                    }
                }
                if(letra4.length != 0){
                    exec16.addBreak();
                    exec16.setText("c) ");
                }
                    //Escrevendo a alternativa C
                if(letra4.length != 0){
                    for(int l = 0; l < letra4.length; l ++){
                        switch (letra4[l]) {
                            case '\t':
                                exec16.addTab();
                                break;
                            case '\n':
                                exec16.addBreak();
                                break;
                            default:
                                exec16.setText("" + letra4[l]);
                                break;
                        }
                    }
                }
                if(letra5.length != 0){
                    exec16.addBreak();
                    exec16.setText("d) ");
                }
                    //Escrevendo a alternativa D
                if(letra5.length != 0){
                    for(int l = 0; l < letra5.length; l ++){
                        switch (letra5[l]) {
                            case '\t':
                                exec16.addTab();
                                break;
                            case '\n':
                                exec16.addBreak();
                                break;
                            default:
                                exec16.setText("" + letra5[l]);
                                break;
                        }
                    }
                }
                if(letra6.length != 0){
                    exec16.addBreak();
                    exec16.setText("e) ");
                }
                    //Escrevendo a alternativa E
                if(letra6.length != 0){
                    for(int l = 0; l < letra6.length; l ++){
                        switch (letra6[l]) {
                            case '\t':
                                exec16.addTab();
                                break;
                            case '\n':
                                exec16.addBreak();
                                break;
                            default:
                                exec16.setText("" + letra6[l]);
                                break;
                        }
                    }
                }
            }

            doc.write(docSaida);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(connectionWord_1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(connectionWord_1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(connectionWord_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void mostraProva(){
        POIFSFileSystem fs = null;
        
    }
}
