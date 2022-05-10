package fr.eql.ai111.java.init.demo.keyword;

import fr.eql.ai111.java.init.demo.enums.DogBreed;
import fr.eql.ai111.java.init.demo.oop.Dog;

public class DemoFinal {

    public static void main(String[] args) {

        /*
        Une variable déclarée finale ne peut être assignée qu'une fois.
        Elle ne peut plus ensuite pointer vers un autre emplacement mémoire.
        L'assignation ne doit pas nécessairement se produire au moment de la déclaration
         */

        final int number;
        number = 0;
        final Dog milou;
        milou = new Dog("Milou", 12, 100, 30, DogBreed.FOX_TERRIER, null, 4567);

        // On ne peut pas assigner une nouvelle valeur à une variable de type primitif
        //number = 1;

        // On peut modifier l'état (valeur des attributs) d'une instance déclarée finale
        System.out.println("Référence mémoire de milou : " + milou);
        System.out.println("Age de Milou : " + milou.getAge());
        milou.setAge(6);
        System.out.println("Référence mémoire de milou : " + milou);
        System.out.println("Age de Milou : " + milou.getAge());
        // On ne peut pas assigner une nouvelle instance à une variable finale
        // déjà initialisée.
        //milou = new Dog();
    }
}
