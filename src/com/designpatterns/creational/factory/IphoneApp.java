package com.designpatterns.creational.factory;

/**
 * @author Sumanth
 *
 */
public class IphoneApp implements App {

	@Override
	public void design() {
		System.out.println("IphoneApp design");
	}

	@Override
	public void develop() {
		System.out.println("IphoneApp develop");
	}

	@Override
	public void test() {
		System.out.println("IphoneApp test");
	}

	@Override
	public void deliver() {
		System.out.println("IphoneApp deliver");
	}

}
