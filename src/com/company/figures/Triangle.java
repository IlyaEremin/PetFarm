package com.company.figures;

import java.awt.*;

public class Triangle {

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public Triangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    void draw(Graphics graphics) {
        graphics.drawLine(x1, y1, x2, y2);
    }
}

