package com.wyz.patterndesign.usecase.facade;

import org.springframework.ui.context.ThemeSource;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 13:53
 * @Description: 影院的外观
 */
public class HomeTheaterFacade {
	// 定义各个子对象
	private DVDPlayer dvdPlayer;
	private TheaterLight theaterLight;
	private Popcorn popcorn;
	private Projector projector;
	private Screen screen;
	private Stereo stereo;

	public HomeTheaterFacade() {
		this.dvdPlayer = DVDPlayer.getInstance();
		this.theaterLight = TheaterLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.stereo = Stereo.getInstance();
	}

	// 操作会根据业务来说 分成四步：

	/**
	 * 准备工作
	 */
	public void ready() {
		// 打开爆米花机器
		popcorn.on();
		// 出爆米花
		popcorn.pop();
		// 拉下来幕布
		screen.down();
		// 打开投影仪
		projector.on();
		// 打开音响
		stereo.on();
		// 打开DVD
		dvdPlayer.on();
		// 调暗灯光
		theaterLight.dim();
	}

	public void play() {
		dvdPlayer.play();
	}

	public void pause() {
		dvdPlayer.pause();
	}

	public void end() {
		// 关闭爆米花机器
		popcorn.off();
		// 挑梁灯光
		theaterLight.bright();
		// 升上去幕布
		screen.up();
		// 关闭投影仪
		projector.off();
		// 关闭音响
		stereo.off();
		// 关闭DVD
		dvdPlayer.off();
	}
}
