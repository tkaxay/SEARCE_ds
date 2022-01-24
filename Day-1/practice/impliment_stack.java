import java.util.Stack;

public class impliment_stack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(2);
        stack.push(65);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}