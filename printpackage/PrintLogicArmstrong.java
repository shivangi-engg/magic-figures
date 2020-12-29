package printpackage;
import java.util.*;
import java.io.*;
import java.lang.*;
public class PrintLogicArmstrong
{
	public void printArmstrongLogic()
	{
		int d,count=0,cube,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int a = sc.nextInt();
		int n = String.valueOf(a).length();
		d = a;
		for (int i=0; i<n; i++ ) 
		{
			c = d%10;
			cube = c*c*c;
			count+=cube;
			d = d/10;
		}
		if (a == count) 
		{
			System.out.println("this is an armstrong no.");	
		}
		else
		{
			System.out.println("not an armstrong no.");
		}
	}
}
