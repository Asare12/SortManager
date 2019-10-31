package com.sparta.da.Display;

import com.sparta.da.Sorters.Sorter;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class DisplayManager {

    private Scanner scanner = new Scanner(System.in);

    public String displayTerminalSortTypesRequest(String path){
        System.out.println("Enter the number of the sorter you wish to use ");
        String[] sortNames = getMenuItems(path);
        int sortType = scanner.nextInt();
        return sortNames[sortType-1];
    }
    private String[] getMenuItems(String path){
        AtomicInteger index = new AtomicInteger(1);
        File sortDirectory = new File(path);
        List<String> namesAsList = Arrays.asList(sortDirectory.list());
        namesAsList.stream()
                .filter(fileName -> !fileName.equals("Sorter.java"))
                .map(fileName -> fileName.substring(0,fileName.indexOf(".")))
                .sorted()
                .forEach(name -> System.out.println(index.getAndIncrement() + "." + name));
               // .forEach(System.out::println);
   //     String[] names = sortDirectory.list((filteredDir, fileNname) -> !fileNname.equals("Sorter.java"));

//        String[] names = sortDirectory.list();
//        Arrays.sort(names !=null ? names: new String[0]);
//        int index = 1;
//        for (String name: names){
//            if (!name.equals("Sorter.java")){
//                name = name.substring(0, name.lastIndexOf("."));
//                System.out.println(index + ". " + name);
//                index++;
//            }
//        }
        return namesAsList.toArray( new String[namesAsList.size()]);
    }
    public void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType){
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted using " + sortType);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
