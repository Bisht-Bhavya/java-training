import java.util.Stack;
public class Q3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(10);
        s.push (15);
        s.pop();
        s.push (20);
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}