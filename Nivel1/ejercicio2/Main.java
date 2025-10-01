package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Car auto = new Car(230);
        Car auto2 = new Car(300);
        Car auto3 = new Car(350);

        System.out.println(auto + auto.toSpeed());
        System.out.println(auto2 + auto2.toSpeed());
        System.out.print(auto3 + Car.toBrake());
    }
}