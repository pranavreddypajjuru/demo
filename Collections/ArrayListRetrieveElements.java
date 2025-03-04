import java.util.ArrayList;
import java.util.List;

public class ArrayListRetrieveElements {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Pranav");
        l.add("Reddy");
        l.add("Pajjuru");
        l.add("Java");
        l.add("Developer");
        System.out.println("Original List:"+l);
        //to get string from a index
        String s = l.get(2);
        System.out.println("The element retrived was: "+s);

        int i = l.indexOf("Pranav");
        System.out.println("The index of Pranav is:"+i);
        l.add("Pranav");
        i = l.lastIndexOf("Pranav");
        System.out.println("The last index of Pranav is:"+i);
    }
    
}
