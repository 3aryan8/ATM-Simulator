package com.gsv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel L_Welcome , L_CardNumber , L_Pin;
    JTextField T_CardNumber ;
    JPasswordField P_Pin;
    JButton B_SignIn , B_Clear , B_SignUp;

    Login() {
        super("Bank Management System");
        setLayout(null);
        int WIDTH = 900;
        int HEIGHT = 540;

        // Fetching Bank Image
        ImageIcon bank1 = new ImageIcon(Objects.requireNonNull(Login.class.getResource("/icon/bank.png")));
        // Scaling Image
        Image bank2 = bank1.getImage().getScaledInstance(120, 120, Image.SCALE_AREA_AVERAGING);
        ImageIcon bank3 = new ImageIcon(bank2);

        // Creating and centering JLabel for the bank icon
        JLabel bankLogo = new JLabel(bank3);
        bankLogo.setBounds((WIDTH - 120) / 2, 20, 120, 120);
        add(bankLogo);

        // Fetching Card Image
        ImageIcon card1 = new ImageIcon(Objects.requireNonNull(Login.class.getResource("/icon/card.png")));
        Image card2 = card1.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING);
        ImageIcon card3 = new ImageIcon(card2);

        JLabel card = new JLabel(card3);
        card.setBounds(720, 410, 100, 100);
        add(card);

        // Labels
        L_Welcome = new JLabel("WELCOME TO ATM");
        L_Welcome.setForeground(Color.WHITE);
        L_Welcome.setFont(new Font("AvantGarde", Font.BOLD, 44));
        L_Welcome.setBounds(220, 155, 500, 55);
        add(L_Welcome);

        L_CardNumber = new JLabel("Card No:");
        L_CardNumber.setForeground(Color.WHITE);
        L_CardNumber.setFont(new Font("Raleway", Font.BOLD, 28));
        L_CardNumber.setBounds(180, 235, 140, 38);
        add(L_CardNumber);

        T_CardNumber = new JTextField(15); // Ensures only 15 digits are entered
        T_CardNumber.setBounds(350, 235, 340, 38);
        T_CardNumber.setFont(new Font("Arial", Font.BOLD, 18));
        add(T_CardNumber);

        L_Pin = new JLabel("PIN:");
        L_Pin.setForeground(Color.WHITE);
        L_Pin.setFont(new Font("Raleway", Font.BOLD, 28));
        L_Pin.setBounds(180, 295, 140, 38);
        add(L_Pin);

        P_Pin = new JPasswordField(6);
        P_Pin.setFont(new Font("Arial", Font.BOLD, 18));
        P_Pin.setBounds(350, 295, 340, 38);
        add(P_Pin);

        B_SignIn = new JButton("SIGN IN");
        B_SignIn.setBackground(Color.BLACK);
        B_SignIn.setForeground(Color.WHITE);
        B_SignIn.setFont(new Font("Arial", Font.BOLD, 18));
        B_SignIn.setBounds(290, 360, 120, 40);
        B_SignIn.addActionListener(this);
        add(B_SignIn);

        B_SignUp = new JButton("SIGN UP");
        B_SignUp.setBackground(Color.BLACK);
        B_SignUp.setForeground(Color.WHITE);
        B_SignUp.setFont(new Font("Arial", Font.BOLD, 18));
        B_SignUp.setBounds(450, 360, 120, 40);
        B_SignUp.addActionListener(this);
        add(B_SignUp);

        B_Clear = new JButton("CLEAR");
        B_Clear.setBackground(Color.BLACK);
        B_Clear.setForeground(Color.WHITE);
        B_Clear.setFont(new Font("Arial", Font.BOLD, 18));
        B_Clear.setBounds(290, 415, 280, 40);
        B_Clear.addActionListener(this);
        add(B_Clear);

        // Adding background at the end.
        ImageIcon bg1 = new ImageIcon(Objects.requireNonNull(Login.class.getResource("/icon/backbg.png")));
        Image bg2 = bg1.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_AREA_AVERAGING);
        ImageIcon bg3 = new ImageIcon(bg2);
        JLabel bg = new JLabel(bg3);
        bg.setBounds(0, 0, WIDTH, HEIGHT);
        add(bg);

        setSize(WIDTH, HEIGHT);
        setLocation(420, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        try {

            if (e.getSource() == B_SignIn) {

            }else if ( e.getSource() == B_Clear) {
                actionB_clear();

            } else if (e.getSource() == B_SignUp) {

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    private void actionB_clear () {
        T_CardNumber.setText("");
        P_Pin.setText("");
    }
}
