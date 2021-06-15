/*

   Author: Rinkesh Narayan Ingole
   Date  : 20/10/2020
   About: This java program accept number from user and display all numbers in between  that range. 

	Input : 23 35 
	Output : 23 24 25 26 27 28 29 30 31 32 33 34 35 
	Input : 10 18 
	Output : 10 11 12 13 14 15 16 17 18 
	Input : 10 10 
	Output : 10 
	Input : -10 2 
	Output : -10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 
	Input : 90 18 
	Output : Invalid range 
*/



import java.lang.*;
import java.util.Scanner;

class Display
{
	void displayNumber(int num1,int num2)
	{
		if(num1<0)
		{
			num1=-num1;
		}
		if(num2<0)
		{
			num2=-num2;
		}
		if(num1>num2)
		{
			System.out.println("Invalid Range");
		}
		
		for(int i=num1;i<=num2;i++)
		{
			
			System.out.print(i +"\t");
			
		}
	}
}

class Range
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterd the starting number");
		int no1=sc.nextInt();
		
		System.out.println("Enterd the end number");
		int no2=sc.nextInt();
		
		Display dobj=new Display();
		dobj.displayNumber(no1,no2);
		
		
	}
}
