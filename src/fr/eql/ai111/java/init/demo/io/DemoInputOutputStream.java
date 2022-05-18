package fr.eql.ai111.java.init.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoInputOutputStream {

    public static void main(String[] args) throws IOException {

        File file = new File("c:/DemoFolder/testStream.test");
        int[] bytes = {260, 28, 58, 45, 62};

        // FileOutputStream permet d'écrire de bytes (octets) dans un fichier.
        FileOutputStream fos = new FileOutputStream(file);
        // On écrit sous forme d'octets chacun des entiers contenus dans notre
        // tableau d'entiers.
        for (int b : bytes) {
            fos.write(b);
        }
        fos.close();

        // FileInputStream permet de lire des octets dans un fichier
        FileInputStream fis = new FileInputStream(file);
        int i;
        System.out.println("Les octets de mon fichier : ");
        while ((i = fis.read()) != -1) {
            System.out.println(i);
        }
        fis.close();
    }
}
