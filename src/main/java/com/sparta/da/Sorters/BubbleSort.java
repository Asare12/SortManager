package com.sparta.da.Sorters;

public class BubbleSort implements Sorter {
    private int temp = 0;

    public int[] getSortingArray(int[] unsortedArray) {
        boolean isSorted;
        do {
            isSorted = false;
            for (int i = 0; i < unsortedArray.length -1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                    isSorted = true;
                }
            }
        }while (isSorted);
        return unsortedArray;
    }
}