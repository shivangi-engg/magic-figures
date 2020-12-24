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
		mid= s.length()/2;
		for (j=1;j<=mid ;j++ ) 
		{
			if ((arr[mid-j]) == (arr[mid+j]))
			{
					count++;
			}	
		}
		if (count == mid) 
		{
			System.out.println("this is a palindrome");
		}
		else
		{
			System.out.print("not a palindrome");
		}

	}
}