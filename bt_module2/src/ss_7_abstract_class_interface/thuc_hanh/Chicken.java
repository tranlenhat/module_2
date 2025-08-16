package ss_7_abstract_class_interface.thuc_hanh;

public class Chicken extends Animal implements IEdible{
    @Override
    public String makeSoud() {
        return "Chicken : Chip Chip";
    }

    @Override
    public String howtoEat() {
        return "Cloud be fried";
    }
}
