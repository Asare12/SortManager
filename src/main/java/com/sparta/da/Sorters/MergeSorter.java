package com.sparta.da.Sorters;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MergeSorter implements Sorter {


    @Override
    public int[] getSortingArray(int[] arrayToSort) {
        int arraySize = arrayToSort.length;
        int index;
        int[] leftSide = new int[arraySize / 2];
        int[] rightSide = new int[arraySize - leftSide.length];
        int[] collection = new int[0];

        if (leftSide.length == 1 && rightSide.length == 1) {
            collection = mergeArray(leftSide, rightSide);
        }

        leftSide = Arrays.copyOfRange(arrayToSort, 0, leftSide.length);
        rightSide = Arrays.copyOfRange(arrayToSort, rightSide.length, arrayToSort.length);

//        for (index = 0; index  )
        if(leftSide.length != 1 && rightSide.length != 1){
            getSortingArray(leftSide);
            getSortingArray(rightSide);
        }

        return collection;
    }

    private int[] mergeArray(int[] array1, int[] array2){
        int firstArrayLength = array1.length;
        int secondArrayLength = array2.length;
        int[] mergeArray = new int[firstArrayLength + secondArrayLength];
        int indexA = 0, indexB = 0, mergeArrayIndex;


        for (mergeArrayIndex = 0; mergeArrayIndex < mergeArray.length; mergeArrayIndex++) {
            if (indexA == array1.length) {
                mergeArray[mergeArrayIndex] = array2[indexB];
                indexB++;
            } else if (indexB == array2.length) {
                mergeArray[mergeArrayIndex] = array1[indexA];
                indexA++;
            }
            else if (array1[indexA] < array2[indexB]) {
                mergeArray[mergeArrayIndex] = array1[indexA];
                indexA++;
            } else {
                mergeArray[mergeArrayIndex] = array2[indexB];
                indexB++;
            }
        }


        return mergeArray;
    }
}
