package fr.eql.ai111.java.init.demo.enums;

public class Launcher {

    public static void main(String[] args) {

        DogBreed breed;

        System.out.println("*** Affectation d'un  variable de type enum ***");
        breed = DogBreed.SPITZ;
        System.out.println("Valeur de la variable : " + breed);

        System.out.println("\r\n*** Transformer une chaîne de caractères en valeur d'enum ***");
        breed = DogBreed.valueOf("LEVRIER");
        System.out.println("Valeur de la variable : " + breed);

        System.out.println("\r\n*** Afficher toutes les valeurs d'une enum ***");
        DogBreed[] breeds = DogBreed.values();
        for (DogBreed db : breeds) {
            System.out.println(db);
        }
    }
}
