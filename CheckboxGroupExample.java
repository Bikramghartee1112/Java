import java.awt.Frame;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
public class CheckboxGroupExample extends WindowAdapter implements ItemListener {
    Frame frame;
    Checkbox c1,c2,c3;
    Label lbl;
    CheckboxGroupExample(){
        frame = new Frame("CheckboxGroup Example");
        CheckboxGroup cbg = new CheckboxGroup();

        lbl = new Label();
        lbl.setBounds(50,50,150,40);
        frame.add(lbl);

        c1 = new Checkbox("Male",true,cbg);
        c1.setBounds(50,110,80,30);
        c1.addItemListener(this);
        frame.add(c1);

        c2 = new Checkbox("Female",true,cbg);
        c2.setBounds(150,110,80,30);
        c2.addItemListener(this);
        frame.add(c2);

        c3 = new Checkbox("Other",true,cbg);
        c3.setBounds(250,110,80,30);
        c3.addItemListener(this);
        frame.add(c3);

        frame.addWindowListener(this);
        frame.setSize(350,170);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }

    @Override
    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource().equals(c1)){
            lbl.setText("Gender: "+c1.getLabel());
        }
        if(ie.getSource().equals(c2)){
            lbl.setText("Gender: "+c2.getLabel());
        }
        if(ie.getSource().equals(c3)){
            lbl.setText("Gender: "+c3.getLabel());
        }
    }
    public static void main(String[] args) {
        new CheckboxGroupExample();
    }
}
