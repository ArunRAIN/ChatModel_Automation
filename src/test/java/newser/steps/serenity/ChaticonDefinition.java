package newser.steps.serenity;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import newser.steps.Chaticonsteps;

public class ChaticonDefinition 
{
	@Steps
	Chaticonsteps AOStep;

  @Given("user is on the OCOM  page")
  public void GivenuserisontheOCOMpage()
  {
	  AOStep.is_the_homepage();
  }
  
  @When("the page loads")
  public void Whenthepageloads()
  {
	  AOStep.page_load();
  }
  
  @Then("chat icon must appear in global header")
  public void Thenchaticonmustappearinglobalheader()
  {
	  AOStep.is_chat_icon_display();
  }
  
  
  @Then("chat icon must appear on the side wall")
  public void Thenchaticonmustappearonthesidewall()
  {
	  AOStep.is_chat_appear_in_sidewall();
	  
  }
  
  @When("proactive chat appears")
  public void Whenproactivechatappears()
  {
	  AOStep.is_proactive_chat_display();
	  
  }
  
  @Then("user clicks on start chat button")
  public void Thenuserclicksonstartchatbutton()
  {
	  AOStep.click_start_chat_button();
  }
  
  @Then("chat form must open")
  public void Thenchatformmustopen()
  {
	  AOStep.is_chat_form_display();
  }
  
  @Then("user clicks x")
  public void Thenuserclicksx()
  {
	  AOStep.click_x();
  }
  
  @Then("chat form must not open")
  public void Thenchatformmustnotopen()
  {
	  AOStep.chat_not_opened();
  }
  
  @When("the user clicks on the chat icon")
  public void Whentheuserclicksonthechaticon()
  {
	  AOStep.click_on_chat_icon();
  }
  
  @Then("modal must show chat options")
  public void Thenmodalmustshowchatoptions()
  {
	  AOStep.is_modal_displayed();
  
  }
  
  @Given("user opened chat modal on OCOM page")
  public void GivenuseropenedchatmodalonOCOMpage()
  {
	  AOStep.is_the_homepage();
	  AOStep.click_on_chat_icon();
	  AOStep.is_modal_displayed();
  }
  
  @When("the user clicks on CTA link")
  public void WhentheuserclicksonCTAlink()
  {
	  AOStep.click_on_start_on_modal_popup();
  }
  
  @Then("chat forms must open")
  public void Thenchatformsmustopen()
  {
	  AOStep.is_chat_form_display_on_modal_popup();
  }
  
  @When("the user click on CTA link")
  public void WhentheuserclickonCTAlink()
  {
	  AOStep.click_on_support_option();
  }
  
  @Then("support options page must open")
  public void Thensupportoptionspagemustopen()
  {
	  AOStep.is_display_support_option();
  }
  
  
  @Given("user clicked start chat")
  public void Givenuserclickedstartchat()
  {
	  AOStep.is_the_homepage();
	  AOStep.click_on_chat_icon();
	  AOStep.click_on_start_on_modal_popup();
  }

	@When("chat form opens")
	public void Whenchatformopens()
	{
		AOStep.is_chat_form_display_on_modal_popup();
	}


    @Then("user must view form fields")
    public void Thenusermustviewformfields()
    {
    	AOStep.is_field_display();
    }
	
    
    @Given("user opened chat form")
    public void Givenuseropenedchatform()
    {
    	AOStep.is_the_homepage();
  	    AOStep.click_on_chat_icon();
  	    AOStep.click_on_start_on_modal_popup();
    }
    
    
    @When("mandatory fields are not filled")
    public void Whenmandatoryfieldsarenotfilled()
    {
    	AOStep.mandatory_field_not_filled();
    }
    
    
    @Then("form must not be submitted")
    public void Thenformmustnotbesubmitted()
    {
    	AOStep.form_not_submitted();
    }
    
    @When("user browsers the website")
    public void Whenuserbrowsersthewebsite()
    {
    	AOStep.browse_the_website();
    }
    
   
    @Then("chat form must not close")
    public void Thenchatformmustnotclose()
    {
    	AOStep.is_chat_form_display_on_modal_popup();
    	
    }
    
}
