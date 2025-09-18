package Ejercicio1;

public class Percussion extends Instrument {
    // Se muestra cuando se carga la clase y solo una vez
    public static void main(String[] args) {
        System.out.println ("Percussion is load");
    }
    static String made = "All the percussion are craftsmanship";
    //Constructor
    public Percussion (String name, double price) {
        super(name,price);
    }
    // Method
    @Override
    public void play(){
        System.out.println("A Percussion Instrument is playing");
    }
}
