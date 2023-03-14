package Sabak9;

import java.util.HashSet;

public class Main2 {
    public Main2() {
    }

    public static void main(String[] args) {
        Box appleBox = new Box(5,"red" ,"apples");
        Box orangeBox = new Box(15,"pink" ,"oranges");
        Box appleBox1 = new Box(25,"red" ,"apples");
        Box appleBox2 = new Box(55,"red" ,"apples");
        HashSet<Box> boxes = new HashSet<>();
        boxes.add(appleBox);
        boxes.add(orangeBox);
        boxes.add(appleBox1);
        boxes.add(appleBox2);
        System.out.println(boxes);


    }
}
