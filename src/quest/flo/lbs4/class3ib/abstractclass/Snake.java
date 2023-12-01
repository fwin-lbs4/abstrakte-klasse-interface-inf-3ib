package quest.flo.lbs4.class3ib.abstractclass;

/**
 * Class to create a Snake, extends Animal.
 *
 * @author Florian.WINDISCH
 */
public class Snake extends Animal{
    /**
     * Constructor to create a snake.
     *
     * @param name Name of the snake.
     */
    public Snake(String name) {
        super(name, "hiss");
    }

    /**
     * Snakes cannot run, so the snake moves instead.
     *
     * @param x x-coordinate where the animal runs to.
     * @param y y-coordinate where the animal runs to.
     * @param z z-coordinate where the animal runs to.
     * @return The Point-Object after it has been updated.
     */
    @Override
    public Point run(float x, float y, float z) {
        System.out.println("Snakes cannot move fast...");

        return this.move(x, y, z);
    }
}
