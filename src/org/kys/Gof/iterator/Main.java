package org.kys.Gof.iterator;

public class Main {
    public static void main(String[] args) {
        BookSelf bookSelf = new BookSelf(3);
        bookSelf.addBook(new Book("海底两万里"));
        bookSelf.addBook(new Book("堂吉诃德"));
        bookSelf.addBook(new Book("飘"));
        Iterator<Book> iterator = bookSelf.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getBookname());
        }
    }
}
