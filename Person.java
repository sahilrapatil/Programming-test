// Define a class called Person here.
import java.util.*;
class Person
{
	private String name;
    Person(String n)
    {
    	n=name;
    	
    }
     String GetName()
     {
		return this.name;
    	 
     }
     
     public String greet(String t) {
         if ("Hello".equals(t)) {
             return String.format("Hi my name is %s", name);
         } else if ("Goodbye".equals(t)) {
             return "bye";
         } else {
             return String.format("Hi, my name is %s", name);
         }
     }
}



	
