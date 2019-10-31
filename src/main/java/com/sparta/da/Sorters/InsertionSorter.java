package com.sparta.da.Sorters;

public class InsertionSorter implements Sorter {


    @Override
    public int[] getSortingArray(int[] arrayToSort) {
        if (arrayToSort == null) {
            return null;
        }
        int value;
        int position;

        for (int i = 1; i < arrayToSort.length; i++) {
            value = arrayToSort[i];
            position = i;
            while (position > 0 && arrayToSort[position - 1] > value) {
                arrayToSort[position] = arrayToSort[position - 1];
                position = position - 1;
            }
            arrayToSort[position] = value;

        }

        return arrayToSort;
    }

    @Override
    public String toString() {
        return "Insertion Sorter";
    }
}
