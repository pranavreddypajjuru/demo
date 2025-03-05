import java.util.TreeSet;
import java.util.Comparator;

public class ComparatorUsgae {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>(){
        @Override
        public int compare(Integer i1, Integer i2)
        {
            return i2.compareTo(i1);
        }
    };
        TreeSet<Integer> t = new TreeSet<>(c);
        t.add(150);
        t.add(1);
        t.add(-15);
        t.add(100);
        t.add(50);
        t.add(61);
        System.out.println(t);
    }
}
