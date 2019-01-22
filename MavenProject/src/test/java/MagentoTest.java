import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTest {
	public void Mag() {
		String url="http://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Home h=new Home(driver);
		h.clickOnMyAcc();
		

		Login l = new Login(driver);
		l.typeEmail("nitinmanjunath1991@gmail.com");
		l.typePassword("Welcome123");
		l.clickOnLogin();
		
		
		LogOut l1 = new LogOut(driver);
		l1.clickOnLogout();
		
		
	}
	

}
