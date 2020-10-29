package creational.prototype;

import java.util.Objects;

public class Some implements Cloneable{
    private Integer number;

    public Some(Integer number) {
        this.number = number;
    }

    public Object clone() {
        try {
            Some copy = (Some)super.clone();
            return copy;
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Some some = (Some) o;
        return number.equals(some.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}


