package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsDemo {

	@Test
	public void test() {

		System.out.println("Jenkins world...");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

	}

}
