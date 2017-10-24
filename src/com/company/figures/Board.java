package com.company.figures;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import java.awt.*;
import java.awt.*;

public class Board extends JComponent {

    private List<Circle> circleList = new ArrayList<>();
    private List<Square> squaresList = new ArrayList<>();
    private List<Triangle> triangleList = new ArrayList<>();

    private Circle circle = new Circle(50, 50);
    private Square square = new Square(100, 100);
    private Triangle triangle = new Triangle(new int[]{200, 300, 350}, new int[]{400, 300, 400}, 3);

    public Board() {

        circleList.add(new Circle(60, 100));
        circleList.add(new Circle(150, 20));

        squaresList.add(new Square(200, 200));
        squaresList.add(new Square(400, 400));

        triangleList.add(new Triangle(new int[]{200, 320, 450}, new int[]{500, 320, 500}, 3));
        triangleList.add(new Triangle(new int[]{250, 350, 360}, new int[]{450, 350, 560}, 3));

    }

    public void paint(Graphics g) {
        circle.draw(g);
        square.draw(g);
        triangle.draw(g);

        for (int i = 0; i < circleList.size(); i++) {
            Circle circleListItem = circleList.get(i);
            circleListItem.draw(g);
        }
        for (int i = 0; i < squaresList.size(); i++) {
            Square squareListItem = squaresList.get(i);
            squareListItem.draw(g);
        }
        for (int i = 0; i < triangleList.size(); i++) {
            Triangle triangleListItem = triangleList.get(i);
            triangleListItem.draw(g);
        }
    }

}