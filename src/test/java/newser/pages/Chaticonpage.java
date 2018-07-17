package newser.pages;

import java.util.List;

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
	@FindBy(xpath="//div[@class='ochat_slideout']//span")
    private WebElementFacade chatglobal;
	
	
	
	@FindBy(xpath="//div[@class='ochat_slideout']//span")
    private WebElementFacade chatsidewall;
	
	@FindBy(xpath="//img[contains(@src,'chat.svg')]")
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
		
		//waitFor("//strong[text()='Need live help?']");
		
		new WebDriverWait(getDriver(),800).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ochat_flyout flyout-show flyout-fadein']//a[@data-lbl='proactive-chatcta']")));
		//withTimeoutOf(40, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//strong[text()='Need live help?']"));
		waitABit(5000);
		boolean ele = getDriver().findElement(By.xpath("//div[@class='ochat_flyout flyout-show flyout-fadein']//a[@data-lbl='proactive-chatcta']")).isDisplayed();
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
		
		getDriver().findElement(By.xpath("//div[@class='ochat_flyout flyout-show flyout-fadein']//a[@data-lbl='proactive-chatcta']")).click();
	}
	
	public void is_chat_form_display()
	{
	  waitABit(8000);
	   WebElement ele = getDriver().findElement(By.xpath("//iframe[@id='proactive']"));
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
		WebElement element = getDriver().findElement(By.id("ochat-flyoutclose"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
		//getDriver().findElement(By.id("ochat-flyoutclose")).click();
	}
	
	
	public void is_chat_not_open()
	{
		List<WebElement> ele = getDriver().findElements(By.xpath("//div[@class='ochat_flyout flyout-show flyout-fadein']//a[@data-lbl='proactive-chatcta']"));
		if(ele.size()==1)
		{
			Assert.assertTrue(false);
			
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	
	public void click_on_chat_icon()
	{
		waitABit(3000);
		WebElement element = getDriver().findElement(By.xpath("//div[@class='ochat_slideout']//span"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
	}
	
	public void is_modal_displayed()
	{
		waitABit(4000);
		boolean ele = getDriver().findElement(By.xpath("//div[@class='ochat_modalw2']")).isDisplayed();
	    if(ele)
	    {
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	
	}
	
	
	public void click_on_start_button_on_modal_popup()
	{
		while(true)
		{
			boolean ele = getDriver().findElement(By.xpath("//div[@class='ochat_modalw2']//a[@data-lbl='chatcta']")).isEnabled();
			if(ele)
			{
				//waitABit(20000);
				WebElement element = getDriver().findElement(By.xpath("//div[@class='ochat_modalw2']//a[@data-lbl='chatcta']"));
				JavascriptExecutor js = (JavascriptExecutor)getDriver();
				js.executeScript("arguments[0].click();", element);
				
				break;
			}
			else
			{
				
			}
		
		
		}
		
	}
	
	
	public void is_chat_form_display_on_modal_popup()
	{
		
		waitABit(9000);
		   WebElement ele = getDriver().findElement(By.xpath("//iframe[@id='chatiframe']"));
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
	
	public void click_on_support_option()
	{
	    waitABit(2000);
		WebElement element = getDriver().findElement(By.xpath("//div[@class='ochat_modalw2']/section[@class='ochat_panel ochat_support']/a[@class='chatcta']"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
	}
	
	public void is_display_support_options()
	{
		waitABit(4000);
		boolean ele = getDriver().findElement(By.xpath("//nav[@class='u03 u03v5 u03bttns']//h1")).isDisplayed();
	    if(ele)
	    {
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	public void is_field_display()
	{
		waitABit(4000);
		boolean ele = getDriver().findElement(By.xpath("//form[@id='rn_ChatLaunchForm']//select")).isDisplayed();
		if(ele)
	    {
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void mandatory_field_not_filled()
	{
		waitABit(5000);
		WebElement ele = getDriver().findElement(By.xpath("//iframe[@id='chatiframe']"));
		getDriver().switchTo().frame(ele);
		WebElement element = getDriver().findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
	}
	
	public void form_not_submitted()
	{
		waitABit(20000);
		//WebElement ele1 = getDriver().findElement(By.xpath("//iframe[@id='chatiframe']"));
		//getDriver().switchTo().frame(ele1);
		boolean ele = getDriver().findElement(By.id("rn_ErrorLocation")).isDisplayed();
	    if(ele)
	    {
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void browse_the_website()
	{
		getDriver().findElement(By.id("txtSearch")).sendKeys("chat");
	}
	
	
}