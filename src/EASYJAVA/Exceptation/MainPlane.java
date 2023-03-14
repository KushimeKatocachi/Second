package EASYJAVA.Exceptation;

import java.awt.*;

public class MainPlane {
    public static void main(String[] args) {

        Dispacher dispacher = new Dispacher();
        Plane plane = new Plane(new Point(1, 1), dispacher);
        dispacher.requestLanding(plane);

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                dispacher.getMap();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                plane.setLocation();
            }
        }).start();
    }
}