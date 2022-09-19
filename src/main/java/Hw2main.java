import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Hw2main {
    static final Random rnd = new Random();
    public static void main(String[] args) {
        Notebook[] notes = factory(8);
        print(notes);
        ArrayList<Notebook> sorted = new ArrayList<>();
        System.out.println("Сортировка по цене:");
        sorted = sortByPrice(notes);
        System.out.println(sorted);
        System.out.println("Сортировка по RAM:");
        sorted = sortByRam(notes);
        System.out.println(sorted);
    }

    public static ArrayList<Notebook> sortByPrice (Notebook[] notebooks) {
        ArrayList<Notebook> sortedByPrice = new ArrayList <Notebook>();
        for (int i = 0; i < notebooks.length; i++) {
            sortedByPrice.add(notebooks[i]);
        }
        Collections.sort(sortedByPrice);
        return sortedByPrice;
    }

    public static ArrayList<Notebook> sortByRam (Notebook[] notebooks) {
        ArrayList<Notebook> sortedByRam = new ArrayList <Notebook>();
        for (int i = 0; i < notebooks.length; i++) {
            sortedByRam.add(notebooks[i]);
        }
        Comparator ramComparator = new RamComparator();
        Collections.sort(sortedByRam, ramComparator);
        return sortedByRam;
    }

    public static ArrayList<Notebook> sortByBrand (Notebook[] notebooks) {
        ArrayList<Notebook> sorted = new ArrayList <Notebook>();

        return sorted;
    }

    public static Notebook[] factory (int value){
        double[] prices = {100,200,300,400,500,600,700};
        int[] rams = {4,8,16,20,24};
        String[] brands = {"Lenuvo","Asos","MacNote","Eser","Xamiou"};
        Notebook[] box = new Notebook[value];
        for (int i = 0; i < box.length; i++) {
            double price = prices[rnd.nextInt(6)];
            int ram = rams[rnd.nextInt(4)];
            String brand = brands[rnd.nextInt(4)];
            box[i] = new Notebook(price,ram,brand);
        }
        return box;
    }

    public static void print (Notebook[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
