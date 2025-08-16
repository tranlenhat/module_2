package ss_7_abstract_class_interface.thuc_hanh;

public class Circle extends Shape {
    private Double radius = 1.0;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, Double radius) {
        super(color, filled);
        this.radius = radius;
    }
}
