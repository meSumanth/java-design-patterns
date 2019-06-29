package com.designpatterns.creational.singleton;

/**
 * @author Sumanth
 *
 */
public class SingletonFive {
	
	private SingletonFive()
	{
		
	}
	
	/*
	 * Here static inner class is used instead of Static variable. It means
	 * Object will be lazy initialized.
	 */
	private static class LazyInitialization
	{
		private static final SingletonFive instance = new SingletonFive();
	}
	
	public static SingletonFive getInstance()
	{
		return LazyInitialization.instance;
	}

}

//Problem? everything cool? what about cloning and serialization?
