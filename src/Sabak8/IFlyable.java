package Sabak8;

public interface IFlyable {
    void fly();
    default void hover() {
        System.out.println("I'm hovering!");
    }
}
