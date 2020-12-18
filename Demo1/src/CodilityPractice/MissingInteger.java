package CodilityPractice;

import java.util.*;

public class MissingInteger {
	public static int solution(int[] A) {
		if (A.length==0)
			return 1;
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		for (int i = 1; i < A.length; i++) {
			set.add(A[i]);
		}
		for (int i = 1; i < A.length; i++) {
			if(set.contains(i) != true)
				return -1;
		}
		return A.length+1;
}
public static void main(String[] args) {
 		int[] arr = {1,4,3,6,3,4};
 		System.out.println(solution(arr));
 }
}