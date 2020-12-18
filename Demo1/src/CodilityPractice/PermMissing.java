package CodilityPractice;

public class PermMissing {
public static int solution(int[] A) {
	long size = A.length;
	if(size ==0) {
		return 1;
	}
	long sum = 0;
	for (int val : A) {
		sum +=val;
	}
	long actualsum = ((size+1) * (size+2))/2;
	return (int)(actualsum - sum);
}
public static void main(String[] args) {
		int[] A = {1,5,3,4};
		System.out.println(solution(A));
}
}