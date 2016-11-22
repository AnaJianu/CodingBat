package com.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and
 * its value is true if that string appears 2 or more times in the array.
 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
 */
public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {


        Map<String, Boolean> map=new HashMap<String,Boolean>();

        for (String currentString:strings) {
            if (map.containsKey(currentString)) {
                map.put(currentString, true);
            } else {
                map.put(currentString,false);
            }

        }
        return map;

    }
}
