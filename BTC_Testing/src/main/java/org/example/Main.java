package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(takingAttendance(new String[]{"Chruschtschov", "Hristo", "Nguyen", "Dmitry", "Madchen", "Fujiyama", "Connor"}));
//        System.out.println(takingAttendance(new String[]{"Archibald"}));
    }

    public static int takingAttendance(String[] classList) {
        HashMap<Character, Integer> map = new HashMap();

        char[] vowel = new char[]{'a', 'e', 'o', 'i', 'u', 'y'};

        //put vowel to map
        for (char c : vowel) {
            map.put(c, 1);
        }
        int baseTime = 5;
        //handle

        int totalTime = 0;
        for (String word : classList) {
            int vowelTime = 0;
            String lowerCase = word.toLowerCase();

            int temp = 0;
            for (int i = 0; i < lowerCase.length(); i++) {
                if (map.get(lowerCase.charAt(i)) == null) {
                    System.out.println(lowerCase.charAt(i));
                    temp++;
                } else {
                    vowelTime += Math.pow(2, temp - 1);
                    temp = 0;
                }

                if (i == lowerCase.length() - 1) {
                    vowelTime += Math.pow(2, temp - 1);
                }

            }
            totalTime += vowelTime + baseTime;
//            System.out.println(totalTime);
        }
        return totalTime;
    }
}