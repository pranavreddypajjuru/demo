import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveElements {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(10);
        System.out.println("L:"+l);
        Integer i = l.remove(1);
        System.out.println("The element removed is:"+i);
        List<Integer> l1 = new ArrayList<>();
        l1.add(15);
        l1.add(20);
        l1.add(30);
        l1.add(12);
        boolean b = l.removeAll(l1);
        System.out.println("Is the original list L modified:"+b);
        l1.removeIf(n -> n%5==0);
        System.out.println("After removing the numbers which are divisible by 5:"+l1);
    }
}
