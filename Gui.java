import javax.swing.*;
import java.awt.*;

class Gui{

    public static void main(String[] args)
    {
        // buttons
        JButton btnpoz = new JButton(" ||");
        JButton btnpre = new JButton(" <--");
        JButton btnnxt = new JButton(" -->");


        JFrame frame = new JFrame("music player");
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        
        JPanel panelMain = new JPanel();
        panelMain.setBackground(Color.RED);
        panelMain.setLayout(new BorderLayout(12,72));

        JPanel panelBtn = new JPanel();
        panelBtn.setLayout(new FlowLayout());

        panelBtn.add(btnpre);
        panelBtn.add(btnpoz);
        panelBtn.add(btnnxt);

        JLabel title = new JLabel("What U Wont Do For Love");
        panelMain.add(title,BorderLayout.NORTH);
        panelMain.add(panelBtn,BorderLayout.SOUTH);

        panel.add(panelMain,BorderLayout.CENTER);
        frame.add(panel,BorderLayout.CENTER);
        
        // JButton btnpoz = new JButton(" ||");
        // btnpoz.setBounds(100,100,100,100);
        // frame.add(btnpoz);



        frame.setVisible(true);
            
    }
}