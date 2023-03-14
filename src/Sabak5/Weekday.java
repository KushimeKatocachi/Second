package Sabak5;

public enum Weekday {
    MONDAY("Пн", 1), TUESDAY("Вт" , 2), THUESDAY("Ср" , 3), WEDNESDAY("Чт", 4),
    FRIDAY("Пт", 5), SATURDAY("Сб" , 6),SUNDAY("Вс" , 7 );

    private String rusname;
    private int number;

    Weekday(String rusname, int number) {
        this.rusname = rusname;
        this.number = number;
    }
}
