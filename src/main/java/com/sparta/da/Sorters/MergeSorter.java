package com.sparta.da.Sorters;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MergeSorter implements Sorter {


    @Override
    public int[] getSortingArray(int[] unsortedArray) {
        sortedArray(unsortedArray);
        return unsortedArray;
    }
    public void sortedArray(int[] unsortedArray){
        if (unsortedArray.length < 2) {
            return;
        }
        int arraySize = unsortedArray.length;
        int midPoint = arraySize/2;
        int[] leftSide = populateSplitArray(midPoint, 0, unsortedArray);
        int[] rightSide = populateSplitArray(arraySize-midPoint, midPoint, unsortedArray);

        sortedArray(leftSide);
        sortedArray(rightSide);

        int [] combineArray = mergeArray(leftSide, rightSide);
        System.arraycopy(combineArray,0,unsortedArray,0,combineArray.length);
    }
    private int[] populateSplitArray(int length, int startIndex, int[] inputArray){
        int[] splitArray = new int[length];
        System.arraycopy(inputArray, startIndex, splitArray,0,length);
        return splitArray;
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
    @Override
    public String toString(){
        return "Merge Sorter";
    }
}
