package com.designpatterns.creational.singleton;

/**
 * @author Sumanth
 *
 */
public class SingletonThree {
	
	private static SingletonThree instance = new SingletonThree();
	
	private SingletonThree()
	{
		
	}
	
	public static SingletonThree getInstance()
	{
		return instance;
	}

}


//Problem ?  instance gets created at the time of class loading. (It will be created even if it is not required)
