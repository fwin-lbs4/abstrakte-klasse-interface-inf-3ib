package quest.flo.lbs4.class3ib.abstractclass;

public abstract class Creature {
    private String name;
    final Point position;

    public Creature(String name) {
        this.name = name;
        this.position = new Point(0, 0, 0);
    }

    private Point updatePosition(float x, float y, float z) {
        this.position.setPoints(x, y, z);
        return this.position;
    }

    public abstract Point move(float x, float y, float z) throws InterruptedException;
}
