package java.designPaterns.mutability.composition.Circle;


import java.designPaterns.mutability.nonComposition.ImmutablePoint;

/**
 * Immutable circle containing on
 * immutable point at center.
 */
public final class ImutableCircleWithImutableComposition {
    private final ImmutablePoint center;
    private final int radius;

    public ImutableCircleWithImutableComposition() {
        center = new ImmutablePoint();
        radius = 0;
    }

    public ImutableCircleWithImutableComposition(ImmutablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public ImmutablePoint getPoint() {
        return center;
    }


    public int getRadius() {
        return radius;
    }


    public String convertToString() {
        return "Center:" + center.convertToString() + "Radius" + radius;
    }
}
