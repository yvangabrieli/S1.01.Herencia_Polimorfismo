package ejercicio2;

public class Car {
    public static final String BRAND = "Toyota";
    public static final String MODEL = "CHR";
    public final int power;

    public Car(int power) {
        if (power > 0) {
            this.power = power;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static String toBrake() {
        return " \nThe car is Stop";
    }

    public String toSpeed() {
        return "\nThe car is Speeding up";
    }

    @Override
    public String toString() {
        return BRAND + "(" + MODEL + ") have " + this.power + " of power.";
    }
}