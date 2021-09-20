package org.com;

	import java.util.*;
	  
	public class Compare 
	{
	  
	    public static void main(String[] args)
	    {
	        try (Scanner in = new Scanner(System.in)) {
				String string1 = in.nextLine();
				System.out.println("Enter the first string: " + string1);
  
				String string2 = in.nextLine();
				System.out.println("Enter the second string :" + string2);
  
   
				System.out.println("\nAre both strings same: ");
  
				if (string1.equals(string2) == true) {
				    System.out.println("Yes");
				}
				else 
				{
				    System.out.println("No");
				}
			}
	    }
}