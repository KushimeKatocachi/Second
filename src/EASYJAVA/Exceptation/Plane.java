package EASYJAVA.Exceptation;

import java.awt.*;

public class Plane {
    private Point location, destination;
    private final Dispacher dispacher;

    public Plane(Point destination, Dispacher dispacher) {
        this.destination = destination;
        this.dispacher = dispacher;
    }

    public Point getLocation() {
        System.out.println("Getting Location");
        return this.location;
    }

    public synchronized void setLocation() {
        System.out.println("Setting Location " + location.x + " " + location.y);
        this.location = location;
        //әуежайға жеткенде, отыруға запрос қою
        if(location.equals(destination)) {
            dispacher.requestLanding(this);
        }
    }
}
