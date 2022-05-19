package fr.eql.ai111.java.init.tp.library.v3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderDAO {

    private static final Logger logger = LogManager.getLogger();

    public boolean createAccount(
            String name,
            String surname,
            String address,
            String login,
            String password) {
        File folder = new File("Library");
        // Si le dossier n'existe pas, je le crée.
        if (!folder.exists()) {
            folder.mkdir();
        }
        boolean isCreated = false;
        // Je déclare le fichier utilisateur
        File userFile = new File(folder + "/" + login + ".lib");
        try {
            // Je tente de créer le fichier sur le disque, s'il n'existe pas déjà.
            isCreated = userFile.createNewFile();
            if (isCreated) {
                FileWriter fw = new FileWriter(userFile, false);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(name);
                bw.newLine();
                bw.write(surname);
                bw.newLine();
                bw.write(address);
                bw.newLine();
                bw.write(login);
                bw.newLine();
                bw.write(password);
                bw.close();
                fw.close();
            }
        } catch (IOException e) {
            logger.warn("Le fichier utilisateur n'a pas été créé.");
        }
        return isCreated;
    }

    public Reader connect(String login, String password) {
        File userFile = new File("Library/" + login + ".lib");
        Reader reader = null;
        if (!userFile.exists()) {
            return null;
        }
        try {
            FileReader fr = new FileReader(userFile);
            BufferedReader br = new BufferedReader(fr);
            String nameInFile = br.readLine();
            String surnameInFile = br.readLine();
            String addressInFile = br.readLine();
            String loginInFile = br.readLine();
            String passwordInFile = br.readLine();
            reader = new Reader(
                    nameInFile, surnameInFile, addressInFile, loginInFile, passwordInFile);
            br.close();
            fr.close();
        } catch (IOException e) {
            logger.warn("Un problème s'est produit lors de la lecture du fichier utilisateur.");
        }
        // Si le password est correct, on retourne l'instance du reader.
        if (reader.getPassword().equals(password)) {
            return reader;
        } else {
            return null;
        }
    }
}
