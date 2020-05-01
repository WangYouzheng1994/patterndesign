package com.wyz.patterndesign.usecase.facade;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 14:28
 * @Description: 使用者 使用的就是 影院的门面而不用关心具体内部怎么个流程了~
 */
public class Client {
	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();

		System.out.println("-=-=-=-=-=-=-=");
		homeTheaterFacade.pause();
		System.out.println("-=-=-=-=-=-=-=");
		homeTheaterFacade.end();

	}
}
