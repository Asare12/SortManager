package com.sparta.da.Manager;

import com.sparta.da.Display.DisplayManager;
import com.sparta.da.Sorters.Sorter;

import java.util.Random;

public class SortManager {
    private DisplayManager displayManager = new DisplayManager();
    private SortLoader loader = new SortLoader();
//    private String pathName = "C:\\Users\\David Asare\\IdeaProjects\\SortManager\\src\\main\\java\\com\\sparta\\da\\Sorters";

/*        String sizeOfArray = displayManager.displayTerminalSortTypesRequest();*/
//    public void sortArray(){
//       int[] unsortedArray = createArray(10);
//       Sorter sorter = SortFactory.getInstance();
//       int[] sortedArray = sorter.getSortingArray(unsortedArray.clone());
//       displaySortedArray(unsortedArray, sortedArray, sorter.toString());
//    }

    public void sortArray(){
       // String sortType = displayManager.displayTerminalSortTypesRequest(pathName);

        try {
        String sortType = displayManager.displayTerminalSortTypesRequest(loader.getSortersLocation());
        int [] unSortedArray = createArray(10);
        Sorter sorter = loader.getSorter(sortType);
        int[] sortedArray = sorter.getSortingArray(unSortedArray.clone());
        displaySortedArray(unSortedArray,sortedArray,sortType);

        }catch (Exception e){
            e.printStackTrace();
        }
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
/*    private void getSortType(){

    }*/
}
