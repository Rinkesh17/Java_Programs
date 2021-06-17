/*
   Author: Rinkesh Narayan Ingole
   Date  : 1/11/2020
   About: This java program which returns difference between Even factorial and odd factorial 
			of given number. 

		
       Input : 5 
       Output : -7 (8 - 15) 
	   
       Input : -5 
       Output : -7 (8 - 15) 
	   
       Input : 10 
	   Output : 2895 (3840 - 945)
	   
*/


import java.lang.*;
import java.util.Scanner;

class Factorial
{
	public int Diffactorial(int num1)
	{
		int iEven=1;
		int iOdd=1;
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
			if((i%2)!=0)
			{
				
				iOdd=iOdd*i;
				
			}
			
			
		
			
		}
		
		return iEven-iOdd;
			
	}
}
class Difffact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		int no1=sc.nextInt();
		
		Factorial fobj=new Factorial();
		int ret=fobj.Diffactorial(no1);
		System.out.println(ret);
		
	}
}