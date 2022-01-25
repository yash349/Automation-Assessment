package actions;

import org.openqa.selenium.By;
//import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.qameta.allure.*;
import org.testng.Assert;
public class CoreActions {

	protected final WebDriver data;
    protected final WebDriverWait waiter;
    protected CoreActions(WebDriver data)
    {
        this.data=data;
        this.waiter=new WebDriverWait(data,10);
    }
    @Step("Test Case 1")
    protected void Click(By element)
    {
      data.findElement(element).click();
    }
    protected void SubjectSelect(By element)
    {
    	WebElement s1 = data.findElement(element);
    	Select DropDown = new Select(s1);
    	DropDown.selectByIndex(1);
    }
    protected void SendData(By element, String text)
    {
        data.findElement(element).sendKeys(text);
    	
    }
   
    public void sleep(double sec)
    {
        try {
            Thread.sleep((long)(sec * 1000));
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}
