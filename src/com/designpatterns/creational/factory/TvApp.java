package com.designpatterns.creational.factory;

/**
 * @author Sumanth
 *
 */
public class TvApp implements App {

	@Override
	public void design() {
		System.out.println("TvApp design");
	}

	@Override
	public void develop() {
		System.out.println("TvApp develop");
	}

	@Override
	public void test() {
		System.out.println("TvApp test");
	}

	@Override
	public void deliver() {
		System.out.println("TvApp deliver");
	}

}
