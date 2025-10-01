package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Instrument wind1 = new Wind("Flute", 475.45) {
        };
        System.out.println(wind1);
        wind1.play();
        List<Instrument> band = new ArrayList<>();
        band.add(new Wind("Flute", 475.45));
        band.add(new Percussion("Drum", (double)1450.5));
        band.add(new StringInstrument("Guitar", (double)450.0));
        band.add(new StringInstrument("Violin", (double)560.0));
        band.add(new Percussion("Bass Drum", (double)1200.0));
        band.add(new Wind("Trumpets", (double)1545.75));

        for(Instrument instrument : band) {
            System.out.println(instrument);
            System.out.print(instrument.getName() + " is: ");
            instrument.play();
            System.out.println();
        }

        System.out.println(Percussion.made);
    }
}
