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
}
