/*
   Author: Rinkesh Narayan Ingole
   Date  : 7/11/2020
   About: This java Accept number from user and display below pattern.  

		Input : 5 
		Output : A B C D E
	   
*/
import java.lang.*;
import java.util.Scanner;
class PatternD
{
	public void DisplayPattern(int num1)
	{
		if(num1<0)
		{
			num1=-num1;
		}
		char ch='A';
		
		for(int i=1;i<=num1;i++)
		{
			System.out.print(ch +"\t");
			ch+=1;
		}
	}
}
class Pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		int no1=sc.nextInt();
		
		PatternD pobj=new PatternD();
		pobj.DisplayPattern(no1);
		
		
	}
}