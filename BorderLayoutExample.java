import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
public class BorderLayoutExample {
    JFrame frame;
    JButton b1,b2,b3,b4,b5;
    BorderLayoutExample(){
        frame = new JFrame("BorderLayout Example");
        frame.setBounds(500,150,400,300);
        frame.setLayout(new BorderLayout(10,10));

        b1 = new JButton("NORTH");
        frame.add(b1,BorderLayout.NORTH);
        b2 = new JButton("SOUTH");
        frame.add(b2,BorderLayout.SOUTH);
        b3 = new JButton("EAST");
        frame.add(b3,BorderLayout.EAST);
        b4 = new JButton("WEST");
        frame.add(b4,BorderLayout.WEST);
        b5 = new JButton("CENTER");
        frame.add(b5,BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
