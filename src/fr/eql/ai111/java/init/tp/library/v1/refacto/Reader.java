package fr.eql.ai111.java.init.tp.library.v1.refacto;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private String name;
    private String surname;
    private String address;
    private List<Book> books = new ArrayList<>();

    public Reader(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    public List<Book> getBooks() {
        return books;
    }
}
