package com.BugFixing;
import java.util.*;
public class BugFixing2 {
			
			int solution(int[] A, int[] B) {
	        int n = A.length;
	        int m = B.length;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int i = 0;
	        for (int k = 0; k < n; k++) {
	            if (A[k] == B[i])
	                return A[k];
	            while (i < m-1  && B[i] < A[k])
	                i += 1;
	        }
	        return -1;
	    }
		
		public static void main(String[] args) {
			int[] A = {};
			int[] B = {};
			System.out.println(new BugFixing2().solution(A, B));
		}
		
	}
//