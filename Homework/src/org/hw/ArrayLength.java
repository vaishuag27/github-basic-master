package org.hw;

public class ArrayLength 
{
	private static void LengthOfArray(String[] array)   
	{     
	if (array == null)   
	{  
	
	System.out.println("The array is empty, can't be determined length.");  
	}   
	else   
	{  
	int arrayLength = array.length;  
	System.out.println("The length of the array is: "+arrayLength);  
	}  
	}  
	public static void main(String[] args)   
	{  
	
	String[] numbers1= {"1","2","3","4","5","6"};
	String[] numbers2= {"1","0","2","0","3","0","4","0"};

	LengthOfArray(null);  
	LengthOfArray(numbers1);  
	LengthOfArray(numbers2);  
	}
}
