package com.Demo3;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProducts {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("keyboard");
		list.add("pendrive");
		list.add("mouse");
		list.add("processor");
		
		list.addFirst("Headphones");
		list.addLast("mic");
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.remove("pendrive");
		
		for(String prname:list)
		{
			System.out.println("Prdouct names: "+prname);
		}
		System.out.println(list.get(3));
		list.set(4, "USB cables");
		System.out.println(list);
		
	}
}
