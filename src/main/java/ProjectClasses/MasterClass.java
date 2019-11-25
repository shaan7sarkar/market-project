package ProjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterClass {

	public static void main(String[] args) {
		System.out.println(checkLogo());
	}

	static WebDriver chromeDriver;

	public static void openChrome() {

		WebDriverManager.chromedriver().setup();

		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.demo.iscripts.com/multicart/demo/");
		chromeDriver.manage().window().maximize();
	}

	public static boolean checkLogo() {
		openChrome();	
		
		try {
			String logoXPath = "//*[@id=\"wrapper\"]/div[1]/nav/div[1]/div/a/img";
			return chromeDriver.findElement(By.xpath(logoXPath)).isDisplayed();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

}
