package ss_5_static_modifier.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Bán kính c1: " + c1.getRadius());
        System.out.println("Diện tích c1: " + c1.getArea());

        Circle c2 = new Circle(5.0);
        System.out.println("Bán kính c2: " + c2.getRadius());
        System.out.println("Diện tích c2: " + c2.getArea());
    }
}
