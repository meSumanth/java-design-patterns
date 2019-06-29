package com.designpatterns.creational.singleton;

/**
 * @author Sumanth
 *
 */
public class SingletonTwo {
	
	private static SingletonTwo instance = null;
	
	private SingletonTwo()
	{
		
	}
	
	public static synchronized SingletonTwo getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonTwo();
		}
		return instance;
	}

}


//Problem ? Performance