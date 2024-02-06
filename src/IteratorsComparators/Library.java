package IteratorsComparators;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Library<Book> implements Iterable<Book>{
    private Book[] books;

    public Library(Book...books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
       return new LibraryIterator();
    }
    private final class LibraryIterator implements Iterator<Book>{
        private int count=0;
        @Override
        public boolean hasNext() {
            if(this.count< books.length)
                return true;
            return false;
        }

        @Override
        public Book next() {
           return books[count++];
        }
    }

    @Override
    public void forEach(Consumer<? super Book> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Book> spliterator() {
        return Iterable.super.spliterator();
    }

}
