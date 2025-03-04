import java.util.ArrayList;
import java.util.Collection;

public class Collection1{
    public static void main(String[] args){
    Collection<String> cObj = new ArrayList<String>();
    cObj.add("Pranav");
    cObj.add("Reddy");
    cObj.add("Pajjuru");
    System.out.println(cObj);
    System.out.println(cObj.contains("Pranav"));
    cObj.forEach((obj)->{
        System.out.println(obj);
    });  
    Collection<String> cObj1 = new ArrayList<String>();
    cObj1.add("Pranav");
    cObj1.add("Reddy");
    System.out.println(cObj1);
    boolean b = cObj1.containsAll(cObj);
    System.out.println(b);
    cObj1.add("Pajjuru");
    System.out.println(cObj.containsAll(cObj1));
    cObj1.remove("Reddy");
    System.out.println(cObj1);
    cObj1.add("Mr");
    boolean retention = cObj.retainAll(cObj1);
    System.out.println(retention);
    System.out.println(cObj);
    System.out.println(cObj1);
    }
}