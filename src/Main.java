import quest.flo.lbs4.class3ib.abstractclass.Animal;
import quest.flo.lbs4.class3ib.abstractclass.Point;
import quest.flo.lbs4.class3ib.abstractclass.Snake;
import quest.flo.lbs4.class3ib.abstractclass.Dog;

/**
 * Entrypoint-Class
 *
 * @author Florian.WINDISCH
 */
public class Main {
    /**
     * Standard-Constructor
     */
    public Main() {
    }

    /**
     * Entrypoint-Method
     *
     * @param args Args given to main.
     */
    public static void main(String[] args) {
        Animal[] animals = {new Snake("John"), new Dog("Fido")};

        for (Animal animal : animals) {
            animal.animalSound();

            // Initial position of the animal.
            Point position = animal.getPosition();

            System.out.println("Starting position: " + position.toString());
            position = animal.move(3, 3, 3);
            System.out.println("Ending position: " + position.toString());

            System.out.println("Starting position: " + position.toString());
            position = animal.run(5, 5, 5);
            System.out.println("Ending position: " + position.toString());
        }
    }
}
