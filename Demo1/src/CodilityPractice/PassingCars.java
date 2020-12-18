package CodilityPractice;

public class PassingCars {
	public static int solution(int[] A) {
		int num_east = 0;
		int num_pass = 0;
		for (int i = 0; i < A.length-2; i++) {
			if(A[i] ==0) {
				num_east++;
			}
			if(A[i]==1) {
				num_pass = num_pass + num_east;
			}
		}
		if (num_pass > 1_000_000_000 || num_pass < 0)
			return -1;
		else
			return num_pass;
		}
	public static void main(String[] args) {
		int[] arr = {0,1,0,1,1};
		System.out.println(solution(arr));
	}
}
