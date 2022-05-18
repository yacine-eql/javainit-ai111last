package fr.eql.ai111.java.init.demo.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {

    public static void main(String[] args) throws IOException {

        System.out.println("*** FileReader ***");
        FileReader fr = new FileReader("c:/DemoFolder/testFW.txt");
        int character = 0;
        String content = "";
        // On stocke le caractère suivant dans une variable
        // de type int, que l'on caste pour le concaténer à
        // la String.
        // -1 signifie que l'on a atteint la fin du flux (condition
        // pour sortir de la boucle).
        while ((character = fr.read()) != -1) {
            content += (char) character;
        }
        System.out.println("Contenu du fichier : \r\n" + content);
        fr.close();

        System.out.println("*** BufferedReader ***");
        FileReader in = new FileReader("c:/DemoFolder/testBW.txt");
        BufferedReader br = new BufferedReader(in);

//        System.out.println("--- Caractère par caractère ---");
//        content = "";
//        character = 0;
//        while ((character = br.read()) != -1) {
//            content += (char) character;
//        }
//        System.out.println("Contenu du fichier : \r\n" + content);

        /*
        Le BufferedReader possède une m"thode ready() qui renvoie true
        tant qu'il reste des éléments à lire dans le fichier
         */
        content = "";
        while (br.ready()) {
            content += br.readLine() + "\r\n";
        }
        System.out.println("Contenu du fichier : \r\n" + content);
        br.close();
        in.close();
    }
}
