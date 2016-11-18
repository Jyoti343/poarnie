package dele1;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Delay1 {

	public static void main(String sd[]){
		
		File fuck=new File("C:\\Users\\JYOTI\\Downloads\\geckodriver-v0.11.1-win32\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", fuck.getAbsolutePath());
		System.out.println("i's not u thought i was,,"+" *** "+fuck.getAbsolutePath());
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.co.in");
		System.out.println(driver.getPageSource());
		
	}
}
