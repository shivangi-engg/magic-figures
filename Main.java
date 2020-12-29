//Package IMPORT
import printpackage.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for palindrome check , 2 for fibonacci series");
		int o = sc.nextInt();
		switch(o)
		{
			case 1:
					printpackage.PrintLogicPalindrome PrintLogicPalindromeInstance = new printpackage.PrintLogicPalindrome();
					PrintLogicPalindromeInstance.printPalindrome();
					break;


			case 2:
					printpackage.PrintLogicFibonacci PrintLogicFibonacciInstance = new printpackage.PrintLogicFibonacci();
					PrintLogicFibonacciInstance.printFibonacciSeries();
					break;


			default:
					System.out.println("not an option");
		}
			
	}
}
