import java.util.LinkedList;

public class LinkedListQueueOperations {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(5);
        l.add(0);
        l.add(1);
        System.out.println(l);
        l.addFirst(-1);
        l.addLast(15);
        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
    }
}
