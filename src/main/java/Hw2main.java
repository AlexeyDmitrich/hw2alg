import java.util.Random;

public class Hw2main {
    static final Random rnd = new Random();
    public static void main(String[] args) {
        Notebook[] notes = factory(4);
        print(notes);
    }

    public static Notebook[] sortByPrice (Notebook[] notebooks) {
        Notebook[] sorted = new Notebook[notebooks.length];

        return sorted;
    }

    public static Notebook[] sortByRam (Notebook[] notebooks) {
        Notebook[] sorted = new Notebook[notebooks.length];

        return sorted;
    }

    public static Notebook[] sortByBrand (Notebook[] notebooks) {
        Notebook[] sorted = new Notebook[notebooks.length];

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
