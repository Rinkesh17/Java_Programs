
/*
   Author: Rinkesh Narayan Ingole
   Date  : 18/10/2020
   About: This java program accept number from user and print its numbers line. , Upper Case -> Lower Case
        Case:-  
	Input : 4
	Output : -4 -3 -2 -1 0 1 2 3 4 
*/ 
import java.lang.*;
import java.util.*;

class Printn
{
	public void NumberLine(int No)
	{    
	    
		 if(No<0)
		 {
			 No=-No;
		 }
		for(int i=-No;i<=No;i++)
		{
			System.out.print("\t"+i);
		}
	}
}

class LineNumber
{
	public static void main(String args[])
	{
		Scanner sobj =new Scanner(System.in);
		
		System.out.println("Enter the Number\n");
		
		int value =sobj.nextInt();
		
		Printn pobj=new Printn();
		pobj.NumberLine(value);
	}
}