package CodilityPractice;

import java.util.*;

public class MaxCounters {
	public static ArrayList<Integer> solution(int N, int[] A) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>(Collections.nCopies(N, 0));
		for (int i = 0; i < A.length; i++) 
		{
			if (A[i]<=N) 
			{
				arrlist.set(A[i], arrlist.get(A[i])+1);
			}
			else 
			{
				int max_val = Collections.max(arrlist);
				arrlist.replaceAll(e -> max_val);
			}
		}
		return arrlist;
		
}
	public static void main(String[] args) {
		int[] arr = {3,4,4,6,1,4,4};
		System.out.print(solution(5,arr));
			
}
}

