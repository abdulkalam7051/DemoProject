package SeleniumTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1Class {
	
	static String driverPath = Messages.getString("Test1Class.0"); //$NON-NLS-1$
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println(Messages.getString("Test1Class.1")); //$NON-NLS-1$
		System.out.println(Messages.getString("Test1Class.2")); //$NON-NLS-1$
		System.setProperty(Messages.getString("Test1Class.3"), driverPath+Messages.getString("Test1Class.4")); //$NON-NLS-1$ //$NON-NLS-2$
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGooglePageTitleInIEBrowser() {
		driver.navigate().to(Messages.getString("Test1Class.5")); //$NON-NLS-1$
		String strPageTitle = driver.getTitle();
		System.out.println(Messages.getString("Test1Class.6")+strPageTitle); //$NON-NLS-1$
		Assert.assertTrue(strPageTitle.equalsIgnoreCase(Messages.getString("Test1Class.7")), Messages.getString("Test1Class.8")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println(Messages.getString("Test1Class.9")); //$NON-NLS-1$
			driver.quit();
		}
	}
}