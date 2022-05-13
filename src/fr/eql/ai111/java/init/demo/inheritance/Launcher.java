package fr.eql.ai111.java.init.demo.inheritance;

import fr.eql.ai111.java.init.demo.enums.CatBreed;
import fr.eql.ai111.java.init.demo.enums.DogBreed;
import fr.eql.ai111.java.init.demo.oop.Toy;

import java.util.HashSet;
import java.util.Set;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("\t*** Dog : Fido ***");
        Dog fido = new Dog(
                "Fido",
                8,
                100,
                30, new
                Toy("Baballe"),
                455454,
                DogBreed.FOX_TERRIER);
        fido.fetchBall(5);
        System.out.println(fido.sizeWeightRatio());
        fido.bark();

        System.out.println("\t*** Cat : Felix ***");
        Cat felix = new Cat(
                "Felix",
                12,
                50,
                6,
                new Toy("Carton"),
                5645646,
                CatBreed.CHAT_DE_GOUTTIERE
        );
        felix.fetchBall(10);
        System.out.println(felix.sizeWeightRatio());
        felix.meow();

        System.out.println("\t*** Animal : Spike ***");
        /*
        Je stocke la référence à une instance de type Dog dans une variable
        du type de sa superclasse (ici Animal).
        Je n'ai désormais plus accès qu'aux attributs et méthodes d'un Animal,
        bien que l'instance en mémoire soit de type Dog.
         */
        Animal spike = new Dog(
                "Spike",
                11,
                120,
                35,
                new Toy("Os"),
                45646,
                DogBreed.BERGER);
        spike.fetchBall(5);
        spike.sizeWeightRatio();
        // spike.bark();
        // spike.getBreed();

        /*
        Je copie la référence de l'instance spike (de type Animal) dans
        une variable de type Dog.
        Je retrouve ainsi la possibilité d'accéder aux méthodes et attributs
        spécifiques à un objet de type Dog
         */
        Dog castedSpike = (Dog) spike;
        castedSpike.bark();
        castedSpike.getBreed();

        System.out.println("\t*** Animal : Garfield ***");
        Animal garfield = new Cat(
                "Garfield",
                12,
                50,
                6,
                null,
                9898596,
                CatBreed.BENGAL);
        garfield.sizeWeightRatio();
        garfield.fetchBall(6);
        Cat castedGarfield = (Cat) garfield;
        castedGarfield.meow();

        System.out.println("*** Boucle sur les animaux ***");
        Set<Animal> animals = new HashSet<>();

        animals.add(fido);
        animals.add(felix);
        for (Animal animal : animals) {
            // On vérifie le type de l'instance sortie de la collection
            // à chaque tour de boucle
            if (animal instanceof Dog) {
                System.out.println(animal.getName() + " est un chien.");
                Dog dog = (Dog) animal;
                dog.bark();
            }
            if (animal instanceof Cat) {
                System.out.println(animal.getName() + " est un chat.");
                Cat cat = (Cat) animal;
                cat.meow();
            }
        }

        Animal racoon = new Racoon("Rocky", 5, 50, 10, null, 0);
        animals.add(racoon);

        Animal monkey = new Monkey("Saru", 15, 80, 20, null, 464135);
        animals.add(monkey);
        Monkey saru = (Monkey) monkey;
        saru.hideItem("kiwi");
        saru.standUp();

        AnimalParade parade = new AnimalParade();
        parade.parade(animals);
    }
}
