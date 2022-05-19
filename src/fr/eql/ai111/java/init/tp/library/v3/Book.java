package fr.eql.ai111.java.init.tp.library.v3;

public class Book {

    private String title;
    private String author;
    private int isbn;
    private Category category;

    public Book(String title, String author, int isbn, Category category) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public Category getCategory() {
        return category;
    }
}
