/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg215314060_uts_pbol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class MyCode extends JFrame implements ActionListener {

    JButton button;

    public static void main(String[] args) {
        MyCode mcd = new MyCode();
        mcd.setVisible(true);
    }

    public MyCode() {
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        getContentPane().setLayout(new FlowLayout());

        button = new JButton("MyButton");
        getContentPane().add(button);
        button.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        if (clickedButton == button) {
            String buttonText = clickedButton.getText();
            this.setTitle("You clicked " + buttonText);
            JOptionPane.showMessageDialog(this, "Tombol berhasil ditekan", "Pesan", JOptionPane.WARNING_MESSAGE);

        }
    }
}
