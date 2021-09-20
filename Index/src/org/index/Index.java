package org.index;

public class Index
{  
   public static void main(String[] args)
{  
       String s1 = "Technology ";         
       int index = s1.indexOf("o");  
       System.out.println("index of substring "+index);   
       String s2 = "SeleniumAutomationtool ";         
       int index1 = s2.indexOf("o");  
       System.out.println("index of substring "+index);   

       String s3 = " j a v a p r o g r a m";  
  int sizeWithWhiteSpaces = s3.length();  
       System.out.println("In the string: " + "'" + s3 + "'");  
       String str = s3.replace(" ", "");  
       int sizeWithoutWhiteSpaces = s3.length();  
       int noOfWhieSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;  
       System.out.print("Total number of whitespaces present are: " + noOfWhieSpaces); 
     
    
       
       String s4 = "9095984678";         
       int index4 = s4.indexOf("8");  
       System.out.println("index of substring "+index);   


   }  
 
}  



