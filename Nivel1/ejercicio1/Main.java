package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Instrument wind1 = new Wind("Flute", 475.45);
        System.out.println(wind1);
        wind1.play();
        System.out.println();

        List<Instrument> band = new ArrayList<>();
        band.add(new Wind("Flute", 475.45));
        band.add(new Percussion("Drum",  1450.5));
        band.add(new StringInstrument("Guitar",  450.0));
        band.add(new StringInstrument("Violin",  560.0));
        band.add(new Percussion("Bass Drum", 1200.0));
        band.add(new Wind("Trumpets",  1545.75));

        for (Instrument instrument : band) {
            System.out.println(instrument);
            System.out.print(instrument.getName() + " is: ");
            instrument.play();
            System.out.println();
        }

        System.out.println(Percussion.made);
    }
}
