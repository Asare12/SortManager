package com.sparta.da.Manager;

import com.sparta.da.Sorters.Sorter;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class SortLoader {

    private String name;
    private static final String SRC = "/src/main/java/";

    {
        String classpath = Sorter.class.getName();
        name = classpath.substring(0, classpath.lastIndexOf("."));
    }

    public String getSortersLocation() {
        String classpathStr = System.getProperty("user.dir");
        String classpath = (classpathStr + SRC + name.replace(".", "/"));
        return classpath;
    }

    public Sorter getSorter(String sorType) {
        try {
            String sortName = name + "." + sorType.substring(0, sorType.lastIndexOf("."));
            Class selectedSorter = Class.forName(sortName);
            return (Sorter) selectedSorter.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
