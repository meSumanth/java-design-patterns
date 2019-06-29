package com.designpatterns.creational.factory;

/**
 * @author Sumanth
 *
 */
public class IpadApp implements App {

	@Override
	public void design() {
		System.out.println("IpadApp design");
	}

	@Override
	public void develop() {
		System.out.println("IpadApp develop");
	}

	@Override
	public void test() {
		System.out.println("IpadApp test");
	}

	@Override
	public void deliver() {
		System.out.println("IpadApp deliver");
	}

}
