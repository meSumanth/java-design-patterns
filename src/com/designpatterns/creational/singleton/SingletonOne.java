package com.designpatterns.creational.singleton;

/**
 * @author Sumanth
 *
 */
public class SingletonOne {
	
	private static SingletonOne instance = null;
	
	private SingletonOne()
	{
		
	}
	
	public static SingletonOne getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonOne();
		}
		return instance;
	}

}

//Problem ?  What if two different threads invoke getInstance()
