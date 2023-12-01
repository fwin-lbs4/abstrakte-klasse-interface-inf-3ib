package quest.flo.lbs4.class3ib.abstractclass;

/**
 * Class to create an animal, extends Creature and implements Behaviorable.
 *
 * @author Florian.WINDISCH
 */
public abstract class Animal extends Creature implements Behaviorable {
    /**
     * The sound the animal can make.
     */
    private final String sound;

    /**
     * Constructor to create an animal.
     *
     * @param name  Name of the animal.
     * @param sound Sound the animal can make.
     */
    public Animal(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    /**
     * Cause the animal to move to a point.
     *
     * @param x x-coordinate where the animal moves to.
     * @param y y-coordinate where the animal moves to.
     * @param z z-coordinate where the animal moves to.
     * @return The Point-Object after it has been updated.
     */
    @Override
    public Point move(float x, float y, float z) {
        for (int i = 0; i <= 3; i++) {
            System.out.println("Moving...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error waiting: " + e.getMessage());
            }
        }

        return this.updatePosition(x, y, z);
    }

    /**
     * Print the sound the animal makes to the Console.
     */
    @Override
    public void animalSound() {
        System.out.println(this.sound + "...");
    }

    /**
     * Cause the animal to run to a point.
     *
     * @param x x-coordinate where the animal runs to.
     * @param y y-coordinate where the animal runs to.
     * @param z z-coordinate where the animal runs to.
     * @return The Point-Object after it has been updated.
     */
    @Override
    public Point run(float x, float y, float z) {
        System.out.println("Moving fast...");

        return this.updatePosition(x, y, z);
    }
}
