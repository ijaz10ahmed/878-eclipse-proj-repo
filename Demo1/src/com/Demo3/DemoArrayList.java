package com.Demo3;
import java.util.ArrayList;
import java.util.Scanner;
public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<>();
		String pname;
		Scanner sc=new Scanner(System.in);
		String choice="y";
		while(choice.equals("y"))
		{
			System.out.println("Enter the name of participant");
			pname = sc.next();
			names.add(pname);
			System.out.println("Do you want to continue");
			choice=sc.next();
		}
		System.out.println("Total Participants are "+names.size());
		System.out.println("Enter the name of participant to search ");
		}
	}
