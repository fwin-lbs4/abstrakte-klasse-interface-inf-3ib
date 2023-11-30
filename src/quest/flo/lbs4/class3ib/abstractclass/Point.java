package quest.flo.lbs4.class3ib.abstractclass;

public class Point {
    private float x;
    private float y;
    private float z;

    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setPoints(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getPoint(String type) {
        switch (type) {
            case "y" -> {
                return this.y;
            }
            case "z" -> {
                return this.z;
            }
            default -> {
                return this.x;
            }
        }
    }

    public String toString() {
        return ("{x: " + this.x + ", y: " + this.y + ", z: " + this.z + "}");
    }
}
