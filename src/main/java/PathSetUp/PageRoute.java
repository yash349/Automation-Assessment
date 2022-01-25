package PathSetUp;

import org.openqa.selenium.By;

public class PageRoute {
	public static final By Contact = By.xpath("//a[@title='Contact Us']");
	
	public static final By Subject = By.xpath( "//select[@id='id_contact']");
	
	public static final By Email =By.xpath( "//input[@id='email']");
	
	public static final By Message = By.id("message");
	
	public static final By Send = By.xpath("//button[@id='submitMessage']");

}
