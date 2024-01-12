import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
public class CreateFrameUsingAssociation {
    Frame frame;
    Label f_lbl,s_lbl;
    TextField f_txt,s_txt;
    Button btn;
    CreateFrameUsingAssociation(){
        frame=new Frame("Using Association");
        
        f_lbl=new Label("Enter First Name");
        f_lbl.setBounds(50,50,200,50);
        frame.add(f_lbl);
        
        f_txt = new TextField();
        f_txt.setBounds(50,100,200,50);
        frame.add(f_txt);
        
        s_lbl = new Label("Enter Last Name");
        s_lbl.setBounds(50,150,200,50);
        frame.add(s_lbl);
        
        s_txt = new TextField();
        s_txt.setBounds(50,200,200,50);
        frame.add(s_txt);
        
        btn = new Button("Just Button");
        btn.setBounds(50,260,100,40);
        frame.add(btn);
        
        frame.setTitle("Using Inheritance");
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
         new CreateFrameUsingAssociation();
    }
    
}

