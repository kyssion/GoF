package org.kys.Gof.iterator;

public class Book {
    private String bookname;

    public Book(String name) {
        this.bookname = name;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}
