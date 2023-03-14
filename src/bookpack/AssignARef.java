package bookpack;

public class AssignARef {
    public static void main(String[] args) {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for( i = 0; i < 10; i++)
            nums1[i] = i;
        for (i = 0; i < 10; i++)
            nums2[i] = -i;

        System.out.println("Array nums1:");
        for ( i = 0; i < 10; i++)
            System.out.println(nums1[i] + " ");
        System.out.println();

        System.out.println("Array nums2:");
        for ( i = 0; i < 10; i++)
            System.out.println(nums2[i] + " ");
        System.out.println();

        nums2 = nums1;

        System.out.println("Array nums2 after change:");
        for ( i = 0; i < 10; i++)
            System.out.println(nums2[i] + " ");
        System.out.println();

        nums2[3] = 45;

        System.out.println("Array nums2:");
        for ( i = 0; i < 10; i++)
            System.out.println(nums2[i] + " ");
        System.out.println();
    }
}

class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = { 1, 2, 3};
        int table[][] = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        System.out.println("Размер списка: " + list.length);
        System.out.println("Размер nums: " + nums.length);
        System.out.println("Размер table: " + table.length);
        System.out.println("Размер table[0]: " + table[0].length);
        System.out.println("Размер table[1]: " + table[1].length);
        System.out.println("Размер table[2]: " + table[2].length);

        for( int i = 0; i < list.length; i++)
            list[i] = i * i;

        System.out.println("Содержимое списка: ");
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i] + " ");
        System.out.println(   );
    }
}

class ACopy {
    public static void main(String[] args) {
        int i;
        int num1[] = new int[10];
        int num2[] = new int[10];

        for (i=0; i < num1.length; i++)
            num1[i] = i;
        if(num2.length >= num1.length)
            for (i=0; i< num2.length; i++)
                num2[i] = num1[i];
        for (i=0; i< num2.length; i++)
            System.out.println(num2[i] + " ");

    }
}
