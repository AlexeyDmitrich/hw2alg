import java.util.Comparator;

public class Notebook implements Comparable<Notebook> {
   double price;
   int ram;
   String brand;   // enum
    private int brandPriority = priorityCalc(this.brand);

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

    public int getBrandPriority() {
        return brandPriority;
    }

    @Override
    public String toString() {
        return "Notebook, " + price + "$, " + ram + "Gb, " + brand + '\n';
    }


    @Override
    public int compareTo(Notebook o) {
        return (int) (this.getPrice()-o.getPrice());
    }
    private static int priorityCalc (String brand){
        if (brand.equals("Lenuvo")){
            return 1;
        } else if (brand.equals("Asos")) {
            return 2;
        } else if (brand.equals("MacNote")) {
            return 3;
        } else if (brand.equals("Eser")) {
            return 4;
        } else if (brand.equals("Xamiou")) {
            return 5;
        } else {
            return 6;
        }
    }
}
