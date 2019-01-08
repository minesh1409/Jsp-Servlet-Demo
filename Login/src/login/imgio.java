/**
 * Apr 5, 2017 9:09:05 PM
 */
package login;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class imgio {
	public static void main(String[] args) {
		 
		BufferedImage image = null;
        try {
		URL url =new URL("C://Users/ASUS/Desktop/pic/capture.jpg");
		image = ImageIO.read(url);

        ImageIO.write(image, "jpg",new File("f:\\out.jpg"));
        }
        catch (IOException e) {
        	e.printStackTrace();
        }
        System.out.println("Done");
	}

}
