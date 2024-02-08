import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    static int width = 800, height = 800;
    static JFrame jFrame = new JFrame();

    public static void main(String[] args) throws IOException {


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Трава");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dimension.width / 2 - width / 2,
                dimension.height / 2 - height / 2, width, height);
        BufferedImage grass = ImageIO.read(new File("C:\\Users\\user\\Desktop\\Фото для Хогвартса\\grass-pattern-nature.jpeg"));






        JButton jButton = new JButton("Button");
        jFrame.add(jButton);
        jFrame.add(new MyComponent());
        jFrame.setVisible(true);

    }
     static class MyComponent extends JComponent {
        Image frame;
        @Override
        protected void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
            Font font = new Font("Ani",Font.BOLD,20);
            g2.setFont(font);
            g2.drawString("Трава",50,50);
            Line2D l2 = new Li
//            for (int i = 0; i < 16; i++) {
//                for (int j = 0; j < 16; j++) {
//                    try {
//                        frame = ImageIO.read(new File("C:\\Users\\user\\Desktop\\Фото для Хогвартса\\grass-pattern-nature.jpeg"));
//                        frame = frame.getScaledInstance(50,50,Image.SCALE_DEFAULT);
//                        g2.drawImage(frame,j*50,i*50,getFocusCycleRootAncestor());
//                    }catch (IOException e){
//                        e.printStackTrace();
//                    }
//
//                }
//
//            }
        }
    }


}