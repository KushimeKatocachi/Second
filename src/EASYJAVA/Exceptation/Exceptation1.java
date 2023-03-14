package EASYJAVA.Exceptation;

public class Exceptation1 {
    public static void main(String[] args) {
        int zero = 0;
        int numerator = 55;
        int result = 0;
        try {
            result = numerator/zero;
            int[] numbers = new int[3];
            numbers[4] = result;
        } catch (ArithmeticException | NullPointerException exception) {
            System.out.println("Divided by zero!");
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Application finished!");
    }
}
