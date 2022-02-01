package lindedList;

import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        int ch;
        List obj = new List();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Press");
            System.out.println("1 to insert element");
            System.out.println("2 to display list");
            System.out.println("3 to delete");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.insert(sc.nextInt());
                    break;
                case 2:
                    obj.printlist();
                    break;
                case 3:
                    obj.delete(sc.nextInt());
                    break;
                default:
                    break;
            }
            System.out.print("Enter 1 to continue : ");
            ch = sc.nextInt();
        } while (ch == 1);
        sc.close();
    }
}
