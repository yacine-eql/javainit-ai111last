package fr.eql.ai111.java.init.demo.wrapper;

public class DemoWrapper {

    public static void main(String[] args) {

        /*
        Les wrappers ou classes enveloppes permettent d'encapsuler
        des types primitifs.
        Chaque type primitif possède sa classe enveloppe qui lui
        permet de se comporter comme un objet :
        - Byte
        - Short
        - Integer
        - Long
        - Float
        - Double
        - Boolean
        - Character
         */

        // Les wrappers sont donc nullables et instanciables
        //int myInt = null;
        Integer myInteger = null;
        myInteger = new Integer(42);

        // On peut affecter un primitif à un wrapper.
        // Une conversion automatique vers son wrapper, appelée "autoboxing", aura lieu.
        Float myFloat = 3.45f;

        /*
        Chaque wrapper (sauf Character) possède une méthode statique
        parseXXX(String str) qui permet de renvoyer un type primitif
        à partir d'une chaîne de caractères.
         */
        double myDouble = Double.parseDouble("42.2222222");

        /*
        Chaque wrapper (sauf Character) possède une méthode statique
        valueOf(String str) qui permet de renvoyer un type objet
        à partir d'une chaîne de caractères.
         */
        Boolean myBoolean = Boolean.valueOf("true");
        System.out.println("Valeur du booléen : " + myBoolean.booleanValue());
    }
}


