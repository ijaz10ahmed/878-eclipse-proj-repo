package CodilityPractice;

import java.util.Scanner;

public class IterationsWhileLoop {
public static void main(String[] args) {
	int n,result=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number: ");
	n=sc.nextInt();
	while(n>0) 
	{
		n=n/10;
		result++;
	}
	System.out.println("Total digits: " + result);
	
	System.out.println("------------------------------");
	
	int a=0, b=1, f = 15;
	for (int i = 1; i <= f; ++i)
	{
    System.out.print(a + " ");
    int s = a+b;
    a = b;
    b = s;
	}
}
}
