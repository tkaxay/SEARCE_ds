import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enetr elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr = bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    private static int[] bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}