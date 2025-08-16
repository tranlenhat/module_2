package ss_7_abstract_class_interface.bai_tap;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        IResizeable[] shapes = new IResizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4,6);
        shapes[2] = new Square(3);

        for(IResizeable shape : shapes){
            System.out.println("Befor size "+ shape);
            shape.resize(50);
            System.out.println("After size " + shape);
            System.out.println();
        }
    }

}
