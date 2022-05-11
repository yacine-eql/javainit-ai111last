package fr.eql.ai111.java.init.demo.keyword;

public class DemoStatic {

    // Attribut non statique
    private int nonStaticNumber = 0;

    // Attributs statiques
    private static int staticNumber1 = 5;
    private static int staticNumber2;

    /*
   Bloc statique permettant d'effectuer des opérations dans un contexte statique
   (avant instanciation) une fois au moment du chargement de la classe.
    */
    static {
        staticNumber2 = staticNumber1 * 2;
    }

    // Méthode non statique
    public void whatInstanceAmI() {
        System.out.println("je suis une instance de DemoStatic");
    }

    // Méthode statique
    public static void whatClassAmI() {
        System.out.println("Je suis DemoStatic. Voici un attribut statique : "
                + staticNumber1);
    }



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
        System.out.println("staticNumber1 de demo1 : " + demo1.staticNumber1);
        System.out.println("staticNumber1 de demo2 : " + demo2.staticNumber1);
        demo1.staticNumber1 = 42;
        System.out.println("staticNumber1 de demo1 : " + demo1.staticNumber1);
        System.out.println("staticNumber1 de demo2 : " + demo2.staticNumber1);

        System.out.println("\r\n*** Appel d'une méthode statique de cette classe ***");
        // J'accède à une méthode statique sans instancier l'objet, en étant dans
        // un contexte statique (dans le main())
        whatClassAmI();

        System.out.println("\r\n*** Appel de méthodes statique et non statique" +
                " d'une instance de cette classe ***");
        DemoStatic demo = new DemoStatic();
        demo.whatInstanceAmI();
        demo.whatClassAmI();
    }
}
