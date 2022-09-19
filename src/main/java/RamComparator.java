import java.util.Comparator;

public class RamComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        return (int) (o1.getRam()- o2.getRam());
    }
}
