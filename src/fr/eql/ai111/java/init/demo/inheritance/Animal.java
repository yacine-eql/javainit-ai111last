package fr.eql.ai111.java.init.demo.inheritance;

import fr.eql.ai111.java.init.demo.oop.Toy;

// Une classe abstraite ne peut être instanciée.
// Uniquement ses enfants peuvent être instanciés
// (s'ils ne sont pas eux-mêmes abstraits)
public abstract class Animal {

    private String name;
    private int age;
    private float size;
    private float weight;
    private Toy toy;
    private final int registrationNumber;

    public Animal() {
        registrationNumber = 1234;
    }

    public Animal(String name, int age, float size, float weight, Toy toy, int registrationNumber) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.toy = toy;
        this.registrationNumber = registrationNumber;
    }

    // Une méthode abstraite doit être redéfinie
    // dans un enfant.
    // La visibilité "protected" permet de rendre
    // la méthode visible dans tous les enfants,
    // même dans un autre package
    protected abstract void fetchBall(int time);

    public float sizeWeightRatio() {
        return size / weight;
    }

    public String getName() {
        return name;
    }
}
