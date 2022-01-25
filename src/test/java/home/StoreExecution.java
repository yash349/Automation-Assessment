package home;

import core.CoreTestIntegration;
import core.Listener;
import actions.Implementation;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Epic("Epic 1")
@Listeners(Listener.class)

public class StoreExecution extends CoreTestIntegration {

Implementation pl;
    @Test
    @Description("Creating objects before class")
    public void initimpl()
    {
        pl=new Implementation(data);
    }
    @Test(dependsOnMethods = "initimpl")
    @Description("testing the function")
    @Severity(SeverityLevel.NORMAL)
    @Story("STORY 1")
    @Feature("Feature 1")
    @Owner("YASH AGRAWAL")
    
   // TEST CASE 1
    
    public void TestClick()
    {
    	logStep("clickcontact");
    	pl.ClickContact();
    	pl.sleep( 2);
    }
    @Test(priority = 2)
    public void TestSubject()
    {
    	logStep("subject Heading");
    	pl.SelectHeading();
    	pl.sleep(2);
    }
    @Test(priority = 3)
    public void TestEmail()
    {
    	logStep("Email");
    	pl.VerifyEmail("abc@gmail.com");
    	pl.sleep( 2);
    }
    @Test(priority = 4)
    public void TestMessage()
    {
    	logStep("Message");
    	pl.WriteMessage("This is testcase 1");
    	pl.sleep( 2);
    }
    @Test(priority = 5)
    public void Testsend()
    {
    	logStep("send");
    	pl.SendMessage();
    	pl.sleep( 2);
    }
    
    //TEST CASE 2
    
    @Test(priority = 6)
    public void TestClick1()
    {
    	logStep("clickcontact");
    	pl.ClickContact();
    	pl.sleep( 2);
    }
    @Test(priority = 7)
    public void TestSubject1()
    {
    	logStep("subject Heading");
    	pl.SelectHeading();
    	pl.sleep(2);
    }
    @Test(priority = 8)
    public void TestEmail1()
    {
    	logStep("Email");
    	pl.ValidateEmail("abc.com");
    	pl.sleep( 2);
    }
    @Test(priority = 9)
    public void Testsend1()
    {
    	logStep("send");
    	pl.SendMessage();
    	pl.sleep( 5);
    }
    
}
