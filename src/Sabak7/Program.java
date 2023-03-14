package Sabak7;

import Sabak8.Warrior;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        Anterface anterface = new Book("Java Complete Reference" , "H.Smith");
        anterface.print();
        anterface.print2();

        ((Book)anterface).print2();

        anterface = new Journal("Foreign Policy");
        anterface.print();

        String name = ((Journal)anterface).getName();


        System.out.println(name);

        Anterface.read();
        ((Journal) anterface).search();

    }
}


class Book implements BookAnterface{
    String name;
    String author;

    @Override
    public void paint() {
        System.out.println("Book Paint");
    }

    @Override
    public void print2() {
        System.out.println("print2 from Book");
    }

    Book(String name , String author){
        this.name = name;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.printf("Book name is %s Author (%s) \n", name, author );

    }
}

class Journal implements Anterface , Searchable{
    private String name;
    Journal(String name){
        this.name = name;
        }

    public String getName() {
        return name;
    }

    @Override
    public void search() {

    }

    @Override
    public void print(){
        System.out.println(name);

        }


}
