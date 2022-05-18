package fr.eql.ai111.java.init.demo.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private static final Logger logger = LogManager.getLogger();

    private static final String GOOD_FILE = "myFile.txt";
    private static final String BAD_FILE = "myFolder/myFile.txt";
    private static final String GOOD_CLASS = "fr.eql.ai111.java.init.demo.oop.Dog";
    private static final String BAD_CLASS = "Toto";

    private File myFile;
    private String simpleClassName;

    public void writeClassNameInFile() throws ClassWritingException {
        int fileChoice = Integer.parseInt(JOptionPane.showInputDialog(
                        GOOD_FILE + "(1) ou " +
                        BAD_FILE + "(2) ?"));
        int classChoice = Integer.parseInt(JOptionPane.showInputDialog(
                        GOOD_CLASS + "(1) ou " +
                        BAD_CLASS + "(2) ?"));

        String filePath = "";
        switch (fileChoice) {
            case 1:
                filePath = GOOD_FILE;
                break;
            case 2:
                filePath = BAD_FILE;
                break;
            default:
        }

        String className = "";
        switch (classChoice) {
            case 1:
                className = GOOD_CLASS;
                break;
            case 2:
                className = BAD_CLASS;
                break;
            default:
        }

        /*
        Chacune de ces 3 méthodes privées peut jeter une 'checked exception' personnalisée
        nommée 'ClassWritingException'. Elle doit être gérée.
        Une des manières de gérer cette exception est de la rejeter à la méthode appelante
        en accolant le mot clé 'throws' (avec un 's') et le nom de la classe de l'exception
        à la signature de la méthode présente.
         */
        createFile(filePath);
        retrieveSimpleClassName(className);
        writeSimpleNameInFile();
    }

    /*
    La méthode createNewFile() de 'File' génère une 'checked exception', vérifiée
    à la compilation, donc devant être obligatoirement gérée afin que le code puisse compiler.
    Ici, elle est attrapée dans le bloc 'try/catch' qui renvoie une autre 'checked exception'
    personnalisée qui sera passée à la méthode appelante.
     */
    private void createFile(String filePath) throws ClassWritingException {
        myFile = new File(filePath);
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new ClassWritingException("La création du fichier " + filePath + " a échoué. " +
                    "\r\nChoisissez un chemin valide", e);
        }
    }

    private void retrieveSimpleClassName(String className) throws ClassWritingException {
        Class myClass = null;
        try {
            myClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new ClassWritingException("Il n'y a pas de classe ayant pour nom qualifié " +
                    className + ".\r\nVeuillez en préciser une autre.", e);
        }
        simpleClassName = myClass.getSimpleName();
    }

    private void writeSimpleNameInFile() throws ClassWritingException {
        int choice = Integer.parseInt(JOptionPane.showInputDialog(
                "Pointer vers le bon dossier ? Oui (1) ou Non (2)"));
        File chosenFile = null;
        switch (choice) {
            case 1 :
                chosenFile = myFile;
                break;
            case 2 :
                chosenFile = new File("toto/titi");
                break;
            default:
        }
        try {
            FileWriter fw = new FileWriter(chosenFile, false);
            fw.write(simpleClassName);
            fw.close();
        } catch (IOException e) {
            throw new ClassWritingException("Une erreur s'est produire au moment de l'écriture" +
                    " du mot '" + simpleClassName + "' dans le fichier.", e);
        }
    }
}
