package ProjectClasses;

import org.openqa.selenium.By;

public class Login extends MasterClass {
	public static void clickLogInButton() {
		String loginButtonXPath = "//*[@id=\"dLabellogin\"]";
		chromeDriver.findElement(By.xpath(loginButtonXPath)).click();
	}
}
