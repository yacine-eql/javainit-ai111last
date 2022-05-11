package fr.eql.ai111.java.init.demo.inheritance;

import fr.eql.ai111.java.init.demo.enums.CatBreed;
import fr.eql.ai111.java.init.demo.oop.Toy;

public class Cat extends Animal {

    private CatBreed breed;

    public Cat(String name,
               int age,
               float size,
               float weight,
               Toy toy,
               int registrationNumber,
               CatBreed breed) {
        super(name, age, size, weight, toy, registrationNumber);
        this.breed = breed;
    }

    public void meow() {
        System.out.println("Miaaaaaaaou...");
    }

    @Override
    protected void fetchBall(int time) {
        System.out.println("Je regarde passer " + time
                + " fois l'inintéressante balle.");
    }
}
