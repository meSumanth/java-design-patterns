package com.designpatterns.creational.factory;

/**
 * @author Sumanth
 *
 */
public class AppFactory {

	public static App createApp(AppType type) {
		App app;
		switch (type) {
		case IPHONE:
			app = new IphoneApp();
			break;
		case TV:
			app = new TvApp();
			break;
		case IPAD:
			app = new IpadApp();
			break;
		case WATCH:
			app = new WatchApp();
			break;
		default:
			app = new IpadApp();
		}
		return app;
	}

}
