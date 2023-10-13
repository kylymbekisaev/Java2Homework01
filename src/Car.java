public class Car {
    int wheels;
    int maxSpeed;

    public Car() {
    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Color getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }


    public Car(int wheels, int maxSpeed, Color color, String engine) {
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.engine = engine;
    }

    Color color;

    String engine;

}
