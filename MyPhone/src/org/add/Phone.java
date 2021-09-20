package org.add;

public class Phone 
{
  public Object getPhone()
  {
	  return null;
  }
  public void getPhoneInfo()
  {
	  System.out.println("Model NO");
	  System.out.println("Model Name");
	  System.out.println("Price");
  }
  public static void main (String [] args)  
  {
	  
	 byte code=98;
	 System.out.println("Code");
	 System.out.println("Code value is :" +code);
	  
	 short phoneId= 1284;
	 System.out.println("Phone id is: "+phoneId);
	 
	 int modelNo=134567888;
	 System.out.println("Model no value:" +modelNo);
	 
	 long phoneNo= 886580980;
	System.out.println("PhoneNo:" +phoneNo);
	 
	 float price= 2500.00f;
	 System.out.println("Price is:"+price);
	 
	 double phoneprice= 250000.00;
	 System.out.println("phonePrice is:"+phoneprice);
	 
	 char phoneType ='A';
	 System.out.println("Phonetype is:"+phoneType);
	 
	 boolean phoneStatus= true;
	 System.out.println("Phone status:"+phoneStatus);
	 
	 String phoneName= "Oneplus";
	 System.out.println("PhoneName:"+phoneName);
	  
  }
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}
}
