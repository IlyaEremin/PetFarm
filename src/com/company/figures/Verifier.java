package com.company.figures;

import javax.swing.*;

public class Verifier {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new Board());
        window.setVisible(true);
    }
}