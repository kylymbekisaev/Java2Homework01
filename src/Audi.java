public final class Audi extends BMW {
    int wheels;
    int maxSpeed;

    public Audi(int wheels, int speed, Color color, String engine) {
        super(wheels, speed, color, engine);
    }

    @Override
    public void speed(int number) {
        System.out.println(300);
    }

    Color color;
    String engine;
}
