package ols2307.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionProgram extends Frame implements ActionListener {
    Label lblAugend, lblAddend, lblSum;
    TextField txtAugend, txtAddend, txtSum;
    Button btnAdd, btnReset;

    AdditionProgram() {
        lblAugend = new Label("Augend");
        lblAugend.setBounds(100, 50, 50, 30);
        this.add(lblAugend);

        txtAugend = new TextField();
        txtAugend.setBounds(200, 50, 100, 30);
        this.add(txtAugend);

        lblAddend = new Label("Addend");
        lblAddend.setBounds(100, 100, 50, 30);
        this.add(lblAddend);

        txtAddend = new TextField();
        txtAddend.setBounds(200, 100, 100, 30);
        this.add(txtAddend);

        lblSum = new Label("Sum");
        lblSum.setBounds(100, 150, 50, 30);
        this.add(lblSum);

        txtSum = new TextField();
        txtSum.setBounds(200, 150, 100, 30);
        this.add(txtSum);

        btnAdd = new Button("Add");
        btnAdd.setBounds(100, 200, 50, 30);
        this.add(btnAdd);
        btnAdd.addActionListener(this);

        btnReset = new Button("Reset");
        btnReset.setBounds(200, 200, 50, 30);
        this.add(btnReset);
        btnReset.addActionListener(this);

        setBounds(10, 10, 450, 300);
        this.setLayout(null);
        this.setVisible(true);

        System.out.println("Frame running... press ^C to exit!");
    }

    public void actionPerformed(ActionEvent event) { // Event Handler
        if (event.getSource() == btnAdd) {
            int augend = Integer.parseInt(txtAugend.getText());
            int addend = Integer.parseInt(txtAddend.getText());
            int sum = augend + addend;
            txtSum.setText(Integer.toString(sum));
        } else {
            txtAugend.setText("");
            txtAddend.setText("");
            txtSum.setText("");
        }
    }

    public static void main(String[] args) {
        new AdditionProgram();
    }
}
