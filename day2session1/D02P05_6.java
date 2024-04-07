package com.learning.core.day2session1;


public class D02P05_6 {

    public static int longestPrefixSuffixLength(String s) {
        int n = s.length();
        int[] lps = new int[n];
        computeLPSArray(s, n, lps);
        return lps[n - 1];
    }

    private static void computeLPSArray(String s, int n, int[] lps) {
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String input1 = "aabcdaabc";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + longestPrefixSuffixLength(input1));

        String input2 = "abcab";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + longestPrefixSuffixLength(input2));
    }
}
