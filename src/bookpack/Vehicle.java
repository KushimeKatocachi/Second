package bookpack;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для проедоление: " + dist +
                " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("Для проедоление: " + dist +
        " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");

        minivan.fuelcap = 16;
        minivan.passengers = 7;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " " +  "пассажиров на расстояние ");
        minivan.range();
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers + " " + "пассажиров на расстояние ");
        sportscar.range();
    }

}
