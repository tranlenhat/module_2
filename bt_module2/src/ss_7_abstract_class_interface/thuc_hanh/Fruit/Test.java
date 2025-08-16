package ss_7_abstract_class_interface.thuc_hanh.Fruit;

public class Test {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit :fruits){
            System.out.println(fruit.howtoEat());
        }
    }
}
