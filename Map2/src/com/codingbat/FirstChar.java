package com.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, return a Map<String, String> with a key for every different
 * first character seen, with the value of all the strings starting with that character appended
 * together in the order they appear in the array.
 */
public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map= new HashMap<String, String>();

        for (String currentString:strings) {
            String firstLetter = currentString.substring(0, 1);

            if (map.containsKey(firstLetter)) {
                map.put(firstLetter, map.get(firstLetter)+currentString);
            } else {
                map.put(firstLetter, currentString);
            }
        }


        return map;

    }

}
