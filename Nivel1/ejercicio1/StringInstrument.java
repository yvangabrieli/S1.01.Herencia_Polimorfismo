package ejercicio1;

public class StringInstrument extends Instrument {
    public StringInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A String Instrument is playing");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
