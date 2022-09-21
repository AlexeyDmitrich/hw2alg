import java.util.Comparator;

public class Notebook implements Comparable<Notebook> {
   double price;
   int ram;
    private enum Brand{
        Lenuvo,
        Asos,
        MacNote,
        Eser,
        Xamiou
    }
Brand brand;

    public Notebook(double price, int ram, String brand) {
        this.price = price;
        this.ram = ram;
        this.brand = Brand.valueOf(brand);
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getBrandPriority() {
        return getBrand().ordinal()+1;
    }

    @Override
    public String toString() {
        return "Notebook, " + price + "$, " + ram + "Gb, " + brand + '\n';
    }


    @Override
    public int compareTo(Notebook o) {
        return (int) (this.getPrice()-o.getPrice());
    }

}
