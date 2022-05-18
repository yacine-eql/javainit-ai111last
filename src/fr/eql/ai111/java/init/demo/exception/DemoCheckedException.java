package fr.eql.ai111.java.init.demo.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoCheckedException {

    private static final Logger logger = LogManager.getLogger();

    /*
    La méthode 'writeClassNameInFile()' de 'Writer' génère une 'checked exception', vérifiée
    à la compilation, devant donc être obloigatoirement gérée afin que le code puisse compiler.
    C'est une exception faisant partie d'un scénario possible et attendu.
    Ici, on boucle sur la méthode jusqu'à ce que l'utilisateur ait fourni les éléments
    corrects pour ne plus générer d'exception.
     */
    public static void main(String[] args) {

        Writer writer = new Writer();
        boolean isWritten = false;
        while (!isWritten) {
            try {
                writer.writeClassNameInFile();
                isWritten = true;
                logger.info("Le fichier a bien été créé. Un nom de classe y a été inscrit.");
            } catch (ClassWritingException e) {
                logger.warn(
                        "Impossible d'écrire le nom de la classe demandée dans le fichier précisé"
                        , e);
            }
        }
    }
}
