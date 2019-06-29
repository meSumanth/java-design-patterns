package com.designpatterns.creational.singleton;

/**
 * @author Sumanth
 *
 */
public class SingletonFour {
	
	private static SingletonFour instance = null;
	
	private SingletonFour()
	{
		
	}
	
	public SingletonFour getInstance()
	{
		if(instance == null)
		{
			synchronized (SingletonFour.class) {
				
				if(instance == null)
				{
					instance = new SingletonFour();
				}
			}
		}
		return instance;
	}

}

//Problem ? Everything looks okay since we have synchronization at block level. Lets see if we can avoid synchronization
