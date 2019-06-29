package com.designpatterns.creational.singleton;

/**
 * @author Sumanth
 *
 */
public class SingletonSix implements Cloneable{
	
	private SingletonSix()
	{
		
	}
	
	private static class LazyInitialization
	{
		private static final SingletonSix instance = new SingletonSix();
	}
	
	public static SingletonSix getInstance()
	{
		return LazyInitialization.instance;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return new CloneNotSupportedException();
	}
	
	protected Object readReolve()
	{
		return getInstance();
	}

}
