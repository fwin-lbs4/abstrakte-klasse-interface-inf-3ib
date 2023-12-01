package quest.flo.lbs4.class3ib.abstractclass;

/**
 * Class to create a Point.
 *
 * @author Florian.WINDISCH
 */
public class Point {
    /**
     * The x-coordinate.
     */
    private float x;
    /**
     * The y-coordinate.
     */
    private float y;
    /**
     * The z-coordinate.
     */
    private float z;

    /**
     * Constructor to create a Point.
     *
     * @param x set the initial x-coordinate to the given value.
     * @param y set the initial y-coordinate to the given value.
     * @param z set the initial z-coordinate to the given value.
     */
    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Update the internal coordinates.
     *
     * @param x set the x-coordinate to the given value.
     * @param y set the y-coordinate to the given value.
     * @param z set the z-coordinate to the given value.
     */
    public void setPoints(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Get a String-representation of the current coordinates.
     *
     * @return String-representation of the current coordinates.
     */
    public String toString() {
        return ("{x: " + this.x + ", y: " + this.y + ", z: " + this.z + "}");
    }
}
