package newser.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class Chaticonpage extends PageObject
{
	@FindBy(xpath="//div[@class='u02tools u02li2']//span[text()='Chat']")
    private WebElementFacade chatglobal;
	
	
	
	@FindBy(xpath="//div[@class='ochat_slideout']//span[text()='Chat']")
    private WebElementFacade chatsidewall;
	
	@FindBy(xpath="//span[text()='Live Chat']")
    private WebElementFacade chatform;
	
	
	public void maximize()
	{
		getDriver().manage().window().maximize();
	}
	
	
	public void is_page_loaded()
	{
		while(true)
		{
			
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		String str = js.executeScript("return document.readyState").toString();
		
		if(str.equals("complete"))
		{
			break;
		}
		
		}
	}
	
	public void chat_icon_display()
	{
		boolean dis = chatglobal.isDisplayed();
		if(dis)
		{
			//Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void chat_appear_in_side_wall()
	{
		//waitABit(40000);
		boolean dis = chatsidewall.isDisplayed();
		if(dis)
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void proactive_chat_display()
	{
		WebElement ele1 = getDriver().findElement(By.xpath("//strong[text()='Need live help?']"));
		//waitFor("//strong[text()='Need live help?']");
		
		new WebDriverWait(getDriver(),40).until(ExpectedConditions.visibilityOf(ele1));
		//withTimeoutOf(40, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//strong[text()='Need live help?']"));
		
		boolean ele = getDriver().findElement(By.xpath("//strong[text()='Need live help?']")).isDisplayed();
		if(ele)
		{
			//Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	public void click_start_chat_button()
	{
		
		getDriver().findElement(By.xpath("//a[@class='procta chatcta']")).click();
	}
	
	public void is_chat_form_display()
	{
	  waitABit(10000);
	   WebElement ele = getDriver().findElement(By.xpath("//iframe[contains(@src,'https://sc-oal-en--stg.custhelp.com')]"));
	   getDriver().switchTo().frame(ele);
	   
	   boolean dis = chatform.isDisplayed();
		if(dis)
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	   
	   
	}
	
	public void click_X()
	{
		getDriver().findElement(By.id("ochat-flyoutclose")).click();
	}
	
	
	public void is_chat_not_open()
	{
		boolean ele = getDriver().findElement(By.xpath("//strong[text()='Need live help?']")).isDisplayed();
		if(ele)
		{
			Assert.assertTrue(false);
			
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
}