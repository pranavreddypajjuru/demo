import java.util.Stack;
 
public class StackOperations {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.add("Pranav");
        s.add("Reddy");
        s.add("Pajjuru");
        System.out.println(s);

        s.push("Mr");
        System.out.println(s);
        String s1 = s.pop();
        System.out.println("The popped element is:"+s1);
        System.out.println(s);
        s1=s.peek();
        System.out.println("The peek element is:"+s1);
        System.out.println(s);
    }
}
