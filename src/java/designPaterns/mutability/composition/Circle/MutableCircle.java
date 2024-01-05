package java.designPaterns.mutability.composition.Circle;


import java.designPaterns.mutability.nonComposition.Point;

/**
 * Mutable Circle
 */
public class MutableCircle {
    private Point center;
    private int radius;

    public MutableCircle() {
    }

    public MutableCircle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getPoint() {
        return center;
    }

    public void setPoint(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String convertToString() {
        return "Center:" + center.convertToString() + "Radius" + radius;
    }
}
