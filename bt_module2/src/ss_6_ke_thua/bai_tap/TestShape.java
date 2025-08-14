package ss_6_ke_thua.bai_tap;

public class TestShape {
    public static void main(String[] args) {
        Cricle circle = new Cricle(2.5, "blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(2.5, "green", 5);
        System.out.println(cylinder);
    }
}
