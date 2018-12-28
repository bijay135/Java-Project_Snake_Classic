package Snake_Classic;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JApplet;
import javax.swing.JFrame;
public class Frame extends JApplet implements KeyListener{
    @Override
    public void init() {
        setSize(540,540);
        Container cpane=getContentPane();
        cpane.add(snakePanel);
        addKeyListener(this);
    }
    public static void Start(){
        Frame my_Game=new Frame();
        JFrame myFrame=new JFrame(" Snake Classic ");
        myFrame.setSize(300,300);
        myFrame.getContentPane().add(my_Game);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.addKeyListener(my_Game);
        my_Game.init();
        my_Game.start();
        my_Game.setVisible(true);
        myFrame.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==UP) {
            snakePanel.set_Direction(1);
        } 
        else if (e.getKeyCode()==RIGHT) {
            snakePanel.set_Direction(2);
        } 
        else if(e.getKeyCode()==DOWN) {
            snakePanel.set_Direction(3);
        } 
        else if(e.getKeyCode()==LEFT) {
            snakePanel.set_Direction(4);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    private final int LEFT = 37;
    private final int RIGHT = 39;
    private final int UP = 38;
    private final int DOWN = 40;
    private Panel snakePanel=new Panel();
}