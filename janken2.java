import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class janken2 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Janken");
        frame.setSize(600,500);
        frame.setResizable(false);
        frame.setLayout(null);

        ImageIcon Scissors = new ImageIcon("scissors.jpg");
        ImageIcon Hammer = new ImageIcon("hammer.png");
        ImageIcon Paper = new ImageIcon("paper.png");
        
        JLabel label = new JLabel();
        label.setBounds(210, 20, 150, 150);
        frame.add(label);

        JButton button1 = new JButton();
        button1.setBounds(30, 240, 150, 150);
        button1.setIcon(Scissors);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                label.setIcon(Hammer);
            }
        });
        frame.add(button1);

        JButton button2 = new JButton();
        button2.setBounds(210, 240, 150, 150);
        button2.setIcon(Paper);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                label.setIcon(Scissors);
            }
        });
        frame.add(button2);

        JButton button3 = new JButton();
        button3.setBounds(390, 240, 150, 150);
        button3.setIcon(Hammer);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                label.setIcon(Paper);
            }
        });
        frame.add(button3);

        //Display Color Background
        JLabel label2 = new JLabel();
        label2.setBounds(0,0,600,500);
        label2.setBackground(Color.blue);
        label2.setOpaque(true);
        frame.add(label2);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
