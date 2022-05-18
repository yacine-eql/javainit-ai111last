package fr.eql.ai111.java.init.demo.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog4J {

    /*
    Les "Logger" et "LogManager" d'Apache ne font pas partie des librairies
    standard de Java.
    Il faut donc rajouter les 2 archives java (.jar) dans les librairies
    utilisées par ce projet.
    Sous IntelliJ :
    File > Project Structure > Libraries > +
    Puis sélectionner les 2 archives de log4J :
    log4j-core-2.13.3.jar
    log4j-api-2.13.3.jar
     */

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        /*
        Niveau des messages affichés, chaque niveau incluant les niveaux supérieurs :
        ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
         */
        // Messages pour les développeurs.
        logger.debug("Un log utile uniquement pendant la phase de développement");
        // Messages pour l'utilisateur
        logger.info("Un log informatif");
        logger.warn("Un log d'alerte pas trop méchant");
        logger.error("Un log pour signaler une erreur qui n'as pas fait crasher l'appli.");
        logger.fatal("Un log qui signale une erreur fatale susceptible de faire" +
                " crasher l'application.");
    }
}
