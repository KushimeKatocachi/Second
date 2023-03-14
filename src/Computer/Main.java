package Computer;

public class Main {
    public static void main(String[] args) {
    }
    public static void SnailMatrix(int[][] array){
        int a = 0;
        int n = array.length;
        int t;
        if (n%2 == 0) t = n/2;
        else t =(n+1)/2;
        for (int i = 0;i<t; i++) {
            for(int j = 0; j < n - i; j++) { //napravo
                array[i][j] = a;
                a++;
            }
            for(int j = i + 1 ; j < n - i; j++) {
                array[j][n-i-1] = a;
                a++;
            }
            for(int j = n - i - 2 ; j >= i; j--) {
                array[n-i-1][j] = a;
                a++;
            }
            for(int j = n - i - 2; j > i; j--){
                array[i][j] = a;
                a++;
            }
        }
    }
}
