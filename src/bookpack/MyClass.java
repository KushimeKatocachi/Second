package bookpack;

public class MyClass {
    int x;

    MyClass(int i) {
        x = i;
    }
 }

 class ConsDemo {
     public static void main(String[] args) {
         MyClass t1 = new MyClass(10);
         MyClass t2 = new MyClass(80);

         System.out.println(t1.x + " " + t2.x);
     }
 }