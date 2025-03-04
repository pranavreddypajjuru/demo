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

        

    }
}
