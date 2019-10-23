package com.sparta.da;

import static org.junit.Assert.assertTrue;

import com.sparta.da.Sorters.BubbleSort;
import com.sparta.da.Sorters.Sorter;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SortTests
{
    private Sorter sorter;
    private int [] arrayToSort;

    @Before
    public  void setup(){
        sorter = new BubbleSort();
        arrayToSort = new int[]{2,4,1,3,6,5,7};
    }

    @Test
    public void testArraySorted(){
        //create instance of BubbleSorter
        //create array to test
        //run sort array method
        //compare output is as expected

        int[] sortedArray = sorter.getSortingArray(arrayToSort);
        for (int i = 0; i < arrayToSort.length -1; i++){
            assertTrue(sortedArray[i] <= sortedArray[i + 1]);
        }
    }
    //Array not empty
    //array same size
    //negative values
    //duplicate values
    public void testArrayIsNotEmpty(){

}
}
