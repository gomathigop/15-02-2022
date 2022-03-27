package com.java;

import java.util.Scanner;

public class Evenno {

	public static void main(String[] args) {
		// For Loop
		int start,end;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Starting value:");
		start=scanner.nextInt();
		System.out.println("Enter the Ending value: ");
		end=scanner.nextInt();
		for(start=0;start<=end;start++)
		{
			if(start%2==0)
			{
				System.out.println(start);
				
			}
			scanner.close();
		}
			
		
		
		
		
	}


	}
