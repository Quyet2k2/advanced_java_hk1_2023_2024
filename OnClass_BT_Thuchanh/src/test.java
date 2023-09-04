
import java.awt.*;
import java.awt.event.*;

public class test extends Frame implements ItemListener {

    Checkbox checkBox1, checkBox2;

    public test() {
        setLayout(new FlowLayout());

        checkBox1 = new Checkbox("Option 1");
        checkBox2 = new Checkbox("Option 2");

        add(checkBox1);
        add(checkBox2);

        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);

        setSize(300, 150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        Checkbox source = (Checkbox) e.getSource();

        if (source == checkBox1) {
            if (source.getState()) {
                System.out.println("Checkbox 1 selected.");
            } else {
                System.out.println("Checkbox 1 deselected.");
            }
        } else if (source == checkBox2) {
            if (source.getState()) {
                System.out.println("Checkbox 2 selected.");
            } else {
                System.out.println("Checkbox 2 deselected.");
            }
        }
    }

    public static void main(String[] args) {
        new test();
    }
}
