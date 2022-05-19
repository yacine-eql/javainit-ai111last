package fr.eql.ai111.java.init.demo.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DemoRandomAccessFile {

    public static void main(String[] args) {

        // Le RAF est un fichier binaire à accès direct

        System.out.println("*** Ecriture dans le RAF ***");
        try {
            RandomAccessFile raf = new RandomAccessFile(
                    "c:/DemoFolder/raf.bin",
                    "rw");
            byte[] bytes = {58, 45, 87, 112, 74};
            // Le RAF a des méthodes pour écrire chaque type présent en Java
            for (byte b : bytes) {
                raf.writeByte(b);
            }
            raf.writeChar('a');
            // Le Contenu du RAF occupe 7 octets (visible avec la méthode
            // length). 5 octets pour les 5 'bytes', 2 octets pour le 'char'
            System.out.println("Taille du RAF : " + raf.length());
            raf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\r\n*** Lecture dans le RAF ***");
        try {
            RandomAccessFile raf2 = new RandomAccessFile(
                    "c:/DemoFolder/raf.bin",
                    "rw");
            /*
            Le RAF possède une méthode getFilePointer() qui permet de savoir
            où est placé le pointeur (là où la lecture ou l'écriture s'effectuera).
             */
            System.out.println("Avant lecture, le pointeur se situe sur la " +
                    "position : " + raf2.getFilePointer());

            /*
            Lecture du 5ème octet.
            On bouge le pointeur à la bonne position grâce à la méthode seek().
            Puis on lit avec la méthode readXXX().
             */
            raf2.seek(4);
            System.out.println("le pointeur se situe maintenant sur la " +
                    "position : " + raf2.getFilePointer());
            System.out.println("Lecture du 5ème octet : " + raf2.readByte());
            System.out.println("le pointeur se situe maintenant sur la " +
                    "position : " + raf2.getFilePointer());
            System.out.println("Lecture du caractère : " + raf2.readChar());
            System.out.println("le pointeur se situe maintenant sur la " +
                    "position : " + raf2.getFilePointer());
            raf2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\r\n*** Ecriture et lecture d'un int ***");
        try {
            RandomAccessFile raf3 = new RandomAccessFile(
                    "c:/DemoFolder/raf3.bin",
                    "rw");
            int[] numbers = {45, 87, 456789, 78456, 65};
            for (int n : numbers) {
                raf3.writeInt(n);
            }
            // Lecture de l'entier situé à l'index 4 (de mon tableau).
            // Donc 4 * 4 octets
            raf3.seek(4 * 4);
            System.out.println("Lecture du 5ème nombre : " + raf3.readInt());
            raf3.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
