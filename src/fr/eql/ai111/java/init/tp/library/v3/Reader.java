package fr.eql.ai111.java.init.tp.library.v3;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private String name;
    private String surname;
    private String address;
    private String login;
    private String password;
    private List<Book> books = new ArrayList<>();

    public Reader(String name, String surname, String address, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.login = login;
        this.password = password;
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
    public String getPassword() {
        return password;
    }
    public List<Book> getBooks() {
        return books;
    }
}
