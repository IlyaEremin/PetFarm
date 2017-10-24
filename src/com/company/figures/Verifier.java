package com.company.figures;

import javax.swing.*;

public class Verifier {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 700, 700);

        Board board = new Board();
        window.getContentPane().add(board);
        window.setVisible(true);
    }
}
