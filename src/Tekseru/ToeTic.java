package Tekseru;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ToeTic {
    public ToeTic() {
    }

    public static void main(String[] args) {
        HashMap <String, Integer> hashMap = new HashMap<>();
        Integer integer = hashMap.put("A" , 8);
        System.out.println(integer);
        Integer integer1 = hashMap.put("A", 5);
        System.out.println(integer1);
        Integer integer2 = hashMap.get("A");
        System.out.println(integer2);
        hashMap.put("B" , 2);
        hashMap.put("C" , 4);
        hashMap.put("Q" , 9);
        System.out.println(hashMap);
        for (Map.Entry entry: hashMap.entrySet()) {
            entry.getValue();
        }

        TreeMap<Integer, String > treeMap = new TreeMap<>();
        treeMap.put(80, "A");
        treeMap.put(2,"A");
        treeMap.put(15,"A");
        treeMap.put(14, "A");
        treeMap.put(12,"A");
        System.out.println(treeMap);

        TreeMap<Box, String> boxes = new TreeMap<>(new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.wieght - o2.wieght;
            }
        });

        boxes.put(new Box(5), "IBD");
        boxes.put(new Box(25), "IBD");
        boxes.put(new Box(50), "IBD");
        boxes.put(new Box(15), "IBD");
        System.out.println(boxes);






    }
}