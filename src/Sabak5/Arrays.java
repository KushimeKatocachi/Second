package Sabak5;

public class Arrays {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = 14;
        nums[2] = 84;
        nums[3] = -45;
        nums[4] = 75;
        nums[5] = 15;
        nums[6] = 20;
        nums[7] = 55;
        nums[8] = 78;
        nums[9] = 90;

        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);

    }
}


class TwoD {
    public static void main(String[] args) {
        int t, i;
        int table[][] = new int[3][5 ];

        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.println(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}
