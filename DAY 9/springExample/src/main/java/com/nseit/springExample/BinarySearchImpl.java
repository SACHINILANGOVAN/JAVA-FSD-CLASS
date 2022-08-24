package com.nseit.springExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlg sortAlg;
    public int binarySearch(int[] ints, int numbersToSearch) {
            //SortAlg sortAlg = new QuickSortArg();
            //QuickSortArg quickSortArg = new QuickSortArg();
            int[] sortNumber = sortAlg.sort(ints);
        System.out.println(sortAlg);
            return 3;
    }
}
