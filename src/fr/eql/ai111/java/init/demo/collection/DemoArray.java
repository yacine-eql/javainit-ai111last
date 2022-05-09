package fr.eql.ai111.java.init.demo.collection;

public class DemoArray {

    public static void main(String[] args) {

        // Initialisation et peuplement d'un tableau à une dimension
        String[] seasons = {"Printemps", "Eté", "Automne", "Hiver"};

        System.out.println("*** Lecture du 3ème élément du tableau ***");
        System.out.println(seasons[2]);

        System.out.println("*** Lecture de tous les éléments du tableau ***");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
    }
}
