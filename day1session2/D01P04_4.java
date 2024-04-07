package com.learning.core.day1session2;

import java.util.ArrayList;
import java.util.List;

public class D01P04_4  {
   public static List<String> findCombinations(int[] nums, int k) {
       List<String> result = new ArrayList<>();
       backtrack(nums, k, 0, new StringBuilder(), result);
       return result;
   }

   private static void backtrack(int[] nums, int k, int start, StringBuilder path, List<String> result) {
       if (path.length() == k) {
           result.add(path.toString());
           return;
       }

       for (int i = start; i < nums.length; i++) {
           path.append(nums[i]);
           backtrack(nums, k, i + 1, path, result);
           path.deleteCharAt(path.length() - 1);
       }
   }

   public static void main(String[] args) {
       int[] input = {1, 2, 3};
       int k = 2;
       List<String> combinations = findCombinations(input, k);
       System.out.println("Output:");
       for (String combination : combinations) {
           System.out.println(combination);
       }
   }
}