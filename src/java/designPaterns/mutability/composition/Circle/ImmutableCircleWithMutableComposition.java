package java.designPaterns.mutability.composition.Circle;


import java.designPaterns.mutability.nonComposition.Point;

/**
 * Immutable circle with composition of
 * mutable object.
 */
public final class ImmutableCircleWithMutableComposition {
    private final Point center;
    private final int radius;

    public ImmutableCircleWithMutableComposition() {
        center = new Point();
        radius = 0;
    }

    public ImmutableCircleWithMutableComposition(Point center, int radius) {
        this.center = new Point(center.getX(), center.getY());
        this.radius = radius;
    }

    public Point getPoint() {
        return new Point(this.center.getX(), this.center.getY());
    }


    public int getRadius() {
        return radius;
    }


    public String convertToString() {
        return "Center:" + center.convertToString() + "Radius" + radius;
    }
}
