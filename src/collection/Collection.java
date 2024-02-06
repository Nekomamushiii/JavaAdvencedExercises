package collection;

import listlyIterator.ListyIterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class Collection implements Iterable<ListyIterator> {
    @Override
    public Iterator<ListyIterator> iterator() {
        return null;
    }
    private final class IteratorListy implements Iterator<ListyIterator>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public ListyIterator next() {
            return null;
        }
    }

    @Override
    public void forEach(Consumer<? super ListyIterator> action) {
        Iterable.super.forEach(action);
    }
}
