package Tekseru;

import java.util.Scanner;

public class Colsole {
    public static void main(String[] args) {

        System.out.print("Hello world \n");

        int a =+10/2 * 5;
        System.out.println(a);

        int x=5;
        int y=6;
        System.out.println("x=" + x + "; y=" + y);

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        in.close();
    }
}
