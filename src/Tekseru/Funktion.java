package Tekseru;

public class Funktion {
    public static void main(String[] args) {
        Adam aibek = new Adam(180 , "Aibek");
        aibek.say("Alma");
        System.out.println(aibek.name + "\'s height is " + aibek.height);
        Adam ernar = new Adam();
        System.out.println(ernar.height);

        Adam madi = new Adam("Madi");
        System.out.println(madi.name);
        System.out.println("");

        Student freshman = new Student(76, "Ereke" , 2);
        freshman.tell();
        Student magregor = new Student(44, "Erasyl" , 3);
        freshman.tell();
        Student fresh = new Student(80, "Sarsen" , 1);
        freshman.tell();

    }
}
