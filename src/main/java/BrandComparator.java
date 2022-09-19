import java.util.Comparator;

public class BrandComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        return (int) (o1.getBrandPriority() - o2.getBrandPriority());
    }
}
