package com.sparta.da.Manager;

import com.sparta.da.Sorters.InsertionSorter;
import org.apache.log4j.PropertyConfigurator;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Starter
{
private static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
private static Logger log = Logger.getLogger(Starter.class.getName());

    public static void main( String[] args )
    {

        new SortManager().sortArray();

//        initialseLogging();
//        LoggingClass loggingClass = new LoggingClass();
//        loggingClass.setMessage("Welcome to Logging");
//        loggingClass.displayMessage();
    }

    private static void initialseLogging(){
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
        log.trace("Logging initialised");
    }
}
