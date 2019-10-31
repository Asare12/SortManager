package com.sparta.da;

import com.sparta.da.Sorters.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class PerformanceTester {
    private int[] unsortedArray;
    private static int [] arrayToSort;

    @BeforeClass
    public static void classSetup(){
        Random random = new Random();
        arrayToSort = new int[100];
        for (int i = 0; i < arrayToSort.length; i++){
            arrayToSort[i] = random.nextInt(1000)+1;
        }
    }

    @Before
    public void setup(){
        unsortedArray = arrayToSort.clone();
    }


    @Test
    public void testBubbleSorter(){
        System.out.println("**************" + Arrays.toString(unsortedArray) + "****************");
        Sorter sorter = new BubbleSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortingArray(unsortedArray);
        long end = System.nanoTime();
        printResult( sorter.toString(), end - start, sortedArray);

    }
    @Test
    public void testMergeSorter(){
        System.out.println("**************" + Arrays.toString(unsortedArray) + "****************");
        Sorter sorter = new MergeSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortingArray(unsortedArray);
        long end = System.nanoTime();
        printResult( sorter.toString(), end - start, sortedArray);

    }

    @Test
    public void testInsertionSorter(){
        System.out.println("**************" + Arrays.toString(unsortedArray) + "****************");
        Sorter sorter = new InsertionSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortingArray(unsortedArray);
        long end = System.nanoTime();
        printResult( sorter.toString(), end - start, sortedArray);

    }
    @Test
    public void testBinaryTreeSorter(){
        System.out.println("**************" + Arrays.toString(unsortedArray) + "****************");
        Sorter sorter = new BinaryTreeSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortingArray(unsortedArray);
        long end = System.nanoTime();
        printResult( sorter.toString(), end - start, sortedArray);

    }
    private void printResult(String sorter, long time, int[] arrayToSort){
        DecimalFormat decimalFormat = new DecimalFormat("###,###.####");
        System.out.println(sorter + ":");
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("time taken: "+ (decimalFormat.format(time))  + " nano seconds");
    }
}
