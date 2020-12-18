package com.BugFixing;

public class BugFixing1 {
		 //return the character that occurs the most frequently in the given string
	    //in case of more than one character satisfying the requirement, we need to
	    //return the earliest character alphabetically
	    String solution(String S) {
	        int[] occurrences = new int[26];
	        for (char ch : S.toCharArray()) {
	            occurrences[ch - 'a']++;
	        }
	        char best_char = 'a';
	        int best_res = 0;
	        for (int i = 0; i < 26; i++) {			// i = 1 changed to i = 0
	            if (occurrences[i] > best_res) {	// >= changed to >
	                best_char = (char) ((int) 'a' + i);
	                best_res = occurrences[i];
	            }
	        }
	        return Character.toString(best_char);
	    }
	    
	    
	    public static void main(String[] args) {
	        System.out.println(new BugFixing1().solution("apple"));
	    	System.out.println(new BugFixing1().solution("hello"));
	    	System.out.println(new BugFixing1().solution("parameter"));
	    	System.out.println(new BugFixing1().solution("assisstant"));
	    	System.out.println(new BugFixing1().solution("committee"));
	    	System.out.println(new BugFixing1().solution("yellow"));
	    	System.out.println(new BugFixing1().solution("boomerang"));
	    }
	}
////
