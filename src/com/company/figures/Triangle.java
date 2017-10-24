package com.company.figures;

import java.awt.*;


public class Triangle {

    private int[] xPoint;
    private int[] yPoint;
    private int nPoint;

    public Triangle(int x[], int y[], int n) {

        this.xPoint = x;
        this.yPoint = y;
        this.nPoint = n;

    }

    void draw(Graphics graphics) {
        graphics.drawPolygon(xPoint, yPoint, nPoint);

    }
}
