package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
public class PrintLogicPalindrome
{
	public void printPalindrome()
	{
		int i,mid,j;
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the word u want to check for palindrome");
		String s= sc.nextLine();
		char[] arr= new char[s.length()];
		for (i=0;i<s.length() ;i++ ) 
		{
			arr[i]= s.charAt(i);
		}
		int last = s.length()-1;
		mid= s.length()/2;
		for (j=0;j<=mid ;j++ ) 
		{
			if ((arr[j]) == (arr[last-j])) 
			{
				count++;	
			}
		}
		if (count == (mid+1)) 
		{
			System.out.println("this is a palindrome");
		}
		else
		{
			System.out.print("not a palindrome");
		}
	}
}