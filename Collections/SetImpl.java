import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetImpl {
public static void main(String[] args) {
    Set<Integer> s1 = new TreeSet<Integer>();
    s1.add(5);
    s1.add(1);
    s1.add(-2);
    s1.add(0);
    System.out.println(s1);

    Set<Integer> s2 = new HashSet<Integer>();
    s2.add(10);
    s2.add(8);
    s2.add(15);
    s2.add(1);
    s2.add(5);
    s2.add(6);
    s2.add(0);
    System.out.println(s2);

    Set<Integer> s3 = new LinkedHashSet<Integer>();
    s3.add(100);
    s3.add(80);
    s3.add(15);
    s3.add(10);
    s3.add(150);
    s3.add(60);
    s3.add(80);
    System.out.println(s3);
    
}
}
