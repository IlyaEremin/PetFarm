package com.company.figures;

        import java.awt.*;

public class Square {

    private int x;
    private int y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void draw(Graphics graphics) {
        graphics.drawRect(x, y, 100, 100);
    }
}



