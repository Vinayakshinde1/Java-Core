package com.learning.core.day2session1;

	import java.util.*;

	public class D02P05_5 {

	    public static boolean canFormCircle(String[] strings) {
	        if (strings == null || strings.length == 0) {
	            return false;
	        }
	        
	        Map<Character, List<String>> map = new HashMap<>();
	        
	        // Build a map where key is the first character of each string
	        for (String str : strings) {
	            char firstChar = str.charAt(0);
	            map.putIfAbsent(firstChar, new ArrayList<>());
	            map.get(firstChar).add(str);
	        }
	        
	        // Check if the strings can be chained to form a circle
	        return canFormCircleUtil(map, strings[0].charAt(0), strings[0].charAt(strings[0].length() - 1), new HashSet<>(), 0);
	    }
	    
	    private static boolean canFormCircleUtil(Map<Character, List<String>> map, char startChar, char currentChar, Set<String> visited, int count) {
	        if (count == map.size()) {
	            return startChar == currentChar;
	        }
	        
	        if (!map.containsKey(currentChar)) {
	            return false;
	        }
	        
	        for (String str : map.get(currentChar)) {
	            if (!visited.contains(str)) {
	                visited.add(str);
	                if (canFormCircleUtil(map, startChar, str.charAt(str.length() - 1), visited, count + 1)) {
	                    return true;
	                }
	                visited.remove(str);
	            }
	        }
	        
	        return false;
	    }

	    public static void main(String[] args) {
	        String[] input1 = {"abc", "efg", "cde", "ghi", "ija"};
	        System.out.println(canFormCircle(input1) ? "Yes" : "No");

	        String[] input2 = {"Ijk", "kji", "abc", "cba"};
	        System.out.println(canFormCircle(input2) ? "Yes" : "No");
	    }
	}



