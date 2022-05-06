package fr.eql.ai111.java.init.demo.oop;

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
}
