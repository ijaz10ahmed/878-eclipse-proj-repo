package CodilityPractice;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class BinaryGap {
public static int solution(int n) {
	int finalGap=0;
	if(n==1)
	{
		return 0;
	}
	char binaryRep[] = Integer.toBinaryString(n).toCharArray();
	int tempGap=0;
	for (int x = 0; x < binaryRep.length; x++) {
		System.out.println("binaryRep["+x+"]="+binaryRep[x]);
		if (binaryRep[x]=='0') {
			tempGap++;
			System.out.println("tempGap: "+tempGap);
			continue;
		}
		else if (binaryRep[x]=='1') {
			if (tempGap>finalGap) {
				finalGap=tempGap;
				tempGap=0;
			}
			}
		}
		return finalGap;
}
public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	String choice = null;
	System.out.println("enter number");
	int num = sc.nextInt();
	System.out.println(solution(num));
	System.out.println("enter again(y/n): ");
	choice = sc.next();
	while(choice=="y") {
	//	goto main(String[] args);;
	}
	
}
}
