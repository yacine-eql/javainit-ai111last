package fr.eql.ai111.java.init.demo.inheritance;

import fr.eql.ai111.java.init.demo.enums.DogBreed;
import fr.eql.ai111.java.init.demo.oop.Toy;

public class Dog extends Animal {

    private DogBreed breed;

    public Dog() {
        // Cette instruction appelle le constructeur vide du parent
        // Elle est implicite et n'a donc pas besoin d'être notée.
        // Elle est forcément en première position.
        super();
    }

    /*
    Ce constructeur à 7 arguments appelle avec super(...) le constructeur
    de la superclasse (classe mère, ici "Animal") qui prend 6 arguments.
    Les 6 premiers arguments donnent des valeurs aux attributs de la classe
    mère. Le dernier argument sert à donner une valeur à l'attribut de la classe
    ic présente.
     */
    public Dog(String name,
               int age,
               float size,
               float weight,
               Toy toy,
               int registrationNumber,
               DogBreed breed) {
        super(name, age, size, weight, toy, registrationNumber);
        this.breed = breed;
    }

    /*
    Ce constructeur à 5 arguments appelle avec this() l'autre constructeur
    de la classe prenant 7 arguments, en lui fournissant des valeurs
    prédéfinies pour les deux derniers arguments.
     */
    public Dog(String name, int age, float size, float weight, Toy toy) {
        this(name, age, size, weight, toy, 1234, DogBreed.BERGER);
    }

    // La signature de la méthode abstraite du parent
    // a une visibilité "protected".
    // Je peux changer cette visibilité vers un niveau moins
    // restrictif.
    @Override
    public void fetchBall(int time) {
        System.out.println("Je vais chercher avec enthousiasme " +
                "la baballe " + time + " fois.");
    }

    // Une méthode spécifique au Dog, non présente dans son
    // parent
    public void bark() {
        System.out.println("Ouaf ! Ouaf !");
    }

    public DogBreed getBreed() {
        return breed;
    }
}
