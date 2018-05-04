package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;


public class OTPTest {	

	public AndroidDriver<MobileElement> setupEnvironment() {
		
		try {
			//Set the Desired Capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "Galaxy J7 Prime");
			caps.setCapability("udid", "5210656e402d649d"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "7.0");
			caps.setCapability("autoGrantPermissions", true);
			caps.setCapability("noReset", true);
			//caps.setCapability("locale", "en_US");
			//caps.setCapability("language","en");
			//caps.setCapability("appPackage", "com.veripark.mar.alpha");
			caps.setCapability("appPackage", "com.veripark.mar.demo");
			caps.setCapability("appActivity", "com.veripark.login.StartActivity");
			caps.setCapability("waitForActivity", "com.veripark.Login}");
			
			
			AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		    return driver;
			
		}catch(MalformedURLException e) {
			System.out.println(e.getMessage());
			return null;
		}	
	}
	
	//appPackage:"com.veripark.mar.alpha"
	//appActivity: "com.veripark.login.StartActivity"
	//caps.setCapability("waitForActivity", "com.veripark.Login}");
	
	
	
	
	public void login(AndroidDriver <MobileElement> driver) {

		WebDriverWait wait = new WebDriverWait(driver,20);
		
		MobileElement user_name = (MobileElement) driver.findElementById(Element.getUserName_id());
		MobileElement password = (MobileElement) driver.findElementById(Element.getPassword_id());
		MobileElement login_button = (MobileElement) driver.findElementById(Element.getLoginButton_id());
		
		
		//wait.until(ExpectedConditions.visibilityOf(el3));
		//wait.until(ExpectedConditions.visibilityOf(el2));
		//wait.until(ExpectedConditions.visibilityOf(login_button));
				
		user_name.sendKeys("naresh45");
		password.sendKeys("abcd1234");	
		login_button.click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id(Element.getSecondaryPassword_id())));
		MobileElement otp_password = (MobileElement) driver.findElementById(Element.getSecondaryPassword_id());
		otp_password.sendKeys("13579");
		
				
		MobileElement second_login_button = (MobileElement) driver.findElementById(Element.getSecondaryPasswordButton_id());
		second_login_button.click();
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id(Element.getCardsIcon_id())));
		MobileElement cardsIcon = (MobileElement) driver.findElementById(Element.getCardsIcon_id());
		cardsIcon.click();
		
		MobileElement mmt_button = (MobileElement) driver.findElementByXPath(Element.getMmtIcon_xpath());
		mmt_button.click();
		
		MobileElement enable_button = (MobileElement) driver.findElementByXPath(Element.getEnableButton_xpath());
		enable_button.click();
			
}

	
	public String getOTP(AndroidDriver<MobileElement> driver) {
	
		//Activity = new Activity();
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.startActivity(new Activity("com.samsung.android.messaging", "com.android.mms.ui.ConversationComposer"));
	

	return "x";
	
	// mCurrentFocus=Window{d6423e2d0 u0 com.samsung.android.messaging/com.android.mms.ui.ConversationComposer}
}


	
}
