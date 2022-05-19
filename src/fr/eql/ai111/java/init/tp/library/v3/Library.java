package fr.eql.ai111.java.init.tp.library.v3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.JOptionPane;

public class Library {

    Reader reader;
    String menuInput = "";
    String message = "";
    ReaderDAO dao = new ReaderDAO();

    public void execute() {
        JOptionPane.showMessageDialog(null, "Bienvenue dans la librairie");
        // Je boucle sur les menus utilisateur tant que l'utilisateur ne souhaite pas quitter l'application
        do {
            registerReader();
            showMenu();

            switch (menuInput) {
                case "i":
                    displayReader();
                    break;
                case "e":
                    registerBooks();
                    break;
                case "l":
                    showBooks();
                    break;
                case "q":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Mauvaise option.");
            }
        } while (!menuInput.equals("q"));
        JOptionPane.showMessageDialog(null, "Au revoir et à bientôt dans la bibliothèque.");
    }

    private void registerReader() {
        String login;
        String password;
        // On boucle jusqu'à ce qu'un reader enregistré se connecte.
        do {
            String input = JOptionPane.showInputDialog("Créer un compte (c) ou s'identifier (i) ?");
            switch (input) {
                case "c":
                    String name = JOptionPane.showInputDialog("Veuillez renseigner votre prénom");
                    String surname = JOptionPane.showInputDialog("Veuillez renseigner votre nom");
                    String address = JOptionPane.showInputDialog("Veuillez renseigner votre adresse");
                    login = JOptionPane.showInputDialog("Veuillez renseigner votre login");
                    password = JOptionPane.showInputDialog("Veuillez renseigner votre password");
                    /*
                    Si la méthode 'createAccount' retourne false, alors le fichier utilisateur
                    n'as pas été créé car un autre portant le même nom (correspondant au login
                    entré) existe déjà.
                     */
                    boolean isCreated = dao.createAccount(name, surname, address, login, password);
                    if (!isCreated) {
                        JOptionPane.showMessageDialog(null,
                                "Ce login n'est pas disponible. " +
                                "Veuillez en choisir un autre.");
                    }
                    break;
                case "i":
                    login = JOptionPane.showInputDialog("Veuillez renseigner votre login");
                    password = JOptionPane.showInputDialog("Veuillez renseigner votre password");
                    reader = dao.connect(login, password);
                    if (reader == null) {
                        JOptionPane.showMessageDialog(null,
                                "Ces login/password sont incorrect(s)");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Bienvenue " + reader.getName() + " " + reader.getSurname());
                    }
                    break;
                default:
            }
        } while (reader == null);
    }

    private void showMenu() {
        message = "Veuillez selectionner une option:" +
                "\r\nAfficher fiche utilisateur (i)" +
                "\r\nEnregistrer des livres (e)";
        if (!reader.getBooks().isEmpty()) {
            message += "\r\nAfficher les livres (l)";
        }
        message += "\r\nQuitter (q)";
        menuInput = JOptionPane.showInputDialog(message);
    }

    private void displayReader() {
        JOptionPane.showMessageDialog(null, "Fiche utilisateur :" +
                "\r\nPrénom : " + reader.getName() +
                "\r\nNom : " + reader.getSurname() +
                "\r\nAdresse : " + reader.getAddress());
    }

    private void registerBooks() {
        boolean isNumber = false;
        int nbBooks = 0;
        do {
            try {
                String input = JOptionPane.showInputDialog(
                        "Combien de livres souhaitez-vous enregistrer ?");
                nbBooks = Integer.parseInt(input);
                isNumber = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Ceci n'est pas un nombre. Veuillez recommencer votre saisie.");
            }
        } while (!isNumber);
        for (int i = 0; i < nbBooks; i++) {
            Category[] categories = Category.values();
            message = "";
            for (Category c : categories) {
                message += c.toString().toLowerCase() + "\r\n";
            }
            String choice = JOptionPane.showInputDialog("Catégorie du livre : " +
                    "\r\n" + message);

            String title = JOptionPane.showInputDialog("Titre du livre");
            String author = JOptionPane.showInputDialog("Auteur du livre");
            isNumber = false;
            int isbn = 0;
            do {
                try {
                    isbn = Integer.parseInt(JOptionPane.showInputDialog("ISBN du livre"));
                    isNumber = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                            "Ceci n'est pas un nombre. Veuillez recommencer votre saisie.");
                }
            } while (!isNumber);

            Category category = Category.valueOf(choice.toUpperCase());
            Book book = new Book(title, author, isbn, category);
            // On récupère la liste (le contenant, avec le getter)
            // du reader pour en changer le contenu (avec .add())
            reader.getBooks().add(book);
        }
    }

    private void showBooks() {
        message = "Liste des livre de " + reader.getName() + " :\r\n";
        for (Book b : reader.getBooks()) {
            message += "\r\n\tTitre : " + b.getTitle() +
                    "\r\n\tAuteur : " + b.getAuthor() +
                    "\r\n\tISBN : " + b.getIsbn() +
                    "\r\n\tCatégorie : " + b.getCategory().toString().toLowerCase() +
                    "\r\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
