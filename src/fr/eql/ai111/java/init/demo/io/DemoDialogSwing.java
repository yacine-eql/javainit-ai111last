package fr.eql.ai111.java.init.demo.io;


import javax.swing.JOptionPane;

public class DemoDialogSwing {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Veuillez entrer votre nom");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Veuillez entrer votre âge"));
        JOptionPane.showMessageDialog(null,"Fiche utilisateur\r\n" +
                "Nom : " + name + "\r\nAge : " + age);
    }
}
