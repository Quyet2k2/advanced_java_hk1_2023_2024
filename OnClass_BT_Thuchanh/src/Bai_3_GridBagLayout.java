
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;

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

    public Bai_3_GridBagLayout() {
        super("Nhập thông tin");
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        
        l1 = new Label("Họ Tên: ");
        l2 = new Label("Địa Chỉ: ");
        l3 = new Label("Năm Sinh: ");
        t1 = new TextField("1");
        t2 = new TextField("2");
        t3 = new TextField("3");
        b1 = new Button("Thêm");
        b2 = new Button("Sửa");
        b3 = new Button("Xóa");

        labels = new Label[]{l1, l2, l3};
        textFields = new TextField[]{t1, t2, t3};
        buttons = new Button[]{b1, b2, b3};
        
        int i = 0;
        for (Label label : labels) {
            this.add(label);
        }

    }

}
