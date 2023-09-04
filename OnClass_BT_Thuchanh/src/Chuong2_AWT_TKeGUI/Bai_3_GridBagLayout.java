package Chuong2_AWT_TKeGUI;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author quyet
 */
public class Bai_3_GridBagLayout extends Frame {
    
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3;
    
    Label[] labels;
    TextField[] textFields;
    Button[] buttons;
    Object[] objects;
    
    public Bai_3_GridBagLayout() {
        super("Nhập thông tin");
        this.setLayout(new GridBagLayout());
        Font font = new Font("Arial", Font.PLAIN, 16);
        this.setFont(font);
        
        GridBagConstraints gbc = new GridBagConstraints();
        Insets insets = new Insets(20, 0, 0, 0); // (top, left, bottom, right)

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        
        Panel p = new Panel();
        p.setLayout(new GridLayout(3, 2));
        p.setPreferredSize(new Dimension(300, 100));
        this.add(p, gbc);
        
        Panel p2 = new Panel();
        FlowLayout f1 = new FlowLayout();
        f1.setAlignment(f1.CENTER);
        p2.setLayout(f1);
        p2.setPreferredSize(new Dimension(300, 40));
        gbc.gridy = 1;
        gbc.insets = insets;
        
        this.add(p2, gbc);
        
        l1 = new Label("Họ Tên: ");
        l2 = new Label("Địa Chỉ: ");
        l3 = new Label("Năm Sinh: ");
        t1 = new TextField("");
        t2 = new TextField("");
        t3 = new TextField("");
        b1 = new Button("Thêm");
        b2 = new Button("Sửa");
        b3 = new Button("Xóa");
        
        labels = new Label[]{l1, l2, l3};
        textFields = new TextField[]{t1, t2, t3};
        buttons = new Button[]{b1, b2, b3};
        
        int i = 0;
        for (Label label : labels) {
            p.add(label);
            p.add(textFields[i]);
            i++;
        }
        
        for (Button button : buttons) {
            p2.add(button);
        }
        
        this.pack();
    }
    
    public static void main(String[] args) {
        Bai_3_GridBagLayout bai_3_GridBagLayout = new Bai_3_GridBagLayout();
        bai_3_GridBagLayout.setVisible(true);
        bai_3_GridBagLayout.setLocationRelativeTo(null);
        
        bai_3_GridBagLayout.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
}
