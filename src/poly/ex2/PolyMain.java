package poly.ex2;

public class PolyMain {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

        System.out.println("--------------");

        Animal[] animals = {cat, dog, caw};
        // iter
        for (Animal animal : animals) {
            animal.sound();
        }

    }

    public static void soundAnimal(Animal animal) {
        animal.sound();
    }

}
