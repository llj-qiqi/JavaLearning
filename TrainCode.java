package javaTrain;
import java.lang.System;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			System.out.println(revert(sc.nextLine()));
		}
		
		sc.close();
		
	}
	
	public static String revert(String str)
	{
		List<String> s1 = new ArrayList<>();
		StringBuilder inputData = new StringBuilder(str);
	    return inputData.reverse().toString();
	}
	
}
