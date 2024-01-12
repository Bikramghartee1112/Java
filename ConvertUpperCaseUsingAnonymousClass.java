import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ConvertUpperCaseUsingAnonymousClass {
    JFrame frame;
    JLabel lbl;
    JButton btn;
    ConvertUpperCaseUsingAnonymousClass(){
        frame = new JFrame("Converting Any String to Upper Case");
        
        lbl = new JLabel("please change me !!");
        lbl.setBounds(50,150,200,40);
        frame.add(lbl);
        
        btn = new JButton("Change me");
        btn.setBounds(240,150,150,40);
        frame.add(btn);
        btn.addActionListener(new ActionListener(){
//Event handle using Anonymous class which implements ActionListener interface anonymously
            // listen action by ActionListen and handle by overriding method
            @Override
            public void actionPerformed(ActionEvent ae){    
            String str=lbl.getText();
            str=str.toUpperCase();
            lbl.setText(str);
            }
        });
        
        frame.setSize(500,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ConvertUpperCaseUsingAnonymousClass();
   }  
}
