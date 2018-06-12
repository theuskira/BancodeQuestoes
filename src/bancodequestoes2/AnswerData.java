
package bancodequestoes2;

/**
 *
 * @author jacks
 */
public class AnswerData {
    
    public String textoAlternativa = "";
    public boolean estaCorreta = false;
    
    public AnswerData(String texto, boolean estaCorreta1){
        textoAlternativa = texto;
        estaCorreta = estaCorreta1;
    }
}
