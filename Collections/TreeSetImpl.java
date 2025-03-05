import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(1);
        s.add(100);
        s.add(55);
        s.add(1505);
        System.out.println(s);
        System.out.println("First: "+s.first());
        System.out.println("Last: "+s.last());
        System.out.println("HeadSet: "+s.headSet(500));
        System.out.println("TailSet: "+s.tailSet(50));
        System.out.println("SubSet:" +s.subSet(10, 100));
    }
}
