package com.codingbat;

/**
 * Created by ana on 27/10/16.
 */
public class MakeTags {

    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    public static void main(String[] args) {
        MakeTags mt=new MakeTags();
        System.out.println(mt.makeTags("i", "Yay"));
        System.out.println(mt.makeTags("i", "Hello"));
        System.out.println(mt.makeTags("cite", "Yay"));
    }
}
