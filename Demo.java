package Cvowel;

import java.lang.*;
/*
   Author: Rinkesh Narayan Ingole
   Date  : 15/10/2020
   About: This java program check the Charector is vowel or not entered by user

*/



import java.util.*;
class Vowel
{
	public void CheckVowel(char ch)
	{
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println("This is Vowel\n");
		}
		else
		{
			System.out.println("This is not Vowel\n");
		}
	
    }
	
}

class Demo
{
	public static void main(String arg[])
	{
		Scanner Sobj =new Scanner(System.in);
		
		System.out.println("Enter the Charector\n");
		char ch =Sobj.next().charAt(0);
		
		
		Vowel vobj=new Vowel();
		 vobj.CheckVowel(ch);
		
	}
}