package Sabak6;

public class Janaclass extends OveritingMethods{

    public Janaclass(int length, int width) {
        super(length, width);
    }

    public Janaclass(int length) {
        super();
        this.length = length;
    }
    @Override
    public int calculatePerimeter() {
        sides = 4;
        return 4*length;
    }

    public int calculatePerimeter(int length) {
        sides = 4;
        return 4*length;
    }

    public static void main(String[] args) {
        OveritingMethods overitingMethods = new OveritingMethods(3 , 4);
        System.out.println("Calculateperimeter with parameter " +
                overitingMethods.calculatePerimeter(2, 6));
        System.out.println(overitingMethods.calculatePerimeter());

        Janaclass javaclass = new Janaclass(45);
        System.out.println(javaclass.calculatePerimeter());
        System.out.println(javaclass.calculatePerimeter(45));
    }
}
