import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
public class GridLayoutExample {
    JFrame frame;
    JButton[] b;
    GridLayoutExample(){
        frame = new JFrame("GridLayout Example");
        frame.setBounds(500,150,400,300);
        frame.setLayout(new GridLayout(2,3,10,10));
        b=new JButton[6];
        for(int i=0; i<6; i++){
            b[i]=new JButton("Button"+(i+1));
            frame.add(b[i]);
        }
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
