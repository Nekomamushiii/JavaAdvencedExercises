package genericsCustomListSorter;

import genericsCustomList.CustomList;

import java.util.Collections;

public class Sorter extends CustomList {
    public static <T extends Comparable<T>> void sort(CustomList<String> myList){
        //Collections.sort();
    }

}
