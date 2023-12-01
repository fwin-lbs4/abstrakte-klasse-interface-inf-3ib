package quest.flo.lbs4.class3ib.abstractclass;

/**
 * Class to create a Creature.
 *
 * @author Florian.WINDISCH
 */
public abstract class Creature {
    /**
     * The name of the creature.
     */
    private String name;

    /**
     * The Point-object of the current position of the creature.
     */
    protected final Point position;

    /**
     * Constructor to create a creature.
     *
     * @param name The name of the creature.
     */
    public Creature(String name) {
        this.name = name;
        this.position = new Point(0, 0, 0);
    }

    /**
     * Update the position of the creature.
     *
     * @param x new x-coordinate of the creature.
     * @param y new y-coordinate of the creature.
     * @param z new z-coordinate of the creature.
     * @return The updated position of the creature.
     */
    protected Point updatePosition(float x, float y, float z) {
        this.position.setPoints(x, y, z);
        return this.position;
    }

    /**
     * Move the creature to new coordinates.
     *
     * @param x new x-coordinate of the creature.
     * @param y new y-coordinate of the creature.
     * @param z new z-coordinate of the creature.
     * @return The updated position of the creature.
     */
    public abstract Point move(float x, float y, float z);

    /**
     * Get the name of the creature.
     *
     * @return Name of the creature.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the creature.
     *
     * @param name New name of the creature.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the current position as a Point-object.
     *
     * @return Point-object of the current position.
     */
    public Point getPosition() {
        return this.position;
    }
}
