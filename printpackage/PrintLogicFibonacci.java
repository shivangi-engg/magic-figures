package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
public class PrintLogicFibonacci
{
	public void printFibonacciSeries()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first no. of the series:");
		int a = sc.nextInt();
		Scanner sa = new Scanner(System.in);
		System.out.println("enter the second no. of the series:");
		int b = sc.nextInt();
		Scanner sb = new Scanner(System.in);
		System.out.println("enter the length of the series:");
		int n = sb.nextInt();
		int array[] = new int[n];
		System.out.println("the fibonacci series for above inputs is:");
		
		for (int i=0;i<n ;i++ ) 
		{
			if (i == 0) 
			{
				array[i] = a;
				
			}
			else if (i == 1) 
			{
				array[i] = b;	
			}
			else
			{
				array[i] = array[i-1] + array[i-2];
			}
			System.out.print(array[i]+", ");	
		}
	}
}