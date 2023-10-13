public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW(4, 250, Color.BLACK, "V14");
        bmw.speed(300);
        bmw.speed("bmw");

        Audi audi = new Audi(4, 250, Color.WHITE, "V7");
        audi.speed(300);
        audi.speed("audi");

        Audi audi1 = new Audi(4, 250, Color.GRAY, "V5");
        audi1.speed(300);
        audi1.speed("audi");

        System.out.println(bmw.getEngine());
        System.out.println(bmw.getMaxSpeed());
        System.out.println(bmw.getWheels());
        System.out.println(bmw.getColor());

        System.out.println(audi.getEngine());
        System.out.println(audi.getMaxSpeed());
        System.out.println(audi.getWheels());
        System.out.println(audi.getColor());

        System.out.println(audi1.getEngine());
        System.out.println(audi1.getMaxSpeed());
        System.out.println(audi1.getWheels());
        System.out.println(audi1.getColor());
    }
}