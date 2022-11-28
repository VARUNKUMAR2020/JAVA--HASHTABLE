package com.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap 
{
    public static void main( String[] args )
    {
        System.out.println( "Hash Map" );
        String str = "To be or not to be"; 
        printFreq(str); 
    } 
    static void printFreq(String str) 
    { 
        // split the string into words 
        String a[] = str.split(" "); 
  
        // create LinkedHashMap to store the freq of element 
        LinkedHashMap<String, Integer> 
            hm = new LinkedHashMap<String, Integer>(); 
  
        // count frequency of each word in the string 
        for (String i : a) { 
            Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
  
        // print the occurrence of each element in the string 
        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times"); 
        } 
    } 
}

