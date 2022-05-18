package fr.eql.ai111.java.init.demo.io;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class DemoFile {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws IOException {

        // Instancier un dossier (au sens Java, pas sur le disque)
        File folder = new File("c:/DemoFolder");

        /*
        mkdir() permet de créer le dossier sur le disque,
        s'il n'existe pas déjà.
        Cette méthode renvoie true si le dossier a bien été créé.
         */
        boolean isCreated = folder.mkdir();
        if (isCreated) {
            logger.info("Le dossier DemoFolder a bien été créé.");
        } else {
            logger.warn("Le dossier DemoFolder n'a pas été créé.");
        }

        // Instancier un fichier (au sens Java, pas sur le disque)
        File file = new File("c:/DemoFolder/file.demo");

        /*
        createNewFile() permet de créer un fichier sur le disque, s'il
        n'existe pas déjà, et si l'arborescence de dossiers est déjà
        présente.
        Cette méthode renvoie true si le fichier a bien été créé.
         */
        isCreated = file.createNewFile();
        if (isCreated) {
            logger.info("Le fichier file.demo a bien été créé.");
        } else {
            logger.warn("Le fichier file.demo n'a pas été créé.");
        }

        // Création d'un fichier avec un chemin relatif
        File relativePathFile = new File("relativePathFile.demo");
        isCreated = relativePathFile.createNewFile();
        if (isCreated) {
            logger.info("Le fichier relativePathFile.demo a bien été créé.");
        } else {
            logger.warn("Le fichier relativePathFile.demo n'a pas été créé.");
        }

        // Création d'un fichier avec un chemin relatif,
        // un cran en arrière dans l'arborescence grace à ../
        File otherRelativePathFile = new File("../otherRelativePathFile.demo");
        isCreated = otherRelativePathFile.createNewFile();
        if (isCreated) {
            logger.info("Le fichier otherRelativePathFile.demo a bien été créé.");
        } else {
            logger.warn("Le fichier otherRelativePathFile.demo n'a pas été créé.");
        }

        // getAbsolutePath() permet d'obtenir le chemin absolu d'un fichier.
        logger.info("Chemin absolu de relativePathFile.demo : "
                + relativePathFile.getAbsolutePath());

        // Vérifier mes droits d'écriture, lecture et exécution sur un fichier.
        logger.info("Je peux écrire sur file.demo : " + file.canWrite());
        logger.info("Je peux lire sur file.demo : " + file.canRead());
        logger.info("Je peux exécuter file.demo : " + file.canExecute());

        // Créer une arborescence de dossier avec mkdirs() (avec un 's').
        File folders = new File("c:/DemoFolder/sub/folder");
        isCreated = folders.mkdirs();
        if (isCreated) {
            logger.info("Les dossiers dans DemoFolder ont bien été créés.");
        } else {
            logger.warn("Les dossiers dans DemoFolder n'ont pas été créés.");
        }

        // Renommer un fichier.
        File renamedFile = new File("c:/DemoFolder/renamedFile.demo");
        boolean isRenamed = file.renameTo(renamedFile);
        if (isRenamed) {
            logger.info("Le fichier file.demo a bien été renommé en renamedFile.demo.");
        } else {
            logger.warn("Le fichier file.demo n'a pas été renommé en renamedFile.demo.");
        }

        // Supprimer un fichier
        boolean isDeleted = renamedFile.delete();
        if (isDeleted) {
            logger.info("Le fichier renamedFile.demo a bien été supprimé.");
        } else {
            logger.warn("Le fichier renamedFile.demo n'a pas été supprimé.");
        }

        // Afficher le contenu d'un dossier
        File root = new File("c:/");
        File[] content = root.listFiles();
        String type = "";
        for (File f : content) {
            if (f.isDirectory()) {
                type = "Dossier";
            } else if (f.isFile()) {
                type = "Fichier";
            }
            System.out.println(f.getName() + " : " + type);
        }
    }
}
