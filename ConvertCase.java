
/*

   Author: Rinkesh Narayan Ingole
   Date  : 17/10/2020
   About: This java program convert the case of charector. i.e Lower Case -> Upper Case , Upper Case -> Lower Case


   Problem Statement:Accept one character from user and convert case of that character.
	Input : a Output : A
	Input : D Output : d 
*/

import java.lang.*;
import java.util.*;

class Change
{
	public void ChangeCase(char ch)
	{
		if((ch>='a') && (ch<='z'))
		{
			int temp;
			
			temp=(int)ch;
			temp=temp-32;
			ch=(char)temp;
			
			System.out.println("Charector after change is :"+ch);
		}
		else if((ch>='A') && (ch<='Z'))
		{  
	         int temp;
			
			temp=(int)ch;
			temp=temp+32;
			ch=(char)temp;
			
			System.out.println("Charector after change is :"+ch);
		}
	}
}


class ConvertCase
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the Charector\n");
		char ch=sobj.next().charAt(0);
		
		Change cobj=new Change();
		cobj.ChangeCase(ch);
		
	}
}
