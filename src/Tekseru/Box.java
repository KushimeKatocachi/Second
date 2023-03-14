package Tekseru;

import java.util.Objects;

public class Box {
    int wieght;

    public Box(int wieght) {
        this.wieght = wieght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return wieght == box.wieght;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wieght);
    }

    @Override
    public String toString() {
        return "Box{" +
                "wieght=" + wieght +
                '}';
    }
}
