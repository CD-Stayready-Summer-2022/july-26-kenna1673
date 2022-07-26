package com.codedifferently;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i< input.length(); i++) {
            Character current = input.charAt(i);
            int count = map.getOrDefault(current, 0);
            map.put(current, ++count);
        }

        StringBuilder builder = new StringBuilder();
        for (Character current : map.keySet()) {
            builder.append(String.format("%s:%d ", current, map.get(current)));
        }
        return builder.toString().trim();
    }
}
