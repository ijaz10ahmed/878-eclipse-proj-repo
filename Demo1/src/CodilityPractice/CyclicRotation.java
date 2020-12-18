package CodilityPractice;

public class CyclicRotation {
public static int[] solution(int[] A, int X) {
	int[] new_array = new int[A.length];
	for(int i=0; i<A.length;i++) {
		int new_position = (i +X) % A.length;
		new_array[new_position]=A[i];
	  }
	return new_array;
}
	public static void main(String[] args) {
		int[] arr = {3,7,9,1,6};
		int[] newarr;
		newarr=solution(arr,3);
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]);
		}
	}
}
