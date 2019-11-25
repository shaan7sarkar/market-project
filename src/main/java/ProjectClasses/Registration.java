package ProjectClasses;

import org.openqa.selenium.By;

public class Registration extends MasterClass {

	public static void main(String[] args) {
		completeRegistration();
	}

	public static void completeRegistration() {

		openChrome();

		//boolean result;
		try {
			Login.clickLogInButton();

			String signUpButtonXPath = "//*[@id=\"jqSignup\"]";
			chromeDriver.findElement(By.xpath(signUpButtonXPath)).click();

			String emailFieldXPath = "//*[@id=\"txtEmail\"]";
			chromeDriver.findElement(By.xpath(emailFieldXPath)).sendKeys("shsarka@gmail.com");

			String userNameFieldXPath = "//*[@id=\"txtUserName\"]";
			chromeDriver.findElement(By.xpath(userNameFieldXPath)).sendKeys("shsarka");

			String passwordFieldXPath = "//*[@id=\"txtPassword\"]";
			chromeDriver.findElement(By.xpath(passwordFieldXPath)).sendKeys("abc123");

			String cnfPasswordFieldXPath = "//*[@id=\"txtCnfPassword\"]";
			chromeDriver.findElement(By.xpath(cnfPasswordFieldXPath)).sendKeys("abc123");

			String firstNameFieldXPath = "//*[@id=\"txtFirstName\"]";
			chromeDriver.findElement(By.xpath(firstNameFieldXPath)).sendKeys("Sh");

			String lastNameFieldXPath = "//*[@id=\"txtLastName\"]";
			chromeDriver.findElement(By.xpath(lastNameFieldXPath)).sendKeys("Sarka");

			String addressFieldXPath = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input";
			chromeDriver.findElement(By.xpath(addressFieldXPath)).sendKeys("33-15 81st Street");
			
			String createAccountXPath = "//*[@id=\"btnRegister\"]";
			chromeDriver.findElement(By.xpath(createAccountXPath)).click();


		} catch (Exception e) {
			System.out.println(e.getMessage());
			//return false;

		}
	}
}
