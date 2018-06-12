
package bancodequestoes2;

import java.io.File;
import static java.io.FileDescriptor.out;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import static sun.misc.MessageUtils.out;

/**
 *
 * @author jacks
 */
public class connectionWord {
        
        public static void criarProva(){
            
             FileOutputStream out = null;
             XWPFDocument document = new XWPFDocument();
        
            try {
                out = new FileOutputStream(new File("C:\\Users\\jacks\\OneDrive\\Área de Trabalho\\teste.docx"));
                
                XWPFParagraph paragrafo = document.createParagraph();
                XWPFHeaderFooterPolicy cabeca = new XWPFHeaderFooterPolicy(document);
                XWPFRun exec = paragrafo.createRun();
                
                exec.addTab();
                exec.setText("Prova");
                exec.setBold(true);
                
                document.write(out);
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(connectionWord.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(connectionWord.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public static void main(String[] args) {
            criarProva();
         }
}
