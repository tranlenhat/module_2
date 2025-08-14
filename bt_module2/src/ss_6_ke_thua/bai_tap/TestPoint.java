package ss_6_ke_thua.bai_tap;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(2.5f, 3.5f);
        System.out.println("Point2D: " + p2d);

        Point3D p3d = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + p3d);

        p3d.setXYZ(5.0f, 6.0f, 7.0f);
        System.out.println("After setXYZ: " + p3d);
    }
}
