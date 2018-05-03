package test;

import java.util.List;
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
		
		MobileElement el1 = (MobileElement) driver.findElementById("com.veripark.mar.demo:id/txtUserName");
		MobileElement el2 = (MobileElement) driver.findElementById("com.veripark.mar.demo:id/txtPassword");
		MobileElement el3 = (MobileElement) driver.findElementById("com.veripark.mar.demo:id/button1");
		
		
		//wait.until(ExpectedConditions.visibilityOf(el3));
		//wait.until(ExpectedConditions.visibilityOf(el2));
		//wait.until(ExpectedConditions.visibilityOf(el3));
				
		el1.sendKeys("naresh45");
		el2.sendKeys("abcd1234");	
		el3.click();
		
			
				
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.veripark.mar.demo:id/secondayPassword")));
		MobileElement el4 = (MobileElement) driver.findElementById("com.veripark.mar.demo:id/secondayPassword");
		el4.sendKeys("13579");
		
		MobileElement el5 = (MobileElement) driver.findElementById("com.veripark.mar.demo:id/loginBtn");
		el5.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.veripark.mar.demo:id/cards_button")));
		MobileElement el6 = (MobileElement) driver.findElementById("com.veripark.mar.demo:id/cards_button");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[5]/android.widget.Button");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.Button");
		el8.click();
			
}

	
	public String getOTP(AndroidDriver<MobileElement> driver) {
	
		//Activity = new Activity();
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.startActivity(new Activity("com.samsung.android.messaging", "com.android.mms.ui.ConversationComposer"));
	

	return "x";
	
	// mCurrentFocus=Window{d6423e2d0 u0 com.samsung.android.messaging/com.android.mms.ui.ConversationComposer}
}


	
}
