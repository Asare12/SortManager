package com.sparta.da.Manager;

import com.sparta.da.Display.DisplayManager;
import com.sparta.da.Sorters.Sorter;

import java.util.Random;

public class SortManager {

    public void sortArray(){
        int[] unsortedArray = createArray(10);
        Sorter sorter = SortFactory.getInstance();
        int[] sortedArray = sorter.getSortingArray(unsortedArray.clone());
        displaySortedArray(unsortedArray, sortedArray, sorter.toString());
    }

    private void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType){
        DisplayManager displayManager = new DisplayManager();
        displayManager.displaySortedArray(unsortedArray,sortedArray, sortType);
    }
    private int[] createArray(int size){
        Random random = new Random();
        int[] unsortedArray = new int[size];

        for(int i = 0; i < size; i++){
            unsortedArray[i] = random.nextInt(size * 10) + 1;
        }
        return unsortedArray;
    }
}
