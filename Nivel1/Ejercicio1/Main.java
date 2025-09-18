package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Instrument Wind1 = new Wind("Flute", 475.45) {
        };
        System.out.println(Wind1);
        Wind1.play();
        List<Instrument> band = new ArrayList<>();
        band.add(new Wind("Flute", 475.45));
        band.add(new Percussion("Drum", (double)1450.5F));
        band.add(new StringInstrument("Guitar", (double)450.0F));
        band.add(new StringInstrument("Violin", (double)560.0F));
        band.add(new Percussion("Bass Drum", (double)1200.0F));
        band.add(new Wind("Trumpets", (double)1545.75F));

        for(Instrument instrument : band) {
            System.out.println(instrument);
            System.out.print(instrument.getName() + " is: ");
            instrument.play();
            System.out.println();
        }

        System.out.println(Percussion.made);
    }
}
