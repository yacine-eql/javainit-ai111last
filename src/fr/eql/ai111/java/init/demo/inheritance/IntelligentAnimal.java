package fr.eql.ai111.java.init.demo.inheritance;

/*
Une interface est une sorte de classe au contenu
entièrement abstrait.
Tous les attributs, si présents, doivent être statique,
mais il est recommandé de ne pas en mettre.
 */
public interface IntelligentAnimal {

    /*
    Toutes les méthodes d'une interface sont abstraites
    et publique. Il n'est donc pas nécessaire d'écrire
    ces deux mots-clé.
     */
    void hideItem(String item);

}
