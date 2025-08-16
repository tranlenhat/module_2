package ss_7_abstract_class_interface.thuc_hanh;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSoud());

            if(animal instanceof Chicken){
                IEdible iedible = (Chicken) animal;
                System.out.println(iedible.howtoEat());
            }
        }

    }
}
