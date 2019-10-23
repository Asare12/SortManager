package com.sparta.da.Display;

import com.sparta.da.Sorters.Sorter;

import java.util.Arrays;

public class DisplayManager {

    public void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType){
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted using " + sortType);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
