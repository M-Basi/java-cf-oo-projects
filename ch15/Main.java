package gr.aueb.excercises.OOP.ch15;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(3D);
        Point p2 = new Point2D(3D,6D);
        Point p3 = new Point3D(3D,6D,9D);

        System.out.println(PointUtil.distanceFromOrigin(p1));
        System.out.println(PointUtil.distanceFromOrigin(p2));
        System.out.println(PointUtil.distanceFromOrigin(p3));

    }
}
