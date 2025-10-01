package ejercicio1;

public class Wind extends Instrument {
    public Wind(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A Wind is playing");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
