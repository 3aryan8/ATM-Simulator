package com.gsv;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends JFrame {

    JLabel label1 ;

    Login() {
        // Creating major Frame
        // Setting title of the frame
        super("Bank Management System");

        // We don't need any default layout
        setLayout(null);
        int WIDTH = 850;
        int HEIGHT = 480;

        // Fetching Bank Image
        ImageIcon bank1 = new ImageIcon(Objects.requireNonNull(Login.class.getResource("/icon/bank.png")));
        // Scaling Image
        Image bank2 = bank1.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING);
        ImageIcon bank3 = new ImageIcon(bank2);

        // Creating a J-Label From the image
        JLabel bankLogo = new JLabel(bank3);
        // Setting boundaries of that JLabel
        bankLogo.setBounds((WIDTH -  100) / 2, 10, 100, 100);
        // adding JLabel
        add(bankLogo);


        // Fetching Card Image
        ImageIcon card1 = new ImageIcon(Objects.requireNonNull(Login.class.getResource("/icon/card.png")));
        // Scaling Image
        Image card2 = card1.getImage().getScaledInstance(90, 90, Image.SCALE_AREA_AVERAGING);
        ImageIcon card3 = new ImageIcon(card2);

        // Creating a J-Label From the card
        JLabel card = new JLabel(card3);
        // Setting boundaries of that JLabel
        card.setBounds(650, 355, 90, 90);
        // adding JLabel
        add(card);


        // Now We will Add Labels :
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font( "AvantGarde" , Font.BOLD , 38));
        label1.setBounds(230  , 125 , 450 , 48 );
        add(label1);


        // Adding background at the end.
        ImageIcon bg1 = new ImageIcon(Objects.requireNonNull(Login.class.getResource("/icon/backbg.png")));
        // Scaling background
        Image bg2 = bg1.getImage().getScaledInstance(850, 480, Image.SCALE_AREA_AVERAGING);
        ImageIcon bg3 = new ImageIcon(bg2);
        // Creating a J-Label From the card
        JLabel bg = new JLabel(bg3);
        // Setting boundaries of that JLabel
        bg.setBounds(0, 0, 850, 480);
        // adding JLabel
        add(bg);


        // Setting Dimensions of the frame
        setSize( WIDTH , HEIGHT );
        setLocation(450, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
