package bookpack;

public class ChkNum {
    boolean isEven(int x) {
        if((x%2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 - equal number");
        if(e.isEven(9)) System.out.println("9 - not equal number");
        if(e.isEven(8)) System.out.println("8 - equal number");
    }
}

class Factor {
    boolean isFactor(int a, int b) {
        if((b%a)==0) return true;
        else return false;
    }
}

class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        if (x.isFactor(2,20)) System.out.println(" 2 - delitel");
        if (x.isFactor(3,20)) System.out.println("This string don't use in panel");
    }
}
