package test;

import java.util.Scanner;

public class Revsum {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
		sum+=num;
		num=num-1;
		}
		
		
		System.out.println("Sum ="+ sum);

	}

}
