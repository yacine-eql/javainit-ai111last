package fr.eql.ai111.java.init.demo.lambda;

public class Tree implements Plant {

    @Override
    public void grow(int quantity) {
        System.out.println("Je fais pousser " + quantity + " arbre(s).");
    }
}
