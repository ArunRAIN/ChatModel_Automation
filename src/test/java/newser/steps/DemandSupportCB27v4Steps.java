package newser.steps;

import net.thucydides.core.annotations.Step;
import newser.pages.CarouselBannerPage;
import newser.pages.DemandSupportCB27v4Page;

public class DemandSupportCB27v4Steps
{
	
	DemandSupportCB27v4Page DSpage;
	
	@Step
    public void hover_on_ctabutton()
	{
		DSpage.hover_on_ctabutton();
    }

	@Step
    public void is_turn_white_color()
	{
		DSpage.is_turn_white_color();
    }
	
	@Step
    public void click_on_CTA()
	{
		DSpage.click_on_CTA();
    }
	
	
	
	@Step
    public void is_navigate_events_page()
	{
		DSpage.is_navigate_events_page();
    }
}
