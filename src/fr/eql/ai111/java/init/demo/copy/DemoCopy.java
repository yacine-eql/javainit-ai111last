package fr.eql.ai111.java.init.demo.copy;

import fr.eql.ai111.java.init.demo.oop.Dog;

public class DemoCopy {

    public static void main(String[] args) {

        System.out.println("*** Copie par valeur ***");

        int number1 = 5;
        int number2 = number1;
        System.out.println("number 1 : " + number1);
        System.out.println("number 2 : " + number2);
        number1 = 6;
        System.out.println("number 1 : " + number1);
        System.out.println("number 2 : " + number2);

        System.out.println("*** Copie par référence ***");

        Dog myDog = new Dog();
        myDog.setName("Fido");
        Dog myOtherDog = myDog;
        System.out.println("myDog : " + myDog.getName());
        System.out.println("myOtherDog : " + myOtherDog.getName());

        myDog.setName("Pas Fido");
        System.out.println("myDog : " + myDog.getName());
        System.out.println("myOtherDog : " + myOtherDog.getName());

    }
}
