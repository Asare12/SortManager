package com.sparta.da.Manager;

import com.sparta.da.Sorters.MergeSorter;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Starter
{
//    static void printFun(int test)
//    {
//        if (test < 1)
//            return;
//
//        else {
//            System.out.printf("%d ", test);
//
//            // Statement 2
//            printFun(test - 1);
//
//            System.out.printf("%d ", test);
//            return;
//        }
//    }
    public static void main( String[] args )
    {
//        int test = 3;
//        printFun(test);
        MergeSorter mergeSorter = new MergeSorter();
        int[] arraySort = {2,3,1,5,6,4};
        int[] result = mergeSorter.getSortingArray(arraySort);
        System.out.println(Arrays.toString(result));
    }
}
