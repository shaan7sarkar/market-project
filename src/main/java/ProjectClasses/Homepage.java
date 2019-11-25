package ProjectClasses;

import org.openqa.selenium.By;

public class Homepage extends MasterClass {

	public static void main(String[] args) {
		System.out.println(checkLogInButton());
	}

	public static boolean checkLogInButton() {
		openChrome();

		try {
			String loginbuttonXPath = "//*[@id=\"dLabellogin\"]";
			return chromeDriver.findElement(By.xpath(loginbuttonXPath)).isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;

		}
	}
}