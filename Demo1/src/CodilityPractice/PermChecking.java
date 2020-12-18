package CodilityPractice;
import java.util.*;

public class PermChecking {
	public static int solution(int[] A) {
Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		for (int i = 1; i <= A.length; i++) {
			if(set.contains(i) == false)
				return 0;
		}
		return 1;
}
public static void main(String[] args) {
 		int[] arr = {9,8,6,9,5,4,4,3,7,1,6,1};
 		System.out.println(solution(arr));
 }
}
