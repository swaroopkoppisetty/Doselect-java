package problem2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Activity{
  //Implement Activity class here..
  String string1;
  String string2;
  String operator;

  public Activity(String string1,String string2,String operator)
  {
    this.string1=string1;
     this.string2=string2;
      this.operator=operator;
    
  }
}



public class Source {
  //Implement the two function given in description in here...
  public String handleException(Activity a)

  {
    try
    {
          if(a.string1.equals(null) || a.string2.equals(null))
          {
              throw new NullPointerException();
              
          }
          if(!a.operator.equals("+") && !a.operator.equals("-"))
          {
                throw new Exception();
                   
          }
    }
    catch(NullPointerException e)
    {
        return "Null values found";
    }
    catch(Exception e)
    {
    	System.out.println(a.operator);
    	 return a.operator;
    }
    return "No Exception Found";
  }
  
  public String doOperation(Activity a)
  {
    String result=null;
    this.handleException(a);
    
    switch(a.operator)
    
    {
      case "+":
             result= a.string1.concat(a.string2);
              break;
      case "-":
              result=a.string1.replace(a.string2,"");
              break;
      default:
            break;
    }
    
    
    return result;
  }
	public static void main(String args[] ) throws Exception {
    //Write your own main to check the program...
		
		Activity obj=new Activity("helloworld","hello","+");
		
		Source obj1=new Source();
		obj1.handleException(obj);
		obj1.doOperation(obj);
   
	}
}