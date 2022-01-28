package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loan003 {
  @Test(groups="SmokeTest",priority=1)
  public void createLoan() {
	  System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://in.bookmyshow.com/");
	  driver.quit();
	  driver.close();
  }
}
  