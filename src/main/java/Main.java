import BookPrograms.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        initData();
        String booksInfo =
                String.format("Общее количество проданных книг: %d, сумма: %f", getCountOfSoldBooks(),getAllPriceOfSoldBooks());
        System.out.println(booksInfo);


    }

    public static BigDecimal getAllPriceOfSoldBooks() {
        BigDecimal price = BigDecimal.ZERO;
        for (Order order : orders) {
            price = price.add(getCountOfSoldPrice(order));
        }
        return price;

    }


    public static BigDecimal getCountOfSoldPrice(Order order) {
        BigDecimal price = BigDecimal.ZERO;
        for (long bookId : order.getBooks()) {
            Book book = getBookById(bookId);
            if(book != null) {
                price = price.add(book.getPrice());
            }
        }
        return price;
    }

    //сатылған кітаптар жалпы сома
    public static int getCountOfSoldBooks() {
        int count = 0;
        for (Order order: orders) {
            count = count + order.getBooks().length;
        }
        return count;
    }

    //ерекше нөмір арқылы кітап алу - id
    // табылған кітап қайтару - return
    public static Book getBookById(long id) {
        Book current = null;
        for (Book book : books) {
            if (book.getId() == id) {
                current = book;
                break;
            }

        }
        return current;
    }


    public static void initData() {
        employees.add(new Employee(1,"Әділ", 25));
        employees.add(new Employee(2,"Мейірбек", 24));
        employees.add(new Employee(3,"Сәуле", 26));

        customers.add(new Customer(1, "Анар", 22));
        customers.add(new Customer(2, "Асан", 22));
        customers.add(new Customer(3, "Ерлан", 22));

        books.add(new Book(1, "1997", "Шынар", BigDecimal.valueOf(2000) , BookGenre.Art));
        books.add(new Book(2, "1111", "Марат", BigDecimal.valueOf(2000), BookGenre.Psyhology));
        books.add(new Book(3, "2222", "Игрон", BigDecimal.valueOf(2000), BookGenre.Programming));
        books.add(new Book(4, "111", "Шеф", BigDecimal.valueOf(2000), BookGenre.Programming));

        orders.add(new Order(1, 1,2,  new long[]{2,3,1}));
        orders.add(new Order(2, 2,2,  new long[]{2,3,1}));
        orders.add(new Order(3, 3,3,  new long[]{2,3,1}));



    }
}
