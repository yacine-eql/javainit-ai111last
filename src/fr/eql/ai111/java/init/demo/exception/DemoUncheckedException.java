package fr.eql.ai111.java.init.demo.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoUncheckedException {

    private static final Logger logger = LogManager.getLogger();

    /*
    On décide de catcher les 'unchecked exceptions' afin d'afficher des messages plus précis
    à l'attention de ceux qui peuvent régler ce problème.
     */
    public static void main(String[] args) {

        float result;
        Calculator calculator = new Calculator();

        try {
            logger.info("Début du calcul");
            result = calculator.calculate();
            logger.info("Le résultat du calcul est le suivant : " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("Un développeur a permis d'accéder à l'index d'un tableau " +
                    "sans vérifier au préalable sa taille.", e);
        } catch (ArithmeticException e) {
            logger.error("Un développeur a permis d'effectuer une division par 0 !", e);
        } finally {
            System.out.println("\r\nJe suis passé dans le calculateur.");
        }
    }
}
