package com.company.figures;

import javax.swing.*;
import java.awt.*;

public class Board extends JComponent {

    private Circle circle = new Circle();
    private Square square = new Square();
    private Triangle triangle = new Triangle();

    public void paint(Graphics g) {
        circle.draw(g);
    }
}
