import java.io.File;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AmpegTests {
	
	protected final String BASEURL = "https://ampeg.com/";
	protected DriverManager driverManager; 
	protected WebDriver driver;
	protected String driverType;
	
	@BeforeMethod
	public void beforeMethod() {
		this.launchDriver();
	}
	
	@AfterMethod
	public void CleanUp() {
		driverManager.quitDriver();
	}
	
	private void launchDriver() {
		driverType = this.getDriverType();
		driverManager = DriverManagerFactory.getManager(driverType);
		driverManager.createDriver();
		driver = driverManager.getDriver();
		this.driver.navigate().to(BASEURL);
	}
	
	private String getDriverType() {
		Scanner driverScanner = null;
		File file = new File("driverType.txt"); 

		try {
			driverScanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		driverScanner.useDelimiter("\"");
		
		String driverType = "";
		while(driverScanner.hasNext()) {
			driverType = driverScanner.next();
		}
		
		driverScanner.close();
		return driverType;
	}
}
