/**
 * The {@code ImmutablePoint} class represents an immutable point in a 2D coordinate system.
 * Instances of this class cannot be modified after creation, making them thread-safe.
 */
package java.designPaterns.mutability.nonComposition;

/**
 * The {@code ImmutablePoint} class is a final class representing a point with immutable coordinates.
 */
public final class ImmutablePoint {

    /**
     * The x-coordinate of the point.
     */
    private final int x;

    /**
     * The y-coordinate of the point.
     */
    private final int y;

    /**
     * Constructs an {@code ImmutablePoint} with default coordinates (0, 0).
     */
    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

    /**
     * Constructs an {@code ImmutablePoint} with specified coordinates.
     *
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     */
    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate of the point.
     *
     * @return The x-coordinate of the point.
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y-coordinate of the point.
     *
     * @return The y-coordinate of the point.
     */
    public int getY() {
        return y;
    }
    public String convertToString() {
        return "Point{"+"x="+x+", y="+y + "}";
    }
}
