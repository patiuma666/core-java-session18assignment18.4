/*Creating an object of LinkedList class
 * and implementing the functions
 */

package assignment18; //created package as assignment18

import java.util.*;

public class LinkedListExample { //created class as LinkedListExample

	public static void main(String[] args) { //created main method
	
        LinkedList<String> studentnamelist = new LinkedList<>();      //created an interface for studentnamelist of type string for linkedList
        
		  studentnamelist.add("Pallavi"); //initializing elements and creating the studentnamelist objects for the list
		  studentnamelist.add("Sruthi");
		  studentnamelist.addLast("Ambika");
		  studentnamelist.addFirst("Rabekha");
		  studentnamelist.add("Lavanya");
		  System.out.println("The elements of linked list are : " ); 
               Iterator<String> iterator=studentnamelist.iterator();            //traversing the elements of the object list  by using iterator method
		  
		  while(iterator.hasNext()){       //implementing the for each loop to traverse the elements
			  
		   System.out.println(iterator.next());  

		  }
		 
		         List<String> list = new ArrayList<>();   // adding the arrayList objects at the end of the linked list 
		
		  list.add("Karuna");
		  list.add("Kamala");
		  studentnamelist.addAll(list); //here list.addAll() this method add  the two objects list elements and prints the values
		
		  System.out.println("The elements after joining the arraylist are : " +list); 
		  
		    ListIterator<String> listIterator=studentnamelist.listIterator();    //here it shows all the elements which are also added 
	        while(listIterator.hasNext()){                      //and displays the elements by the iterator
	        
		   System.out.println(listIterator.next());  

		  }
		 
		    System.out.println("Traversing elements in backward direction...");    //here iterating the by reverse direction 
		  while( listIterator.hasPrevious()){   //this method will displays the elements in the backward direction 
			  
			   System.out.println( listIterator.previous());   //and prints the values

		  }
		  }  
}




