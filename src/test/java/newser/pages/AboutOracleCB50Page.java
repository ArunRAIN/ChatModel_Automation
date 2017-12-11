package newser.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AboutOracleCB50Page extends PageObject
{
	@FindBy(xpath="//h2[text()='More About Oracle']")
    private WebElementFacade aboutoraclescrolldown;
	
	
	public void navigate_About_Oracle()
	{
		waitABit(3000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);",aboutoraclescrolldown);
	}
	
	public void is_4_feature_areas_display()
	{
		List<WebElement> ele = getDriver().findElements(By.xpath("//div[@class='cb50w1 cwidth']//li"));
		if(ele.size()==4)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void is_feature_area_display()
	{
		navigate_About_Oracle();
	}
	
	public void navigate_back()
	{
		waitABit(3000);
		getDriver().navigate().back();
	}
	
	public void click_feature_area()
	{
		List<WebElement> ele = getDriver().findElements(By.xpath("//div[@class='cb50w1 cwidth']//li"));
		System.err.println(ele +"hi");
		for(int i=0;i<ele.size();i++)
		{
			int j = i+1;
			waitABit(3000);
			
			WebElement ele3 = getDriver().findElement(By.xpath("(//div[@class='cb50w1 cwidth']//li/a)["+j+"]"));
			JavascriptExecutor js = (JavascriptExecutor)getDriver();
			js.executeScript("arguments[0].click();", ele3);
			
			is_expected_page();
			
		
			navigate_back();
			
		}
		
	}
	
	public void is_expected_page()
	{
		waitABit(5000);
		String title = getDriver().getTitle();
		if(title.equals(title))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
}
