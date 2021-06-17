/*
   Author: Rinkesh Narayan Ingole
   Date  : 5/11/2020
   About: This java program about  find even factorial of given number. 

		
		Input : 5 
		Output : 8 (4 * 2) 
		
		Input : -5 
		Output : 8 (4 * 2) 
		
		Input : 10 
		Output : 3840 (10 * 8 * 6 * 4 * 2)
	   
*/


import java.lang.*;
import java.util.Scanner;

class Factorial
{
	public int Evenfactorial(int num1)
	{
		int iEven=1;
		
		if(num1<0)
		{
			num1=-num1;
		}
		for(int i=1;i<=num1;i++)
		{
			if((i%2)==0)
			{
				
				iEven=iEven*i;
			}
		
		}
		
		return iEven;
			
	}
}
class EvenFact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		int no1=sc.nextInt();
		
		Factorial fobj=new Factorial();
		int ret=fobj.Evenfactorial(no1);
		System.out.println(ret);
		System.out.println("Even factorial of given number is :" +ret);
		
		
	}
}