package com.designpatterns.creational.factory;

/**
 * @author Sumanth
 *
 */
public class OrderApp {

	public void order(AppType appType) {
		App app = AppFactory.createApp(appType);

		app.design();
		app.develop();
		app.test();
		app.deliver();
	}
}
