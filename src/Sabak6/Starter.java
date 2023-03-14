package Sabak6;

public class Starter {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog shaha = (Dog) dog;
        shaha.makeSound();
        shaha.fetch();

        Animal cat = new Cat();
        Cat sasha = (Cat) cat;
        sasha.makeSound();
        sasha.fetch();

        Shape shape = new Cirkle();
        System.out.println(shape.calculateArea2());

        shape = new OveritingMethods();
        System.out.println("OveritingMethods " + shape.calculateArea());

    }
}
