package com.company.figures;

import java.awt.*;

public class Triangle {
    void draw(Graphics graphics) {
        graphics.drawLine(50,50,100,100);
        graphics.drawLine(100,100,50,150);
        graphics.drawLine(50,150,50,50);
    }

}
