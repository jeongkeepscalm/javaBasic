package poly.ex4;

public class InterfaceMain {
    public static void main(String[] args) {

        InterfaceAnimal cat = new Cat();
        InterfaceAnimal dog = new Dog();
        InterfaceAnimal caw = new Caw();

        InterfaceAnimal[] interfaceAnimals = {cat, dog, caw};

        for (InterfaceAnimal interfaceAnimal : interfaceAnimals) {
            animalMethod(interfaceAnimal);
        }
    }

    public static void animalMethod(InterfaceAnimal interfaceAnimal) {
        interfaceAnimal.sound();
        interfaceAnimal.move();
    }
}
