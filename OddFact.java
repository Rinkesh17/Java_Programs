/*
   Author: Rinkesh Narayan Ingole
   Date  : 1/11/2020
   About: This java program about find odd factorial of given number. 

		
    
		Input : 5 
		Output : 15 (5 * 3 * 1) 
		Input : -5 
		Output : 15 (5 * 3 * 1) 
		Input : 10 
		Output : 945 (9 * 7 * 5 * 3 * 1) 
*/

import java.lang.*;
import java.util.Scanner;

class Factorial
{
	public int Oddfactorial(int num1)
	{
		
		int iOdd=1;
		if(num1<0)
		{
			num1=-num1;
		}
		for(int i=1;i<=num1;i++)
		{
			
			if((i%2)!=0)
			{
				
				iOdd=iOdd*i;
				
			}
		
		}
		
		return iOdd;
			
	}
}
class OddFact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		int no1=sc.nextInt();
		
		Factorial fobj=new Factorial();
		int ret=fobj.Oddfactorial(no1);
		System.out.println("Odd factorial of given number is :" +ret);
		
	}
}