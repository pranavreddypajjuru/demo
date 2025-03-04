import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(0);
        l1.add(-5);
        System.out.println("L1:"+l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(6);
        l2.add(15);
        l2.add(0);
        l2.add(-154);
        System.out.println("L2:"+l2);
        
        l1.addAll(l2);
        System.out.println("After adding L2:"+l1);

        List<Integer> l3 = new ArrayList<>();
        l3.add(14);
        l3.add(51);
        l3.add(-6);
        l3.add(7);
        l1.addAll(1, l3);
        System.out.println(l1);

        l1.add(0, 1);
        System.out.println("L1:"+l1);
    }
}
