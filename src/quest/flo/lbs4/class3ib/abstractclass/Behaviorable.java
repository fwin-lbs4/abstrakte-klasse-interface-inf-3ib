package quest.flo.lbs4.class3ib.abstractclass;

/**
 * Interface to add behavior to an animal.
 *
 * @author Florian.WINDISCH
 */
public interface Behaviorable {
    /**
     * Cause the animal to make a sound.
     */
    void animalSound();

    /**
     * Cause the animal to run to a point.
     *
     * @param x x-coordinate where the animal moves to.
     * @param y y-coordinate where the animal moves to.
     * @param z z-coordinate where the animal moves to.
     * @return The Point-Object after it has been updated.
     */
    Point run(float x, float y, float z);
}
