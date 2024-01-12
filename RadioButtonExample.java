import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.FlowLayout;
public class RadioButtonExample implements ItemListener {
    JFrame frame;
    JTextField txt;
    JRadioButton bold_btn,italic_btn,plain_btn,bolditalic_btn;
    RadioButtonExample(){
        frame = new JFrame("RadioButton Example");
        txt = new JTextField("please write something and change the font style");
        txt.setFont(new Font("Calibri Light",Font.PLAIN,14));
        frame.add(txt);

        bold_btn = new JRadioButton("Bold");
        bold_btn.addItemListener(this);
        frame.add(bold_btn);
        italic_btn = new JRadioButton("Italic");
        italic_btn.addItemListener(this);
        frame.add(italic_btn);
        plain_btn = new JRadioButton("Plain");
        plain_btn.addItemListener(this);
        frame.add(plain_btn);
        bolditalic_btn = new JRadioButton("Bold & Italic");
        bolditalic_btn.addItemListener(this);
        frame.add(bolditalic_btn);

        ButtonGroup gb = new ButtonGroup();
        gb.add(bold_btn);
        gb.add(italic_btn);
        gb.add(plain_btn);
        gb.add(bolditalic_btn);

        frame.setSize(410,180);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie){
        Font font = null;
        if(bolditalic_btn.isSelected()){
            font=new Font("serif",Font.BOLD+Font.ITALIC,14);
        }
        else if(bold_btn.isSelected()){
            font=new Font("serif",Font.BOLD,14);
        }
        else if(italic_btn.isSelected()){
            font=new Font("serif",Font.ITALIC,14);
        }
        else if(plain_btn.isSelected()){
            font=new Font("Times New Roman",Font.PLAIN,14);
        }
        else{
            font=new Font("Calibri Light",Font.PLAIN,14);
        }
        txt.setFont(font);
    }
    public static void main(String[] args) {
        new RadioButtonExample();
    }
}
