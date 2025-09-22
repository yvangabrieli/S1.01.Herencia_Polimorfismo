package ejercicio2;

public class Car {
    public static final String brand = "Toyota";
    public static String model = "CHR";
    public final int power;

    public Car(int power) {
        this.power = power;
    }

    public static String toBreak() {
        return " \nThe car is Stop";
    }

    public String toSpeed() {
        return "\nThe car is Speeding up";
    }

    public String toString() {
        return "The Toyota (" + model + ") have " + this.power + " of power.";
    }
}