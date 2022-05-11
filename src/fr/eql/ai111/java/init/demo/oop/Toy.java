package fr.eql.ai111.java.init.demo.oop;

import java.util.Objects;

public class Toy {

    private String toyName;

    public Toy(String toyName) {
        this.toyName = toyName;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyName='" + toyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ( getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Objects.equals(toyName, toy.toyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toyName);
    }
}
