package CodilityPractice;

import java.util.*;

public class FrogRiverOne {
		public static int solution(int X, int[] A) {
			HashSet<Integer> hmap = new HashSet<Integer>();
			for (int i = 0; i < A.length; i++) {
				if (A[i] <= X)
					hmap.add(A[i]);

				if (hmap.size() == X)
					return i;
			}

			return -1;
		}
		public static void main(String[] args) {
			int[] arr = {3,2,1,5,7,4,0,9};
			System.out.print(solution(4,arr));
			
		
	}
}
