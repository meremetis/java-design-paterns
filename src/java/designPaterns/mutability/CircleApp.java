package java.designPaterns.mutability;


import java.designPaterns.mutability.composition.Circle.ImmutableCircleWithMutableComposition;
import java.designPaterns.mutability.composition.Circle.ImutableCircleWithImutableComposition;
import java.designPaterns.mutability.composition.Circle.MutableCircle;
import java.designPaterns.mutability.nonComposition.ImmutablePoint;
import java.designPaterns.mutability.nonComposition.Point;

public class CircleApp {
    public static void main(String[] args) {
        Point center1 = new Point(1,2);
        ImmutablePoint center2 = new ImmutablePoint(4,5);

        MutableCircle circle = new MutableCircle(center1, 5);

        ImmutableCircleWithMutableComposition circle2 = new ImmutableCircleWithMutableComposition(center1, 10);
        ImutableCircleWithImutableComposition circle3 = new ImutableCircleWithImutableComposition(center2, 20);

        System.out.println(circle.convertToString());
        System.out.println(circle2.convertToString());
        System.out.println(circle3.convertToString());
    }
}
