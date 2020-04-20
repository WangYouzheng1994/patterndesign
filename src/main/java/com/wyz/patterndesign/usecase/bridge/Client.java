package com.wyz.patterndesign.usecase.bridge;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/20 21:12
 * @Description: 程序的调用者
 */
public class Client {
	public static void main(String[] args) {
		// 折叠式小米 (样式 + 品牌)
		Phone foldedXiaoMI = new FoldedPhone(new XiaoMi());

		foldedXiaoMI.open();
		foldedXiaoMI.close();
		foldedXiaoMI.call();

		System.out.println("=======");

		// 折叠 Vivo
		Phone foldedVivo = new FoldedPhone(new Vivo());
		foldedVivo.open();
		foldedVivo.close();
		foldedVivo.call();

		System.out.println("=======");
		// 直立手机
		UpRightPhone upRightPhone = new UpRightPhone(new XiaoMi());
		upRightPhone.open();
		upRightPhone.close();
		upRightPhone.call();

	}
}
