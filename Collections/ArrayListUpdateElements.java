import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListUpdateElements {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Pranav");
        l.add("Reddy");
        l.add("Pajjuru");
        l.add(1, "Reddy");
        System.out.println("Before using set method:"+l);
        l.set(1, " ");
        System.out.println("After using set method:"+l);
        l.replaceAll(s->s.concat(" Mr"));
        System.out.println("After replaceAll method:"+l);

        //iterator
        Iterator<String> itr = l.iterator();
        System.out.println("Printing all the elements through iterator");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ListIterator<String> litr = l.listIterator();
        System.out.println("Using list iterator for forward traversing:");
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("Using list iterator for backward traversing:");
        litr = l.listIterator(l.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }

        // foreach
        System.out.println("Using for each loop");
        for (String s : l) {
            System.out.println(s);
        }

    }
}
