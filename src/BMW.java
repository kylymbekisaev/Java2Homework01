public class BMW extends Car{

    public BMW(int wheels, int speed, Color color, String engine) {
        super(wheels, speed, color, engine);
    }


    public void speed(int number) {
        System.out.println("this car speed - " + number);
    }
    public final void speed(String name) {
        System.out.println("this car name - " + name);
    }


}
