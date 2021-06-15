import java.util.*;

public class HashMapDemo {
    public static void main(String args[]) {

        Mpa<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        map.forEach((key, value) -> {
            System.out.println(key + " - " + value);
        })


      for(Map.Entry<Integer, String> entry: map.entrySet())  {
          int key = entry.getKey();
          String value = entry.getValue();
          System.out.println(key + " - " + value);
        }


    }
}