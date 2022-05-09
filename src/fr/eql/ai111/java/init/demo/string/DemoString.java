package fr.eql.ai111.java.init.demo.string;

public class DemoString {

    public static void main(String[] args) {

        String sentence = "Hello World !";
        String emptySentence = "";

        System.out.println("*** Méthodes de String ***");

        System.out.println("\r\n--- Obtenir la taille (nombre de caractères) ---");
        System.out.println("sentence : " + sentence.length());
        System.out.println("emptySentence : " + emptySentence.length());

        System.out.println("\r\n--- Vérifier si la chaîne est vide ---");
        System.out.println("sentence : " + sentence.isEmpty());
        System.out.println("emptySentence : " + emptySentence.isEmpty());

        System.out.println("\r\n--- Obtenir une partie de la chaîne ---");
        System.out.println("sentence à partir du caractère " +
                "à l'index 4 inclus : " + sentence.substring(4));
        System.out.println("sentence à partir du caractère " +
                "à l'index 4 inclus jusqu'au caractère " +
                "à l'index 7 exclus : " + sentence.substring(4, 7));

        System.out.println("\r\n--- Retirer les espaces entourant la chaîne ---");
        String sentenceWithSurroundingSpaces = "      Hello World !     ";
        System.out.println("sentenceWithSurroundingSpaces : "
                + sentenceWithSurroundingSpaces.length());
        String trimmedSentence = sentenceWithSurroundingSpaces.trim();
        System.out.println("trimmedSentence : " + trimmedSentence.length());

        System.out.println("\r\n--- Découper la chaîne en plusieurs partie, " +
                "selon un séparateur ---");
        String[] sentenceParts = sentence.split(" ");
        for (int i = 0; i < sentenceParts.length; i++) {
            System.out.println(sentenceParts[i]);
        }

        System.out.println("\r\n--- Remplacer une partie d'une chaîne " +
                "par une autre ---");
        String replacedSentence = sentence.replace("World", "Toto");
        System.out.println("replacedSentence : " + replacedSentence);

        System.out.println("\n\r*** StringBuffer ***");

        String part1 = "Hello";
        String part2 = "World";
        String part3 = "!";
        String allParts = part1 + " " + part2 + " " + part3;
        System.out.println("Concaténation classique : " + allParts);

        /*
        Un StringBuffer (ou StringBuilder) permet de concaténer des
        chaînes de caractères de manière plus performante qu'une concaténation
        classique.
         */
        StringBuffer myBuffer = new StringBuffer();
        myBuffer
                .append(part1) // pour rajouter à la fin de la chaîne
                .append(part2)
                .append(part3)
                .insert(5, " ") // pour insérer à une position donnée
                .insert(11, " ");
        allParts = myBuffer.toString();
        System.out.println("Concaténation par StringBuffer : " + allParts);

        System.out.println("\n\r### Comparaisons entre deux chaînes identiques ###");


    }
}
