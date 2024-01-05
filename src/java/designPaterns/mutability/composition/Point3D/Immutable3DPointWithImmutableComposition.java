package java.designPaterns.mutability.composition.Point3D;


import java.designPaterns.mutability.nonComposition.ImmutablePoint;

/**
 * Immutable 3D point that contains an immutable Point composition.
 */
public final class Immutable3DPointWithImmutableComposition {
    private final ImmutablePoint point;
    private final int z;

    public Immutable3DPointWithImmutableComposition() {
        point = new ImmutablePoint();
        z = 0;
    }

    public Immutable3DPointWithImmutableComposition(ImmutablePoint point, int z) {
        this.point = point;
        this.z = z;
    }

    public ImmutablePoint getPoint() {
        return point;
    }

    public int getZ() {
        return z;
    }

    public String convertToString() {
        return point.convertToString() + ", " + z;
    }
}
