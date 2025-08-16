package ss_7_abstract_class_interface.bai_tap;

public class Square implements IResizeable,IColorable{
    private double slide;

    public Square(double slide) {
        this.slide = slide;
    }
    public double getArea() {
        return slide * slide;
    }

    @Override
    public void resize(double percent) {
        slide += slide *percent /100;
    }


    @Override
    public String toString() {
        return "Square{" +
                "slide=" + slide +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
