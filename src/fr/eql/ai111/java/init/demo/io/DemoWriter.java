package fr.eql.ai111.java.init.demo.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoWriter {

    public static void main(String[] args) throws IOException {

        System.out.println("*** FileWriter ***");
        // L'instanciation d'un FileWriter créé un fichier sur le disque
        // si l'arborescence de dossier est présente.
        FileWriter fw = new FileWriter("c:/DemoFolder/testFW.txt", false);
        fw.write("Hello AI111 !");
        fw.close();

        System.out.println("*** BufferedWriter ***");

        FileWriter out = new FileWriter("c:/DemoFolder/testBW.txt", false);
        BufferedWriter bw = new BufferedWriter(out);
        bw.write("Hello Toto !");
        bw.newLine();
        bw.write("How are you doing ?");
        bw.close();
        out.close();
    }
}
