import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ConvertUpperCaseWithinClass implements ActionListener {
    JFrame frame;
    JLabel lbl;
    JButton btn;
    ConvertUpperCaseWithinClass(){
        frame = new JFrame("Converting Any String to Upper Case");
        
        lbl = new JLabel("please change me !!");
        lbl.setBounds(50,150,200,40);
        frame.add(lbl);
        
        btn = new JButton("Change me");
        btn.setBounds(240,150,150,40);
        frame.add(btn);
        btn.addActionListener(this);
        
        frame.setSize(500,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String str=lbl.getText();
        str=str.toUpperCase();
        lbl.setText(str);
    }
    public static void main(String[] args) {
         new ConvertUpperCaseWithinClass();
    }  
}

