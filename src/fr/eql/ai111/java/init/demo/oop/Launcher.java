package fr.eql.ai111.java.init.demo.oop;

public class Launcher {

    public static void main(String[] args) {

        // Instanciation d'un objet avec son constructeur vide
        Dog dog1 = new Dog();
        Toy dog2Toy = new Toy("Baballe");
        // Instanciation d'un objet avec constructeur surchargé
        Dog dog2 = new Dog("Fido", 8, 100, 30, dog2Toy);

        // Affectation des attributs
        dog1.setName("Laika");
        dog1.setAge(12);
        dog1.setSize(80);
        dog1.setWeight(20);

        // Affichage des attributs
        System.out.println("dog1 :");
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getSize());
        System.out.println(dog1.getWeight());

        System.out.println("\r\ndog2 :");
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getSize());
        System.out.println(dog2.getWeight());

        String dog2ToyName;
        // Récupération du nom du jouet de dog2 (en 2 étapes)
        Toy dog2ToyInstance = dog2.getToy();
        dog2ToyName = dog2ToyInstance.getToyName();
        System.out.println(dog2ToyName);

        // Récupération du nom du jouet de dog2 (en 1 étape)
        dog2ToyName = dog2.getToy().getToyName();
        System.out.println(dog2ToyName);

        System.out.println();

        // Si l'attribut (variable d'instance) "name" de l'objet Dog est public
        // alors je peux directement y accéder et le changer, sans passer par des
        // accesseurs ou mutateurs.
//        System.out.println(dog1.name);
//        dog1.name = "toto";
//        System.out.println(dog1.name);

        // Appel des méthodes
        dog1.bark();
        dog2.bark();
        dog1.fetchBall(5);
        dog2.fetchBall(10);
        float ratio = dog1.sizeWeightRatio();
        System.out.println(ratio);

        System.out.println(dog2.toString());

    }
}
