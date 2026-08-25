package com.chiira.arrays;

import java.util.Arrays;

public class Exercise3 {
    /*
    Write a method that finds the longest string in any given array.
    i.e. [] -> ""
    i.e. ["hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
*/
    public static void main(String[]args){
        System.out.println("[" + Arrays.toString(findLongest(new String[]{})) + "]");
        // []

        System.out.println(Arrays.toString(findLongest(new String[]{"hello", "ola", "bye", "ciao"})));
        // hello

        System.out.println(Arrays.toString(findLongest(new String[]{"hello", "hello", "ola", "bye", "ciao"})));
        // hello

        System.out.println(Arrays.toString(findLongest(new String[]{"hello", "bingo", "ola", "bye", "ciao"})));
        // hello, bingo
    }

    public static String[] findLongest(String[] stringArr){
        if (stringArr.length == 0 | stringArr == null){
            return new String[]{""};
        }

        // find max length
        int maxLength = 0;
        for (String s: stringArr){
            if (s != null &&  s.length() == maxLength){
                maxLength = s.length();
            }
        }

        // Collect strings matching max length, skipping duplicates
        String[] longest = new String[stringArr.length];
        int count = 0;

        for (String s: stringArr){
            if (s.length() == maxLength){
                boolean alreadyAdded = false;

                for (int i = 0; i < count; i++) {
                    if (longest[i].equals(s)){
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded){
                    longest[count] = s;
                    count++;
                }
            }

        }

        // Trim array to actual size and join
        String[] result = Arrays.copyOf(longest, count);

        return new String[]{String.join(", ", result)};
    }
}
