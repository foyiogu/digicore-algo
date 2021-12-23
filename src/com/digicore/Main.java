package com.digicore;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("cry", "bat", "bath", "bay");
        String character = "228";

        System.out.println(multitap(list, character));
    }
    public static List<String> multitap(List<String> input, String character){

        List<String> result = new ArrayList<>();

        Map<Character, List<Character>> map = new HashMap<>();
        map.put('2', List.of('a', 'b','c'));
        map.put('3', List.of('d', 'e','f'));
        map.put('4', List.of('g', 'h','i'));
        map.put('5', List.of('j', 'k','l'));
        map.put('6', List.of('m', 'n','o'));
        map.put('7', List.of('p', 'q','r', 's'));
        map.put('8', List.of('t', 'u','v'));
        map.put('9', List.of('w', 'x','y', 'z'));

        for (String s : input) {

            int min = Math.min(s.length(), character.length());

            for (int i = 0; i < min; i++) {
                if(!map.get(character.charAt(i)).contains(s.charAt(i))){
                    break;
                }
                if(i == min -1){
                    result.add(s);
                }
            }
        }

        return result;
    }


}
