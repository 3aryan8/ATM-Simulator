package com.gsv;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends JFrame {

    Login (){
        // Creating major Frame

        // Setting title of the frame
        super( "Bank Management System");


        // Fetching Image
        ImageIcon i1 = new ImageIcon(Objects.requireNonNull(Login.class.getResource("/icon/bank.png")));
        // Scaling Image
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);


        // Setting Dimensions of the frame
        setSize(850 , 480);
        setLocation(450 , 200);
        setVisible(true);



    }
    public static void main(String[] args) {
        Login login = new Login();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
