package com.learning.core.day2session1;
import java.util.HashSet;
public class D02P05_8 {
public static String canSplitIntoFourStrings(String s) {
        int n = s.length();
       
        // Iterate through all possible splits
        for (int i = 1; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Extract four substrings
                    String substr1 = s.substring(0, i);
                    String substr2 = s.substring(i, j);
                    String substr3 = s.substring(j, k);
                    String substr4 = s.substring(k, n);
                   
                    // Check if all substrings are distinct
                    HashSet<String> set = new HashSet<>();
                    set.add(substr1);
                    set.add(substr2);
                    set.add(substr3);
                    set.add(substr4);
                   
                    if (set.size() == 4) {
                        return "Yes";
                    }
                }
            }
        }
       
        return "No";
    }

    public static void main(String[] args) {
        String input1 = "Helloworld";
        String input2 = "aaabb";

        System.out.println("Output for input 1 Helloworld: " + canSplitIntoFourStrings(input1));
        System.out.println("Output for input 2 aaabb: " + canSplitIntoFourStrings(input2));
    }
}