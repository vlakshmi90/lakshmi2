package prog;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebook {
	@Test
	public void testYahooTest(){
		WebDriver d = new FirefoxDriver();
		d.get("http://www.facebook.com");
		System.out.println(d.getTitle());
		Assert.fail("Fail method");
		d.close();
	}
	 

}
