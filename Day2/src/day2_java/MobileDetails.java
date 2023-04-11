package day2_java;

public class MobileDetails {
	public static void main(String[] args) {
		Mobile mobileSpc =new Mobile();
		
		mobileSpc.mobileBrand="OPPO";
		mobileSpc.mobileModel="OPPO F17";
		mobileSpc.mobilePrice=17000;
		mobileSpc.mobileStorage="128 GB";
		mobileSpc.mobileRam=8;
		mobileSpc.androdVersion=12.201012d;
		mobileSpc.wifiVersion=5.2f;
		System.out.println("Mobile Brand : "+mobileSpc.mobileBrand+"Model : "+mobileSpc.mobileModel+"Mobile Price : "+mobileSpc.mobilePrice+" Internal Storage : "+mobileSpc.mobileStorage+" Ram : "+mobileSpc.mobileRam+" Wifi Version : "+mobileSpc.wifiVersion+" Androd Version : "+mobileSpc.androdVersion);
	
		Mobile mobileSpc1=new Mobile();
		
		mobileSpc1.mobileBrand="REALME";
		mobileSpc1.mobileModel="Realme 10";
		mobileSpc1.mobilePrice=22199;
		mobileSpc1.mobileStorage="256 GB";
		mobileSpc1.mobileRam=16;
		mobileSpc1.androdVersion=13.1200021d;
		mobileSpc1.wifiVersion=5.4f;
		System.out.println("Mobile Brand : "+mobileSpc1.mobileBrand+" Model : "+mobileSpc1.mobileModel+" Mobile Price : "+mobileSpc1.mobilePrice+" Internal Storage : "+mobileSpc1.mobileStorage+" Androd version : "+mobileSpc1.androdVersion+" Ram : "+mobileSpc1.mobileRam+" Wifi Version : "+mobileSpc1.wifiVersion);
	}

}
