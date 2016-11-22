package com.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 * always with the value 0. For example the string "hello" makes the pair "hello":0.
 *
 */
public class Word0 {

    public Map<String, Integer> word0(String[] strings) {

        Map<String,Integer> map=new HashMap<String,Integer>();
        for (String s: strings) {
            map.put(s,0);
        }

        return map;
    }
}
