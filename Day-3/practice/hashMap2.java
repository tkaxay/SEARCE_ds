import java.util.HashMap;
import java.util.Scanner;

public class hashMap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();//initilising hashmap with key string and value integer
        Scanner sc = new Scanner(System.in);//taking scanner
        System.out.println("no of records ");
        int n = sc.nextInt();//no of records user want
        System.out.println("enter values in map ");
        for (int i = 0; i < n; i++) {//to add n records in map
            map.put(sc.next(), sc.nextInt());
        }
        System.out.println(map);//print the map
        map.remove(sc.next());//remove records from map
        System.out.println(map);
        sc.close();
    }
}
