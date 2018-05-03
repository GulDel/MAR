package test;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest2 {
	

	public static void main(String[] args) {
			 
		OTPTest otp_test = new OTPTest();
		AndroidDriver <MobileElement> app_driver = otp_test.setupEnvironment();	
		
		otp_test.login(app_driver);
		
		//System.out.println(otp_test.getOTP(app_driver));
			
	}	
		
}

