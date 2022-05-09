package fr.eql.ai111.java.init.demo.collection;

import fr.eql.ai111.java.init.demo.oop.Toy;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {

        /*
        Une liste contient une collection d'élément ordonnés,
        et permettant l'ajout de doublon.
         */

        // Initialisation d'une liste
        List<Toy> toys = new ArrayList<>();

        // Ajouter des éléments
        Toy toy1 = new Toy("Balle");
        Toy toy2 = new Toy("Souris en plastique");
        toys.add(toy1);
        toys.add(toy2);

        // Il est possible d'insérer un élément à un index précis
        Toy toy3 = new Toy("Branche");
        toys.add(1, toy3);

        // Une liste permet de rajouter un doublon (une instance déjà présente dans la liste)
        toys.add(toy3);

        System.out.println("\r\n*** Obtenir la taille de la liste ***");
        System.out.println("La liste contient " + toys.size() + " jouets.");

        System.out.println("\r\n*** Liste des noms des jouets ***");
        // For Each : écrire toys.iter puis Enter
        for (Toy t : toys) {
            System.out.println(t);
            System.out.println(t);
        }

        System.out.println("\r\n*** Récupérer un élément à partir de son index ***");
        Toy thirdToy = toys.get(2);
        System.out.println("3ème jouet de la liste (index 2) : " + thirdToy.getToyName());

        System.out.println("\r\n*** Récupérer l'index à partir de la référence de l'instance ***");
        int toy2Index = toys.indexOf(toy2);
        System.out.println("Index de la souris en plastique : " + toy2Index);

        System.out.println("\r\n*** Suppression d'éléments dans la liste" +
                "par référence ou par index ***");
        toys.remove(toy1);
        toys.remove(0);
        System.out.println("La liste ne contient plus que " + toys.size() + " éléments.");
        for (Toy t : toys) {
            System.out.println(t.getToyName());
        }

        System.out.println("\r\n*** Vider la liste ***");
        toys.removeAll(toys);
        //toys = new ArrayList<>();
        if (toys.isEmpty()) {
            System.out.println("La liste de jouets est vide");
        }
    }
}
