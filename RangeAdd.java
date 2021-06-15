/*
   Author: Rinkesh Narayan Ingole
   Date  : 22/10/2020
   About: This java program accept range from the  user and return addition of all numbers 
		  in between that range. (Range should contains positive numbers only)
		  
	Input : 23 30 
	Output : 212 
	
	Input : 10 18 
	Output : 126 
	
	Input : -10 2 
	Output : Invalid range
	
	Input : 90 18 
	Output : Invalid range
*/

import java.lang.*;
import java.util.Scanner;

class Display
{
	void displayAdd(int num1,int num2)
	{
		int sum=0;
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
			sum=sum+i;
			
			
		}
		System.out.print("Addition of all numbers in between that range is:");
		System.out.println(sum);
	}
}

class RangeAdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterd the starting number");
		int no1=sc.nextInt();
		
		System.out.println("Enterd the end number");
		int no2=sc.nextInt();
		
		Display dobj=new Display();
		dobj.displayAdd(no1,no2);
		
		
	}
}
