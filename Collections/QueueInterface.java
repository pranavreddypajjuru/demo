import java.util.PriorityQueue;

public class QueueInterface {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(10);
        queue.add(1);
        queue.add(25);
        queue.add(5);
        queue.add(100);
        queue.add(55);
        System.out.println(queue);

        System.out.println("Is the element inserted:" +queue.offer(50));
        System.out.println(queue);
        System.out.println("Removing head element: "+queue.poll());
        System.out.println(queue);
        System.out.println("Using Peek: "+queue.peek());
        System.out.println(queue);
        System.out.println("Using remove method:"+queue.remove());
        System.out.println(queue);
    }
    
}
