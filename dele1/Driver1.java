import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jenkins1_launching_ff {

	
	public static void main(String kdf[]){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://wordpress.com");
		System.out.println(driver.getCurrentUrl());
	}
}
