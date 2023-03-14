package Sabak9;

import java.util.Objects;

public class Box {
    private int weigth;
    private String color;
    private String content;

    public Box(int weigth, String color, String content) {
        this.weigth = weigth;
        this.color = color;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return weigth == box.weigth && Objects.equals(content, box.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weigth, content);
    }

    @Override
    public String toString() {
        return "Box{" +
                "weigth=" + weigth +
                ", color='" + color + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
