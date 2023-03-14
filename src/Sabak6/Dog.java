package Sabak6;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("wof");
    }

    public void fetch(){
        System.out.println("fetch");
    }

}
