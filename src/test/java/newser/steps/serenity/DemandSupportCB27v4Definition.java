package newser.steps.serenity;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import newser.steps.DemandSupportCB27v4Steps;

public class DemandSupportCB27v4Definition 
{
	@Steps
	DemandSupportCB27v4Steps DSStep;

	
    
    @When("User hover on CTA button")
	public void userhoveronCTAbutton()
	{
    	DSStep.hover_on_ctabutton();
	}
    
    @Then("User must see backgroundcolor change to white")
    public void usermustseebackgroundcolorchangetowhite()
    {
    	DSStep.is_turn_white_color();
    }
    
    @When("User clicks on CTA button")
    public void UserclicksonCTAbutton()
    {
    	DSStep.click_on_CTA();
    }

    @Then("User must navigate to the events page")
    public void Usermustnavigatetotheeventspage()
    {
    	DSStep.is_navigate_events_page();
    }
}
