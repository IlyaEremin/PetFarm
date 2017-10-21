package com.company.figures;

import java.awt.*;

public class Triangle {


    private int[] xPoint;
    private int[] yPoint;

    public Triangle(int x[], int y[] ) {

        this.xPoint  = x;
        this.yPoint = y;

    }

    void draw(Graphics graphics) {
        graphics.drawPolygon (xPoint, yPoint, 100);

    }
}
