package Sabak7;

import java.awt.print.Printable;

public interface Anterface {
    void print();

    default void print2() {
        System.out.println("Undefined anterface");
    }

    static void read() {
        System.out.println("Read Anterface");
    }
}

interface Searchable{
    void search();
}

interface BookAnterface extends Anterface{
    void paint();
}

