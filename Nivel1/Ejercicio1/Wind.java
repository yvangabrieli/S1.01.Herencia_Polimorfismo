package Ejercicio1;

public class Wind extends Instrument {
    public Wind(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A Wind is playing");
    }
}
