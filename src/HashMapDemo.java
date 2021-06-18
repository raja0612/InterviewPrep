package src;

import java.util.*;

public class HashMapDemo {
    public static void main(String args[]) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        map.forEach((key, value) -> {
            System.out.println(key + " - " + value);
        });


      for(Map.Entry<Integer, String> entry: map.entrySet())  {
          int key = entry.getKey();
          String value = entry.getValue();
          System.out.println(key + " - " + value);
        }

      if(map.containsKey(1)) {
          System.out.println("Key" + map.get(1));
      }

      int a [] = {1, 2, 2, 3, 1, 4};

      Map<Integer, Integer> frCounter = new HashMap<>();

     /* for(int x : a) {

          if(frCounter.containsKey(x)) {
              frCounter.put(x, frCounter.get(x) + 1);
          } else  {
              frCounter.put(x, 1);
          }
      }*/


        for(int x : a) {
            frCounter.putIfAbsent(x, 0);
            frCounter.put(x, frCounter.get(x) + 1);
        }

      frCounter.forEach((key, value) -> {
          System.out.println(key + " - " + value);
       });

    }
}