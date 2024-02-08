import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MyComponent extends JComponent {
    Image frame;
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                try {
                    frame = ImageIO.read(new File("C:\\Users\\user\\Desktop\\Фото для Хогвартса\\grass-pattern-nature.jpeg"));
                    frame = frame.getScaledInstance(50,50,Image.SCALE_DEFAULT);
                    g2.drawImage(frame,j*50,i*50,getFocusCycleRootAncestor());
                }catch (IOException e){
                    e.printStackTrace();
                }
                
            }
            
        }
    }
    }

