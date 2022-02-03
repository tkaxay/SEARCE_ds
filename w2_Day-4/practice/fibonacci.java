import java.util.Scanner;

/**
 * fibonacci
 */
public class fibonacci {

    static int find(int n,int[] arr){
        int result;
        if(arr[n] != null)
        return arr[n];
        else
        result = find(n, arr);
       return result; 
    }
    public static void main(String[] args) {
        System.out.println("Enter position you want");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        arr = null;
        arr[1] = 1;
        arr[2] = 1;
        find(n,arr); 
    }
}