import java.util.HashMap;
import java.util.Map;

public class hashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "abcd");
        map.put(3, "abcde");
        map.put(4, "abcdef");
        map.put(5, "abcd");
        map.put(6, "abc");
        map.put(7, "abcd");
        map.put(8, "abcde");
        map.put(9, "abcdef");
        map.put(10, "abcd");
        map.put(11, "abc");
        map.put(12, "abcd");
        map.put(13, "abcde");
        map.put(14, "abcdef");
        map.put(15, "abcd");
        map.put(16, "abc");
        map.put(17, "abcd");
        map.put(18, "abcde");
        map.put(19, "abcdef");
        map.put(20, "abcd");
        for (Map.Entry<Integer,String> e : map.entrySet()) {
            System.out.println("key : " + e.getKey() + " value : " + e.getValue());
        }
    }
}
