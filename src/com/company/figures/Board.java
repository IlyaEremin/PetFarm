package com.company.figures;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board extends JComponent {

    private List<Circle> circleList = new ArrayList<>();

    private Circle circle = new Circle(50, 50);
    private Square square = new Square();
    private Triangle triangle = new Triangle();

    public Board() {
        circleList.add(new Circle(10, 10));
        circleList.add(new Circle(60, 100));
        circleList.add(new Circle(150, 20));
    }

    public void paint(Graphics g) {
        circle.draw(g);
        square.draw(g);
        triangle.draw(g);

        for (int i = 0; i < circleList.size(); i++) {
            Circle circleListItem = circleList.get(i);
            circleListItem.draw(g);
        }
    }
}