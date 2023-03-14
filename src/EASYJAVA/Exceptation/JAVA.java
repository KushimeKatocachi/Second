package EASYJAVA.Exceptation;

public class JAVA {
    private String brand;
    private String name;
    private String color;
    private int year;
    private int topSpeed;
    private int currentSpeed;

    public JAVA(String brand, String name, String color, int year, int topSpeed, int currentSpeed) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.year = year;
        this.topSpeed = topSpeed;
        this.currentSpeed = currentSpeed;
    }

    public void accelerate(int speed) {
        if(this.currentSpeed + speed <= this.currentSpeed) {
            this.currentSpeed += speed;
        } else {
            this.currentSpeed = this.topSpeed;
        }
    }

    public void brake(int speed) {
        if(this.currentSpeed - speed >= 0 ) {
            this.currentSpeed -= speed;
        } else {
            this.currentSpeed = 0;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
