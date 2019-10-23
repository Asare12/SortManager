package com.sparta.da.Manager;

import com.sparta.da.Sorters.BubbleSort;
import com.sparta.da.Sorters.MergeSorter;
import com.sparta.da.Sorters.Sorter;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class SortFactory {

    private static final String PATH = "resources/sort.properties";
    private static final String KEY = "sort";

    public static Sorter getInstance() {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader(PATH));
            String sortType = properties.getProperty(KEY);
            Class selectedSorter = Class.forName(sortType);
            return (Sorter) selectedSorter.getDeclaredConstructor().newInstance();
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException  e) {
          //  e.printStackTrace();
            System.out.println("File not found - return default sorter");
            return new BubbleSort();
        }finally {
            //
        }
    }

}
