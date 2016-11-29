import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver1{

	
	public static void main(String kdf[]){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://wordpress.com");
		System.out.println(driver.getCurrentUrl());
	}
}
