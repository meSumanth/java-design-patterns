package com.designpatterns.creational.factory;

/**
 * @author Sumanth
 *
 */
public class WatchApp implements App {

	@Override
	public void design() {
		System.out.println("WatchApp design");
	}

	@Override
	public void develop() {
		System.out.println("WatchApp develop");
	}

	@Override
	public void test() {
		System.out.println("WatchApp test");
	}

	@Override
	public void deliver() {
		System.out.println("WatchApp deliver");
	}

}
