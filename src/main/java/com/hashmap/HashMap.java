package com.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        System.out.println("Hash Map");

        // Custom string as input
        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        // method called to check frequency
        printFreq(str);

        // Word to be removed from above string
        String word = "avoidable";

        // Calling method to remove the string
        remove(str, word);
    }

    static void remove(String str, String word) {
        // Split the string using split() method
        String msg[] = str.split(" ");
        String new_str = "";

        // Iterating the string using for each loop
        for (String words : msg) {

            // If desired word is found
            if (!words.equals(word)) {

                // Concat the word not equal to the given
                // word
                new_str += words + " ";
            }
        }

        // Print the new String
        System.out.print(new_str);
    }

    static void printFreq(String str) {
        // split the string into words
        String a[] = str.split(" ");

        // create LinkedHashMap to store the freq of element
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

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
