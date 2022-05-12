package collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
	public static void main(String args[]) {

		ArrayDeque<String> arraydeque = new ArrayDeque<String>(); // Use an ArrayDeque like a stack.
		        arraydeque.push ("A");
		        arraydeque.push ("B");
		        arraydeque.push ("x");
		        arraydeque.push ("Z");
		        arraydeque.push ("D");
		        arraydeque.push ("X");//duplicate value
		        arraydeque.push ("z");//duplicate value
		        arraydeque.push ("E");
		        arraydeque.push("F");
//		      System.out.println("Before Popping the stack: ");
//		      while (arraydeque.peek() != null) 
//		        System.out.print (arraydeque.pop() + " "); 
//		       System.out.println("After popping Iterating the stack: " + arraydeque.size());
		        Iterator<String> iterator = arraydeque.iterator();
		         while(iterator.hasNext()) {
		             System.out.print("\t"  + iterator.next());
		         }
		         System.out.println(" ");
		         Iterator<String> strIterator = arraydeque.descendingIterator();
		         while(strIterator.hasNext()) {
		             System.out.print("\t" + strIterator.next());
		         }
		         System.out.println();
		         arraydeque.addFirst("H");
		         arraydeque.addLast("I");
		         strIterator = arraydeque.iterator();
		         while(strIterator.hasNext()) {
		             System.out.print("\t"  + strIterator.next());
		         }
		         System.out.println();
		         System.out.println("PollFirst: " + arraydeque.pollFirst());
		         System.out.println(arraydeque);
		         System.out.println("pollLast: " + arraydeque.pollLast());
		         System.out.println(arraydeque);
		         System.out.println ("****** ****pollFirst: "+arraydeque.pollFirst());
	             System.out.println (arraydeque);
	             System.out.println("************pollLast: "+arraydeque.pollLast ());
	             System.out.println (arraydeque);
	             //peekFirst
	             //Retrieves, but does not remove, the first element of this deque, or //returns null if this deque is empty.
	             System.out.println("************peekFirst: "+arraydeque.peekFirst());
	             System.out.println (arraydeque);
	             System.out.println("************peekLast: "+arraydeque.peekLast () );
	             System.out.println (arraydeque);
	             //removeFirst
	             //Retrieves and removes the first element of this deque.
	             //This method differs from pollFirst only in that it throws an exception //if this deque is empty.
	             System.out.println ("**** *****removeFirst: "+arraydeque.removeFirst());
	             System.out.println (arraydeque);
	             System.out.println("************removeLast: "+arraydeque.removeLast () );
	             System.out.println (arraydeque);
		         }}