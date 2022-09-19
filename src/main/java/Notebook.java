public class Notebook {
   double price;
   int ram;
   String brand;   // enum

    public Notebook(double price, int ram, String brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Notebook, " + price + "$, " + ram + "Gb, " + brand + '\'';
    }
}
