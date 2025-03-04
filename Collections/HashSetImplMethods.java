import java.util.HashSet;
import java.util.Set;

public class HashSetImplMethods {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(0);
        s.add(-15);
        s.add(15);
        s.add(1);
        s.add(300);
        s.add(2);
        System.out.println(s);

        s.remove(-15);
        System.out.println("After removing -15: "+s);

        s.clear();
        System.out.println("After using clear method: "+s);

        System.out.println("Is the HashSet Object empty:"+s.isEmpty());
        s.add(15);
        s.add(1);
        s.add(1000);
        s.add(150);
        s.add(51);
        s.add(66);
        System.out.println(s);
        System.out.println("Does HashSet contain 150 "+s.contains(150));
        System.out.println("Size of the HashSet:"+s.size());

        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(15);
        System.out.println("s:"+s);
        System.out.println("s1:"+s1);
        System.out.println("DOes s contains all the elements of s1: "+s.containsAll(s1));
        s.retainAll(s1);
        System.out.println("s:"+s);
        s.removeAll(s1);
        System.out.println("s:"+s);



    }
}
