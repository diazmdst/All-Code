/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg215314060_uts_pbol;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Container;

/**
 *
 * @author ASUS
 */
public class LoginForm extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 150;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int LABEL_WIDTH = 100;
    private static final int LABEL_HEIGHT = 70;
    private static final int FIELD_WIDTH = 210;
    private static final int FIELD_HEIGHT = 25;
    private static final int BUTTON_WIDTH = 100;
    private static final int BUTTON_HEIGHT = 25;

    JButton login;
    JLabel username, password;
    JTextField user, pass;

    public static void main(String[] args) {
        LoginForm log = new LoginForm();
        log.setVisible(true);
    }

    public LoginForm() {
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(true);
        setTitle("Login Form");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        contentPane.setLayout(null);
        component();
        setComponent();
        addComponent(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void component() {
        username = new JLabel("Username :");
        password = new JLabel("Password :");
        user = new JTextField();
        pass = new JTextField();
        login = new JButton("Login");
    }

    public void setComponent() {
        username.setBounds(20, 0, LABEL_WIDTH, LABEL_HEIGHT);
        user.setBounds(100, 22, FIELD_WIDTH, FIELD_HEIGHT);
        password.setBounds(330, 0, LABEL_WIDTH, LABEL_HEIGHT);
        pass.setBounds(410, 22, FIELD_WIDTH, FIELD_HEIGHT);
        login.setBounds(635, 22, BUTTON_WIDTH, BUTTON_HEIGHT);
        login.addActionListener(this);
    }
    
    public void addComponent(Container content) {
        content.add(username);
        content.add(user);
        content.add(password);
        content.add(pass);
        content.add(login);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        if (clickedButton == login) {
            String buttonText = clickedButton.getText();
            JOptionPane.showMessageDialog(this, "Anda berhasil login", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }
}
