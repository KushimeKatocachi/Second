package CourseY;

public class Maincraft {
    public static void main(String[] args) {
        int nums[] = { -99, 10, 15, 85, 45, 87,
                58, 88, -45, 88, 45, 94};

        int a, b, t;
        int size = 12;

        System.out.println("Ishod arrays:");
        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {

                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.println("Отсортированый массив:");
        for (int i=0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();
    }
}

