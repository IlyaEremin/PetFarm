package com.company.figures;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board extends JComponent {

    private List<Circle> circleList = new ArrayList<>();
    private List<Square> squaresList = new ArrayList<>();
    private List<Triangle> triangleList = new ArrayList<>();

    private Circle circle = new Circle(50, 50);
    private Square square = new Square(100, 100);
    private Triangle triangle = new Triangle(150, 150, 200, 250);


    public Board() {
        circleList.add(new Circle(10, 10));
        circleList.add(new Circle(60, 100));
        circleList.add(new Circle(150, 20));
        squaresList.add(new Square(100, 100));
        squaresList.add(new Square(200, 200));
        squaresList.add(new Square(400, 400));
        triangleList.add(new Triangle(200, 250, 80, 250));
        triangleList.add(new Triangle(80, 250, 150, 150));
        triangleList.add(new Triangle(300, 300, 400, 400));
        triangleList.add(new Triangle(400, 400, 150, 400));
        triangleList.add(new Triangle(150, 400, 300, 300));
        triangleList.add(new Triangle(380, 80, 200, 80));
        triangleList.add(new Triangle(200, 80, 300, 200));
        triangleList.add(new Triangle(300, 200, 380, 80));
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