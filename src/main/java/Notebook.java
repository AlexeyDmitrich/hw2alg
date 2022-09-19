import java.util.Comparator;

public class Notebook implements Comparable<Notebook> {
   double price;
   int ram;
   String brand;   // enum

    public Notebook(double price, int ram, String brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Notebook, " + price + "$, " + ram + "Gb, " + brand + '\'';
    }


    @Override
    public int compareTo(Notebook o) {
        return (int) (this.getPrice()-o.getPrice());
    }
}
