package com.Demo1;
import java.util.Scanner;
public class CaseVowelConsonant {
public static void main(String[] args) {
		System.out.println("Enter a Letter: ");
		Scanner sc=new Scanner(System.in);
		char letter=sc.next().charAt(0);
		sc.close();
		switch (letter) 
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Its a Vowel");
			break;
		default:
			System.out.println("Its a Consonant");
			break;
		}
		
		
		
}
}
