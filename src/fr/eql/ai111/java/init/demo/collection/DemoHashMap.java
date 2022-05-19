package fr.eql.ai111.java.init.demo.collection;

import fr.eql.ai111.java.init.demo.enums.DogBreed;
import fr.eql.ai111.java.init.demo.oop.Dog;
import fr.eql.ai111.java.init.demo.oop.Toy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {

    public static void main(String[] args) {

        /*
        Une HashMap permet de créer des couples clé/valeur dans une collection.
        La clé doit être unique.
         */

        // Déclaration d'une HashMap
        Map<String, Integer> quantityByFruit = new HashMap<>();

        // Ajouter des couples dans la map
        quantityByFruit.put("Kiwi", 6);
        quantityByFruit.put("Citron", 4);
        quantityByFruit.put("Banane", 4);

        // Récupération d'une valeur à partir de la clé
        System.out.println("Quantité de bananes : " + quantityByFruit.get("banane"));

        // Vérifier la présence d'une clé dans la map
        if (quantityByFruit.containsKey("Citron")) {
            System.out.println("Il y a bien des citrons, d'ailleurs il y en a " +
                    quantityByFruit.get("Citron"));
        }

        // Suppression d'un couple de clé/valeur
        quantityByFruit.remove("Kiwi");

        // Afficher toutes les clés
        System.out.println(quantityByFruit.keySet());

        Map<Dog, Set<Toy>> toysByDog = new HashMap<>();

        Dog fido = new Dog("Fido", 8, 100, 30, DogBreed.BERGER, new HashSet<>(), 1234);
        Dog milou = new Dog("Milou", 5, 50, 10, DogBreed.FOX_TERRIER, new HashSet<>(), 5678);

        Set<Toy> fidoToys = new HashSet<>();
        Set<Toy> milouToys = new HashSet<>();

        Toy toy1 = new Toy("Balle");
        Toy toy2 = new Toy("Souris en plastique");
        Toy toy3 = new Toy("Branche");
        Toy toy4 = new Toy("Os");

        fidoToys.add(toy1);
        fidoToys.add(toy2);

        milouToys.add(toy3);
        milouToys.add(toy4);

        toysByDog.put(fido, fidoToys);
        toysByDog.put(milou, milouToys);
    }
}
