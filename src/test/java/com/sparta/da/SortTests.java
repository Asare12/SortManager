package com.sparta.da;

import static org.junit.Assert.assertTrue;

import com.sparta.da.Sorters.BinaryTreeSorter;
import com.sparta.da.Sorters.InsertionSorter;
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
    private int [] emptyArray;
    private int [] arrayWithDuplicates;
    private int [] negativeArray;

    @Before
    public  void setup(){
        sorter = new BinaryTreeSorter();
        arrayToSort = new int[]{2,4,1,3,6,5,7};
        emptyArray = new int[]{};
        arrayWithDuplicates = new int[]{25,7,9,31,25,7,15};
        negativeArray = new int[]{20,-5,7,-44,27,-13,12};

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
    @Test
    public void testArrayIsNotEmpty(){
    int[] sortedArray = sorter.getSortingArray(emptyArray);
    assertTrue(sortedArray.length < 1);
    }


    //array same size
/*    @Test
    public void testArray*/
    //negative values
    @Test
    public void testArrayWithNegatives(){
        int[] sortedArray = sorter.getSortingArray(arrayWithDuplicates);
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            assertTrue(sortedArray[i] <= sortedArray[i + 1]);

        }
    }

    //duplicate values
    @Test
    public void testArrayWithDuplicates() {
        int[] sortedArray = sorter.getSortingArray(arrayWithDuplicates);
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            assertTrue(sortedArray[i] <= sortedArray[i + 1]);

        }
    }
}
