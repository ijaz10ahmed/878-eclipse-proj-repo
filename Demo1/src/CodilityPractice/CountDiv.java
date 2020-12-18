package CodilityPractice;

public class CountDiv {
	public static int solution(int A, int B, int K) {
		int num_B = (int) Math.floor(B/K);
		int num_A = (int) Math.floor(A/K);
		System.out.println(num_B);
		System.out.println(num_A);
		int num_div = num_B - num_A;
		System.out.println("num_div "+num_div);
		int plus = 0;
		if(A%K ==0)
			plus = 1;
		num_div = num_div + plus;
		System.out.println("num_div "+num_div);
		
		return num_div;
	}
	public static void main(String[] args) {
		System.out.println(solution(6, 11, 2));
	}
}
