package quest.flo.lbs4.class3ib.abstractclass;


public abstract class Animal extends Creature implements Behaviorable {
    private final String sound;

    public Animal(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    @Override
    public Point move(float x, float y, float z) throws InterruptedException {
        System.out.println("Starting-position: " + this.position);
        System.out.println("Moving...");
        this.position.setPoints(x, y, z);
        Thread.sleep(5000);
        System.out.println("Ending-position: " + this.position);
        return this.position;
    }

    @Override
    public void animalSound() {
        System.out.println(this.sound + "...");
    }

    @Override
    public Point run(float x, float y, float z) {
        System.out.println("Starting-position: " + this.position);
        System.out.println("Moving fast...");
        this.position.setPoints(x, y, z);
        System.out.println("Ending-position: " + this.position);
        return this.position;
    }
}
