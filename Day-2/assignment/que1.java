import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * que1
 */
public class que1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int ch = sc.nextInt();
            if (ch == 1) {
                int data=sc.nextInt();
                stack.push(data);
            }else if(ch == 2){
                stack.pop();
            }else if(ch == 3){
                Iterator<Integer> value = stack.iterator();
                int max = stack.firstElement();
                while (value.hasNext()) {
                    int temp = value.next();
                    if(max < temp){
                        max = temp;
                    }
                }
                System.out.println(max);
            }n--;
        }
        sc.close();
    }
}