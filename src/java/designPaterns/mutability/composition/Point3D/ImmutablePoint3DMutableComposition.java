package java.designPaterns.mutability.composition.Point3D;


import java.designPaterns.mutability.nonComposition.Point;

/**
 * Immutable Point3D
 *
 * Point field refers to a mutable object.
 *  1. Never initialize such a field
 *      to a client-provided reference.
 *  2. Never return this field frp,
 *      an accessor (getter).
 *
 *      make deep copies, instead.
 */
public final class ImmutablePoint3DMutableComposition {
    private final Point point;
    private final int z;

    public ImmutablePoint3DMutableComposition() {
        point = new Point();
        z = 0;
    }

    public ImmutablePoint3DMutableComposition(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        return new Point(this.point.getX(), this.point.getY());
    }

    public int getZ() {
        return z;
    }

    public String convertToString() {
        return point.convertToString() + ", " + z;
    }
}
