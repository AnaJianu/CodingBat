package com.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key
 * for each different string, with the value the number of times that string appears in the array.
 */
public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map= new HashMap<String, Integer>();

        for (int i=0; i<strings.length;i++) {
            String stringToCompare=strings[i];
            int count=0;
            for (int j=0; j<strings.length;j++) {
                if (stringToCompare.equals(strings[j])) {
                    count++;
                }
            }
            map.put(stringToCompare, count);
        }

        return map;
    }
}
