package CodilityPractice;
import java.util.*;
public class Triangle{
	public static int solution(int[] A) {
			Arrays.sort(A);
			for (int i = 2; i < A.length; i++) {
				if(A[i-2] + A[i-1] > A[i]) {
					return 1;
					}
			}
			return 0;
		}
	public static void main(String[] args) {
		int[] arr = {10,2,5,1,8,20};
		System.out.println(solution(arr));
	}
}