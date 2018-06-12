
package bancodequestoes2;

import java.io.File;
import javax.swing.ImageIcon;


/**
 *
 * @author jacks
 */
public class ImageConfig {
    
    public static float alturaMaiorQueBase(File img){
        ImageIcon foto = new ImageIcon(img.getPath());
        float altura = foto.getIconHeight();
        float base = foto.getIconWidth();
        
        float x = altura/base;
        return x;
    }
}
