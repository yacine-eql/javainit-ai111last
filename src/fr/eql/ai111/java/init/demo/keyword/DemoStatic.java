package fr.eql.ai111.java.init.demo.keyword;

public class DemoStatic {

    // Attribut non statique
    public int nonStaticNumber = 0;

    // Attributs statiques
    public static int staticNumber1 = 5;
    public static int staticNumber2;

    public static void main(String[] args) {

        System.out.println("*** Appel d'une méthode statique de Math ***");
        /*
        Il n'est pas nécessaire de passer par l'instance d'un objet pour accéder
        à ses méthodes statiques.
        Il suffit d'appeler directement la classe.
         */
        System.out.println("Résultat de la méthode max() : " + Math.max(5, 10));

        // Impossible d'appeler un attribut non statique dans la
        // méthode main qui est stique, donc dans un contexte statique.
        //System.out.println(nonStaticNumber);

        System.out.println("\r\n*** Appel d'attributs statiques ***");
        System.out.println("staticNumber1 : " + staticNumber1);
        System.out.println("staticNumber2 : " + staticNumber2);

        // La modification de la valeur d'un attribut statique dans une instance
        // d'un objet affecte également la valeur de cet attribut dans les autres
        // instances de cet objet.

        DemoStatic demo1 = new DemoStatic();
        DemoStatic demo2 = new DemoStatic();
    }
}
