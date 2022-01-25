package actions;

import PathSetUp.PageRoute;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class Implementation extends CoreActions  {

	public Implementation(WebDriver data)
    {
        super(data);
    }
	
	public void ClickContact()
	{
		Click(PageRoute.Contact);
	}
	public void SelectHeading()
	{
		SubjectSelect(PageRoute.Subject);
	}
	public void VerifyEmail(String value)
	{
		SendData(PageRoute.Email,value);
	}
	public void WriteMessage(String value)
	{
		SendData(PageRoute.Message, value);
	}
	public void SendMessage()
	{
		Click(PageRoute.Send);
	}
	public void ValidateEmail(String value)
	{
		SendData(PageRoute.Email, value);
	}
}
