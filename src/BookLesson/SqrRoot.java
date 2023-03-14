package BookLesson;

public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;
        int x , count;
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень из квадратный из " + num + "равен " + sroot);

            rerr = num - (sroot * sroot);
            System.out.println("Ошибки округления: " + rerr);
            System.out.println();
        }
        for (x = 100; x > -100; x -= 5) {
            System.out.println(x);
        }

        int a, b;
        for (a = 0, b = 10; a < b; a++, b-- ) {
            System.out.println("a and b: " + a + " " + b);
        }

    }
}
