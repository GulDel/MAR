package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class OTPTest {

	AndroidDriver <MobileElement> driver;
	

	public DesiredCapabilities setDesiredCapabilities() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy J7 Prime");
		caps.setCapability("udid", "5210656e402d649d"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("noReset", true);
		
		return caps;
	}
	
	//appPackage:"com.veripark.mar.alpha"
	//appActivity: "com.veripark.login.StartActivity"
	//caps.setCapability("waitForActivity", "com.veripark.Login}");
	
	public void setUpEnvironment(DesiredCapabilities caps, String appPackage, String appActivity) {
		
		try {
			//Set the Desired Capabilities
			
			caps.setCapability("appPackage", appPackage);
			caps.setCapability("appActivity", appActivity);
			
			if(appPackage == "com.veripark.mar.alpha")
			{
				caps.setCapability("waitForActivity", "com.veripark.Login}");
			}
			
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
			
		}catch(MalformedURLException e) {
			System.out.println(e.getMessage());
		}	
				
		
}
	
	
	public void login() {

		WebDriverWait wait = new WebDriverWait(driver,20);
		MobileElement el1 = (MobileElement) driver.findElementById("com.veripark.mar.alpha:id/txtUserName");		
		wait.until(ExpectedConditions.visibilityOf(el1));		
		el1.click();
		el1.sendKeys("naresh45");
		
		MobileElement el2 = (MobileElement) driver.findElementById("com.veripark.mar.alpha:id/txtPassword");
		wait.until(ExpectedConditions.visibilityOf(el2));
		el2.click();
		el2.sendKeys("abcd1234");
			
		MobileElement el3 = (MobileElement) driver.findElementById("com.veripark.mar.alpha:id/button1");
		wait.until(ExpectedConditions.visibilityOf(el3));
		el3.click();
			
}

	
	public String getOTP() {
	
		//Activity = new Activity();
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		setUpEnvironment(setDesiredCapabilities(),"com.samsung.android.messaging", "com.android.mms.ui.ConversationComposer" );
		
		driver.startActivity(new Activity("com.samsung.android.messaging", "com.android.mms.ui.ConversationComposer"));
		
		//driver.startActivity("com.samsung.android.messaging", "com.android.mms.ui.ConversationComposer");
	

	return "x";
	
	// mCurrentFocus=Window{d6423e2d0 u0 com.samsung.android.messaging/com.android.mms.ui.ConversationComposer}
}


	
}
