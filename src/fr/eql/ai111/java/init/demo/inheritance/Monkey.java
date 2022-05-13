package fr.eql.ai111.java.init.demo.inheritance;

import fr.eql.ai111.java.init.demo.oop.Toy;

public class Monkey extends Animal implements IntelligentAnimal, StandingAnimal {

    public Monkey(String name, int age, float size, float weight, Toy toy, int registrationNumber) {
        super(name, age, size, weight, toy, registrationNumber);
    }

    @Override
    protected void fetchBall(int time) {
        System.out.println("Je jongle avec " + time + " balles.");
    }

    @Override
    public void hideItem(String item) {
        System.out.println("Je cache le " + item + " dans un trou creusé au préalable.");
    }

    @Override
    public void standUp() {
        System.out.println("Je me lève sur mes pattes arrières pour attraper une banane.");
    }
}
