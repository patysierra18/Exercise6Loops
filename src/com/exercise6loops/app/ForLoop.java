package com.exercise6loops.app;

public class ForLoop {

	public static void main(String[] args) 
	{
		//Constant declaration
		
		//Variable declaration
		
		//Objects construction
		
		//Create a series of 1-100
		for(int i=0;i<=100;i++)
		//For(int i=100;i>1;i--)
		{
			System.out.println(i);
			
		}
		for (int i=0;i<=100;i+=2)
		{
				System.out.println(i);
		}
		
		System.out.println("Display odd numbres from 100 to 200");
		for (int i= 0;i<200;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
	
		System.out.println("Display just the half of the sequence 100 to 200");

		for(int i =100;i<200;i++)
		{
			System.out.println(i);
			if (i==150)
			{
				break;
				
			}
		}
	
	}
	
	

}
