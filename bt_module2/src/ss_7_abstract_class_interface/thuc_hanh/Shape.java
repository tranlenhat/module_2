package ss_7_abstract_class_interface.thuc_hanh;

public class Shape {
    private String color = "green";
    private Boolean filled = true;

    public Shape() {
    }
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A shape with color of " +
                getColor() +
                "and" +
                (isFilled() ? "filled " : "not filled");
    }
}
