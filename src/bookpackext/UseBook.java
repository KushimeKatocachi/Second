package bookpackext;
import bookpack.*;

public class UseBook {
    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book("Java: A Beginner's Guide" , "Schildt" , 2011);
        books[1] = new Book("Java: Complete Reference", "", 2111);
        books[2] = new Book("The Art of Java", "nn", 2111);
        books[3] = new Book("Red Storm Rising", "cc", 2111);
        books[4] = new Book("aa", "dd", 2222);

        for(int i = 0; i < books.length; i++) books[i].show();
    }
}
