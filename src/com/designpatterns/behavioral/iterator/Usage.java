package com.designpatterns.behavioral.iterator;

import java.util.Iterator;

/**
 * @author Sumanth
 *
 */
public class Usage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final IterableDataContainer container = new  IterableDataContainer();
		container.add("Sumanth");
		container.add("Ashok");
		container.add("John");
		
		Iterator<String> iterator = container.getIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
