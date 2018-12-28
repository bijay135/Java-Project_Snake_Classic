package Snake_Classic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class StartGame implements ActionListener{
    JFrame f;
    JPanel p;
    JButton start,exit;
    public StartGame(){
        f = new JFrame(" Snake Classic ");
        p=new JPanel();
        p.setLayout(null);
        f.setSize(500,300);
        start = new JButton("Start Game");
        start.setBounds(200,70,100,20);
        start.addActionListener(this);
        exit = new JButton("Exit Game");
        exit.setBounds(200,120,100,20);
        exit.addActionListener(this);
        f.add(p);
        p.add(start);
        p.add(exit);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new StartGame();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == start){
            f.dispose();
            Frame.Start();
        }
        else if(e.getSource() == exit){
            System.exit(0);
        }
    }
}
