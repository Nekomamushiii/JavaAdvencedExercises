package IteratorsComparators;

import java.util.Comparator;

public class BookComparable implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getTitle().compareTo(o2.getTitle())==0){
            if(o1.getYear()>o2.getYear())
                return 1;
            else if(o1.getYear()< o2.getYear())
                return -1;
            return 0;
        }else
            return o1.getTitle().compareTo(o2.getTitle());
    }
}
