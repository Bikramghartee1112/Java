import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
public class SumAndSubIn3TextField implements ActionListener {
    JFrame frame;
    JTextField f_txt,s_txt,r_txt;
    JButton add_btn,sub_btn;
    SumAndSubIn3TextField(){
        frame = new JFrame("Calculation Sum and Sub");

        f_txt=new JTextField();
        f_txt.setBounds(50,50,200,40);
        frame.add(f_txt);

        s_txt=new JTextField();
        s_txt.setBounds(50,100,200,40);
        frame.add(s_txt);

        r_txt=new JTextField();
        r_txt.setBounds(50,150,200,40);
        frame.add(r_txt);

        add_btn=new JButton("+");
        add_btn.setBounds(50,200,80,40);
        add_btn.addActionListener(this);
        frame.add(add_btn);

        sub_btn=new JButton("-");
        sub_btn.setBounds(140,200,80,40);
        sub_btn.addActionListener(this);
        frame.add(sub_btn);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(f_txt.getText());
        int num2=Integer.parseInt(s_txt.getText());
        if(ae.getSource().equals(add_btn)){
            int sum=num1+num2;
            r_txt.setText(String.valueOf(sum));
        }
        if(ae.getSource().equals(sub_btn)){
            int sub=num1-num2;
            r_txt.setText(String.valueOf(sub));
        }
    }
    public static void main(String[] args) {
        new SumAndSubIn3TextField();
    }
}
