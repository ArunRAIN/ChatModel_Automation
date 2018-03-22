package newser.steps;

import net.thucydides.core.annotations.Step;
import newser.pages.Chaticonpage;

public class Chaticonsteps 
{

	Chaticonpage AOpage;
	
	@Step
    public void is_the_homepage()
    {
    	AOpage.open();
    	AOpage.maximize();
    }
    
	@Step
    public void page_load()
    {
    	AOpage.is_page_loaded();
    }
    
	@Step
    public void is_chat_icon_display()
    {
    	AOpage.chat_icon_display();
    }
	
	@Step
    public void is_chat_appear_in_sidewall()
    {
    	AOpage.chat_appear_in_side_wall();
    }
	
	@Step
    public void is_proactive_chat_display()
    {
    	AOpage.proactive_chat_display();
    }
	
	@Step
    public void click_start_chat_button()
    {
    	AOpage.click_start_chat_button();
    }
	
	@Step
    public void is_chat_form_display()
    {
    	AOpage.is_chat_form_display();
    }
	
	@Step
    public void click_x()
    {
    	AOpage.click_X();
    }
	
	@Step
    public void chat_not_opened()
    {
    	AOpage.is_chat_not_open();
    }
}
