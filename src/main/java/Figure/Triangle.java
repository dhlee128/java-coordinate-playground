package Figure;

import domain.Point;
import domain.Points;

public class Triangle implements Calculator {

    Points points;

    public Triangle(Points points) {
        this.points = points;
    }

    @Override
    public double calculate() {

        Point pointA = points.getPoint(0);
        Point pointB = points.getPoint(1);
        Point pointC = points.getPoint(2);

        double area = 0.5 * (
                pointA.getX() * (pointB.getY() - pointC.getY()) +
                        pointB.getX() * (pointC.getY() - pointA.getY()) +
                        pointC.getX() * (pointA.getY() - pointB.getY())
        );

        return Math.abs(area);

    }

}
