package com.designpatterns.behavioral.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Sumanth
 *
 */
public class IterableDataContainer {
	
	private final Set<String> data = new HashSet<>();
	
	public void add(String element)
	{
		this.data.add(element);
	}
	
	public Iterator<String> getIterator()
	{
		return new DataIterator(this);
	}
	
	private Set<String> getData()
	{
		return this.data;
	}
	
	
	private class DataIterator implements Iterator<String>
	{
		
		private final Iterator<String> iterator;
		
		public DataIterator(IterableDataContainer cont) {
            this.iterator = cont.getData().iterator();
        }

		@Override
		public boolean hasNext() {
			return this.iterator.hasNext();
		}

		@Override
		public String next() {
			return this.iterator.next();
		}
		
	}

}
