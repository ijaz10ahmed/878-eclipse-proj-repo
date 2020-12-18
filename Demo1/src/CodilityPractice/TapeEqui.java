package CodilityPractice;

public class TapeEqui {
	public static int solution(int[] A) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum = sum+A[i];
		}
		int min_diff = Integer.MAX_VALUE;
		System.out.println(min_diff);
		int sum_part_one = 0;
		int sum_part_two = 0;
		int diff = 0;
		
		for (int p = 1; p < A.length; p++) {
			sum_part_one = sum_part_one + A[p-1];
			sum_part_two = sum - sum_part_one;
			if(diff<0)
				diff = -diff;
		
			min_diff = Math.min(min_diff, diff);
		}
		return min_diff;
	}
	public static void main(String[] args) {
			int[] arr = {3,1,2,4,3};
			System.out.println(solution(arr));
			}
}


