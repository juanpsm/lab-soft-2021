package p8.e1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Aplicacion {

    private JPanel mainPanel;
    private JLabel imgLabel;

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Aplicacion");
        Aplicacion app =  new Aplicacion();
        JPanel p = new JPanel();
        app.createUIComponents();
        p.add(app.imgLabel);
//        String t = java.time.LocalTime.now();
        JLabel timeLabel = new JLabel();
        timeLabel.setText("<html><h1>"+getTime()+"</h1></html>");
        timeLabel.setBounds(800, 300, 400, 200);
        frame.add(timeLabel);
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        while (true) {
            TimeUnit.SECONDS.sleep(1);
            timeLabel.setText("<html><h1>"+getTime()+"</h1></html>");
        }
    }
    
    private static String getTime() {
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    	String t = java.time.LocalTime.now().format(dtf).toString();
    	System.out.println("Time is: " + t);
    	return t;
    }

    private void createUIComponents() {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File("src/p8/e1/naruto_wallp.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        imgLabel = new JLabel(new ImageIcon(bufferedImage));
    }
}
