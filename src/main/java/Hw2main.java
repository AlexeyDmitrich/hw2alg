public class Hw2main {
    public static void main(String[] args) {

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
        Notebook[] box = new Notebook[value];
        for (int i = 0; i < box.length; i++) {
        //todo: randomize logic
            double price = 0;
            int ram = 0;
            String brand = null;
            box[i] = new Notebook();
        }

        return box;
    }
}
