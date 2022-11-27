package com.simplilearn.interface7;

public class MobileUser {

	public static void main(String[] args) {

		Oppo oppo = new Oppo();
				String oppoMobile=oppo.getAndroidData();
				String andriodName=oppo.ANDROID_NAME;
				int androidVersion=oppo.ANDROID_VERSION;
				
				System.out.println(oppoMobile);
				System.out.println(andriodName);
				System.out.println(androidVersion);
		System.out.println("------------------------------");
		Samsung samsung = new Samsung();
				String samsungMobile=samsung.getAndroidData();
				String samsungName=samsung.ANDROID_NAME;
				int samsungVersion=samsung.ANDROID_VERSION;
				
				System.out.println(samsungMobile);
				System.out.println(samsungName);
				System.out.println(samsungVersion);
		System.out.println("------------------------------");
		Readmi readmi = new Readmi();
				String readmiMobile=readmi.getAndroidData();
				String readmiName=readmi.ANDROID_NAME;
				int readmiVersion=readmi.ANDROID_VERSION;
				
				System.out.println(readmiMobile);
				System.out.println(readmiName);
				System.out.println(readmiVersion);
				
;	}

}
