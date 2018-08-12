package org.kys.Gof.iterator;

public class BookSelf implements Aggergate<Book>{

    private Book[] books;
    private int bookPosition=0;
    public BookSelf(int bookLength){
        this.books = new Book[bookLength];
    }
    public boolean addBook(Book book){
        if (bookPosition>=books.length){
            return false;
        }
        this.books[bookPosition++]=book;
        return true;
    }

    public Book getBook(int position){
        return books[position];
    }

    public int getBookNumber(){
        return bookPosition;
    }
    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(this);
    }
}
