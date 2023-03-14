package Tekseru;

import java.util.Scanner;

public class Aqiqat {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        System.out.println("Балыңызды енгізіңіз");
        first = num.nextInt();

        if(first >= 80) {
            System.out.println("Tamasha");
        } else if (first >= 60 && first <= 79)  {
            System.out.println("Jaqsy");
        } else if (first >= 40 && first <= 59) {
            System.out.println("Tyrysu kerek");
        } else if (first >= 0 && first <39) {
            System.out.println("Nashar, sonsha tupoisynba ne?");
        }
    }
}
