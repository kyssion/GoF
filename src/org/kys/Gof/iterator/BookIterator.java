package org.kys.Gof.iterator;

public class BookIterator implements Iterator<Book> {
    private BookSelf bookSelf = null;

    private int bookSelfPosiont = 0;

    public BookIterator(BookSelf bookSelf) {
        this.bookSelf = bookSelf;
    }

    @Override
    public boolean hasNext() {
        if (bookSelfPosiont >= bookSelf.getBookNumber()) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Book next() {
        return bookSelf.getBook(bookSelfPosiont++);
    }
}
