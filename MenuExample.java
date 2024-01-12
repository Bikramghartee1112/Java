import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class MenuExample {
    JFrame frame;
    JMenuBar menubar;
    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;
    MenuExample(){
        frame = new JFrame("Menu Example");
        menubar = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Soft Drink");

        i1 = new JMenuItem("Mo:Mo");
        i2 = new JMenuItem("Chawmin");
        i3 = new JMenuItem("Pizza");
        i4 = new JMenuItem("Tea");
        i5 = new JMenuItem("Coffee");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(submenu);

        submenu.add(i4);
        submenu.add(i5);

        menubar.add(menu);
        frame.setJMenuBar(menubar);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuExample();
    }
}
