/*
   Author: Rinkesh Narayan Ingole
   Date  : 20/10/2020
   About: This java program accept range from user and display all even numbers in 
		  between that range. 
	
	Input : 23 35 
	Output : 24 26 28 30 32 34 
	Input : 10 18 
	Output : 10 12 14 16 18 
	Input : 10 10 
	Output : 10 
	Input : -10 2 
	Output : -10 -8 -6 -4 -2 0 2 
	Input : 90 18 
	Output : Invalid rang
*/


import java.lang.*;
import java.util.Scanner;

class Display
{
	void displayEven(int num1,int num2)
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
		System.out.print("Even numbers in between that range are:");
		for(int i=num1;i<=num2;i++)
		{
			
			if((i%2)==0)
			{
				System.out.print(i+"\t");
			}
			
		}
	}
}

class RangeEven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterd the starting number");
		int no1=sc.nextInt();
		
		System.out.println("Enterd the end number");
		int no2=sc.nextInt();
		
		Display dobj=new Display();
		dobj.displayEven(no1,no2);
		
		
	}
}
