package BookLesson;

public class Break5 {
    public static void main(String[] args) {
        done:
            for (int i = 0; i<10; i++) {
                for (int j = 0; j<10; j++) {
                    for (int k = 0; k<10; k++) {
                        System.out.println(k + " ");
                        System.out.print(j + "");
                        if(k == 5 ) break done;
                        if(j == 6 ) break done;
                    }
                    System.out.println("After loop in i ");
                }
                System.out.println("After loop in j");
            }
        System.out.println("After loo[ in k");
    }
}
