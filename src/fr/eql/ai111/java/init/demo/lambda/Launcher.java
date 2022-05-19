package fr.eql.ai111.java.init.demo.lambda;

public class Launcher {

    public static void main(String[] args) {

        // On utilise la classe 'Tree' (qui implémente 'Plant')
        // afin d'utiliser son implémentation de
        // la méthode grow() déclarée dans l'interface 'Plant'
        Plant myTree = new Tree();
        myTree.grow(5);

        // On implémente à la volée la méthode 'grow' de l'interface 'Plant'
        // sans créer de classe qui implémente 'Plant'
        // Il s'agit d'une classe anonyme.
        Plant myCactus = new Plant() {
            @Override
            public void grow(int quantity) {
                System.out.println("Je fais pousser " + quantity + " cactus.");
            }
        };

        myCactus.grow(7);

        // On implémente à la volée la méthode 'grow' de l'interface 'Plant'
        // sans créer de classe qui implémente 'Plant' et sans indiquer le nom
        // de la méthode, puisqu'il n'y en a qu'une seule dans l'interface.
        // Il s'agit d'une fonction anonyme (ou expression lambda).
        Plant myBamboo = (int quantity) -> {
            System.out.println("Je fais pousser " + quantity + " bambou(s).");
        };
        myBamboo.grow(12);

        // Ecriture plus synthétique
        Plant myBonsai = quantity -> System.out.println("Je fais pousser " + quantity + " bonsai(s).");
        myBonsai.grow(1);
    }
}
