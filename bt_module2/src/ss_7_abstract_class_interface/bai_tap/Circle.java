package ss_7_abstract_class_interface.bai_tap;

public class Circle implements IResizeable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
