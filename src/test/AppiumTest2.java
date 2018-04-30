package test;


public class AppiumTest2 {
	

	public static void main(String[] args) {
		
		 
		OTPTest obj = new OTPTest();
		obj.setUpEnvironment(obj.setDesiredCapabilities(), "com.veripark.mar.alpha", "com.veripark.login.StartActivity");	
		 
		
		//appPackage:"com.veripark.mar.alpha"
		//appActivity: "com.veripark.login.StartActivity"
		obj.login();
		System.out.println(obj.getOTP());
		

	}	
		


	
}

