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
	
	@Step
    public void click_on_chat_icon()
    {
    	AOpage.click_on_chat_icon();
    }
	
	@Step
    public void is_modal_displayed()
    {
    	AOpage.is_modal_displayed();
    }
	
	@Step
    public void click_on_start_on_modal_popup()
    {
    	AOpage.click_on_start_button_on_modal_popup();
    }
	
	@Step
    public void is_chat_form_display_on_modal_popup()
    {
    	AOpage.is_chat_form_display_on_modal_popup();
    }
	
	@Step
    public void click_on_support_option()
    {
    	AOpage.click_on_support_option();
    }
	
	@Step
    public void is_display_support_option()
    {
    	AOpage.is_display_support_options();
    }
	
	@Step
    public void is_field_display()
    {
    	AOpage.is_field_display();
    }
	
	@Step
    public void mandatory_field_not_filled()
    {
    	AOpage.mandatory_field_not_filled();
    }
	
	
	@Step
    public void form_not_submitted()
    {
    	AOpage.form_not_submitted();
    }
	
	
	@Step
    public void browse_the_website()
    {
    	AOpage.browse_the_website();
    }

	
}
