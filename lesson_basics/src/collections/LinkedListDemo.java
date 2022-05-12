package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[]) {
        LinkedList<String>stringLinkedList= new LinkedList();
        stringLinkedList.add("F");
        stringLinkedList.add("B");
        stringLinkedList.add("D");
        stringLinkedList.add("E");
        stringLinkedList.add("C");
        stringLinkedList.add("F");
        stringLinkedList.add("B");
        stringLinkedList.add("D");
        stringLinkedList.add("E");
        stringLinkedList.add("C");
        stringLinkedList.addLast("Z");
        stringLinkedList.addFirst("A");
        stringLinkedList.add(1,"A2");
        Iterator<String>stringIterator=stringLinkedList.iterator();
        while(stringIterator.hasNext()) {
            System.out.print(stringIterator.next()+" ");
        }
        System.out.println();
        stringLinkedList.remove("F");
        stringLinkedList.remove(2);
        Iterator<String>stringIterator1=stringLinkedList.iterator();
        while(stringIterator1.hasNext()) {
            System.out.print(stringIterator1.next()+" ");
        }
        System.out.println();
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();
        Iterator<String>stringIterator11=stringLinkedList.iterator();
        while(stringIterator11.hasNext()) {
            System.out.print(stringIterator11.next()+" ");
        }
    }}
