import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueComparatorUsage {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2)
            {
                return i1.compareTo(i2);
            }
        };

            PriorityQueue<Integer> queue = new PriorityQueue<>(c);
            queue.add(10);
            queue.add(15);
            queue.add(1);
            queue.add(100);
            queue.add(20);
            queue.add(25);
            System.out.println(queue);

            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }

    }
    
}
