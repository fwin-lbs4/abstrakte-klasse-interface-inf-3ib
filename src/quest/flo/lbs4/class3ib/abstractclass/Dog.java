package quest.flo.lbs4.class3ib.abstractclass;

/**
 * Class to create a Dog, extends Animal.
 *
 * @author Florian.WINDISCH
 */
public class Dog extends Animal {
    /**
     * Constructor to create a dog.
     *
     * @param name Name of the dog.
     */
    public Dog(String name) {
        super(name, "bark");
    }
}
