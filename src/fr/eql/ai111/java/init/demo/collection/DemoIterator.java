package fr.eql.ai111.java.init.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 10, 20, 30, 30, 40, 50);

        // Il ne faut pas retirer des éléments d'une liste pendant
        // qu'on itère dessus.
//        for (int i = 0; i < integers.size(); i++) {
//            if (integers.get(i) == 30) {
//                integers.remove(i);
//            }
//        }

        // L'objet Iterator permet de faire des opérations sur une liste
        // au cours de son itération.
        // La méthode iterator() de List permet d'utiliser l'Iterator sur
        // la liste qui est ainsi modifiée.
        Iterator<Integer> integersIterator = integers.iterator();
        while (integersIterator.hasNext()) {
            if (integersIterator.next() == 30) {
                integersIterator.remove();
            }
        }
        System.out.println(integers);
    }
}
