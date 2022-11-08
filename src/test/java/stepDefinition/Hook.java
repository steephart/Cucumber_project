package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.base.one.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends Base {
	
	@Before
	public static void browser_launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@After
	public void afterScenario() {
		System.out.println("after scenario");
	}


}
