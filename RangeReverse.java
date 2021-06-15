/*
   Author: Rinkesh Narayan Ingole
   Date  : 1/11/2020
   About: This java program accept range from the  user aand display all numbers in 
	      between that range in reverse order. 
	
		Input : 23 35 
		Output : 35 34 33 32 31 30 29 28 27 26 25 24 23 
		
		Input : 10 18 
		Output : 18 17 16 15 14 13 12 11 10 
		
		Input : 10 10 
		Output : 10 
		
		Input : -10 2 
		Output : 2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10 
		
		Input : 90 18 
		Output : Invalid range
*/


import java.lang.*; 
import java.util.Scanner;

class Display
{
	void displayReverse(int num1,int num2)
	{
		
		
		if(num1>num2)
		{
			System.out.println("Invalid Range");
		}
		System.out.print("All numbers in between that range in reverse order are:");
		for(int i=num2;i>=num1;i--)
		{
			
			System.out.print(i+"\t");
			
		}
		
	}
}

class  RangeReverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterd the starting number");
		int no1=sc.nextInt();
		
		System.out.println("Enterd the end number");
		int no2=sc.nextInt();
		
		Display dobj=new Display();
		dobj.displayReverse(no1,no2);
		
		
	}
}
