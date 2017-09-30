package com.company.figures;

import java.awt.*;

public class Circle {

    private int x;
    private int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void draw(Graphics graphics) {
        graphics.drawOval(x, y, 100, 100);
    }
}
