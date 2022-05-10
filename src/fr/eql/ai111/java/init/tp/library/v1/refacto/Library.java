package fr.eql.ai111.java.init.tp.library.v1.refacto;

import javax.swing.JOptionPane;

public class Library {

    Reader reader;
    String menuInput = "";
    String message = "";

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
        if (reader == null) {
            String name = JOptionPane.showInputDialog("Veuillez renseigner votre prénom");
            String surname = JOptionPane.showInputDialog("Veuillez renseigner votre nom");
            String address = JOptionPane.showInputDialog("Veuillez renseigner votre adresse");
            reader = new Reader(name, surname, address);
        }
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
        String input = JOptionPane.showInputDialog("Combien de livres souhaitez-vous enregistrer ?");
        int nbBooks = Integer.parseInt(input);
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
            int isbn = Integer.parseInt(JOptionPane.showInputDialog("ISBN du livre"));
            Category category = Category.valueOf(choice.toUpperCase());
            Book book = new Book(title, author, isbn, category);
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
