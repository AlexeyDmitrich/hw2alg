import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Hw2main {
    static final Random rnd = new Random();
    public static void main(String[] args) {
        //quickTest();
      sortWithoutOutput(10000);
    }

    /**
     * На этом методе я проверял на маленьком количестве, что рандомайзер
     * и сортировки работают так, как я хотел
     */

    public static void quickTest (){
        Notebook[] notes = factory(30);
        print(notes);
        ArrayList<Notebook> sorted = new ArrayList<>();
        System.out.println();
        System.out.println("Сортировка по цене:");
        sorted = sortByPrice(notes);
        System.out.println(sorted);
        System.out.println();
        System.out.println("Сортировка по RAM:");
        sorted = sortByRam(notes);
        System.out.println(sorted);
        System.out.println();
        System.out.println("Сортировка по производителю:");
        sorted = sortByBrand(notes);
        System.out.println(sorted);
    }

    /**
     * Метод для трёх сортировок. Моё железо не потянет его выполнение с
     * текстовым сопровождением на 10к шт, поэтому его оставляю без вывода.
     * @param volume - количество ноутбуков для сортировки
     */
    public static void sortWithoutOutput (int volume){
        Notebook[] notes = factory(volume);
        ArrayList<Notebook> sortedBP = new ArrayList<>();
        ArrayList<Notebook> sortedBR = new ArrayList<>();
        ArrayList<Notebook> sortedBB = new ArrayList<>();
        sortedBP = sortByPrice(notes);
        sortedBR = sortByRam(notes);
        sortedBB = sortByBrand(notes);

    }


    /**
     * сортировка по цене - использует компаратор по умолчанию
     * @param notebooks принимает массив ноутбуков
     * @return возвращает сортированный список
     */
    public static ArrayList<Notebook> sortByPrice (Notebook[] notebooks) {
        ArrayList<Notebook> sortedByPrice = new ArrayList <Notebook>();
        for (int i = 0; i < notebooks.length; i++) {
            sortedByPrice.add(notebooks[i]);
        }
        Collections.sort(sortedByPrice);
        return sortedByPrice;
    }

    /**
     * сортировка по оперативной памяти - использует внешний компаратор
     * @param notebooks принимает массив ноутбуков,
     * @return возвращает сортированый список
     */
    public static ArrayList<Notebook> sortByRam (Notebook[] notebooks) {
        ArrayList<Notebook> sortedByRam = new ArrayList <Notebook>();
        for (int i = 0; i < notebooks.length; i++) {
            sortedByRam.add(notebooks[i]);
        }
        Comparator ramComparator = new RamComparator();
        Collections.sort(sortedByRam, ramComparator);
        return sortedByRam;
    }

    /**
     * сортировка по бренду - использует внешний компаратор
     * @param notebooks
     * @return
     */
    public static ArrayList<Notebook> sortByBrand (Notebook[] notebooks) {
        ArrayList<Notebook> sortedByBrand = new ArrayList <Notebook>();
        for (int i = 0; i < notebooks.length; i++) {
            sortedByBrand.add(notebooks[i]);
        }
        Comparator brandComparator = new BrandComparator();
        Collections.sort(sortedByBrand, brandComparator);

        return sortedByBrand;
    }

    /**
     * метод для производства партии случайных ноутбуков
     * @param value принимает int значение - количество необходимых ноутбуков
     * @return возвращает массив ноутбуков со случайными ценами, памятью и производителем
     */
    public static Notebook[] factory (int value){
        double[] prices = {100,200,300,400,500,600,700};
        int[] rams = {4,8,16,20,24};
        String[] brands = {"Lenuvo","Asos","MacNote","Eser","Xamiou"};
        Notebook[] box = new Notebook[value];
        for (int i = 0; i < box.length; i++) {
            double price = prices[rnd.nextInt(7)];
            int ram = rams[rnd.nextInt(5)];
            String brand = brands[rnd.nextInt(5)];
            box[i] = new Notebook(price,ram,brand);
        }
        return box;
    }

    /**
     * метод для быстрого просмотра массива (был нужен в тестовом методе)
     * @param arr принимает на вход массив и выводит содержимое в консоль
     */
    public static void print (Notebook[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
