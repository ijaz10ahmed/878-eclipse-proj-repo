package CodilityPractice;
import java.util.*;
public class Distinct {
	public static int solution(int[] A) {
			if(A.length ==0) {
				return 0;
			}
			int result = 1;
			Arrays.sort(A);
			for (int i = 1; i < A.length; i++) {
				if(A[i] != A[i-1]) {
					result++;
				}
			}
			return result;
		}
	public static void main(String[] args) {
		int[] arr = {2,3,4,4,1};
		System.out.println(solution(arr));
	}
}