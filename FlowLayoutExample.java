import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class FlowLayoutExample {
    JButton b[];
    FlowLayoutExample(){
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setBounds(500,150,400,300);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        b=new JButton[40];
        for(int i=0;i<40;i++){
            b[i]=new JButton(""+(i+1));
            frame.add(b[i]);
        }
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
