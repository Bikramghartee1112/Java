import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
public class ChangeFontStyleExample implements ItemListener{
    JFrame frame;
    JTextField txt;
    JCheckBox c1,c2,c3;
    ChangeFontStyleExample(){
        frame = new JFrame("Style change");

        txt = new JTextField("Change My Font");
        txt.setBounds(50,50,200,50);
        frame.add(txt);

        c1 = new JCheckBox("Bold");
        c1.setBounds(50,110,80,40);
        c1.addItemListener(this);
        frame.add(c1);

        c2 = new JCheckBox("Italic");
        c2.setBounds(150,110,80,40);
        c2.addItemListener(this);
        frame.add(c2);

        c3 = new JCheckBox("Plain");
        c3.setBounds(250,110,80,40);
        c3.addItemListener(this);
        frame.add(c3);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource().equals(c1)){
            txt.setFont(new Font("Arial",Font.BOLD,16));
        }

        if(ie.getSource().equals(c2)){
            txt.setFont(new Font("Arial",Font.ITALIC,16));
        }
        if(ie.getSource().equals(c3)){
            txt.setFont(new Font("Arial",Font.PLAIN,16));
        }
    }
    public static void main(String[] args) {
        new ChangeFontStyleExample();
    }
}
