package CodilityPractice;

public class ItertionsForLoop {
public static void main(String[] args) {
	//for (int i = 0; i < 101; i++) {
	//	System.out.println(i);
	/*int f = 1;int n=5;
	for (int i = 1; i < n+1; i++) {
		f=f*i;
	}
		System.out.println(f);
	*/
	for (int i = 1; i <= 4; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	// i	i<=4 	j 	j<=i 	o/p
	// 1	1<=4		1	1<=1	*
	// 2	2<=4		1	1<=2	*
	// 					2	2<=2	*
	// 3	3<=4		1	1<=3	*
	//  		 		2	2<=3	*
	// 					3	3<=3	*
	// 4	4<=4		1	1<=3	*
	//  		 		2	2<=3	*
	// 					3	3<=3	*
	//					4	4<=3	*
	
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j);
		}
		System.out.println(" ");
	}
	
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			int k = i;
			System.out.print(k);
		}
		System.out.println(" ");
	}
	for (int i = 5; i >= 1; i--) {
		for (int j = i; j >= 1; j--) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
}
}

