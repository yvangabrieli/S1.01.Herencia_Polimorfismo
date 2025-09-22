package ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public abstract class Instrument {
            private String name;
            private double price;

            public Instrument(String name, double price) {
                this.name = name;
                this.price = price;
            }

            public String getName() {
                return this.name;
            }

            public double getPrice() {
                return this.price;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public abstract void play();

            @Override
            public String toString() {
                return "The Instrument is " + getName() + ", and the price is " + getPrice() + " .";
            }
        }
