package newser.steps;

import net.thucydides.core.annotations.Step;
import newser.pages.SegmentDivingCB25v2Page;

public class SegmentDivingCB25v2Steps 
{
	SegmentDivingCB25v2Page SDpage;
	
	@Step
    public void hover_on_links()
	{
		SDpage.hover_on_links();
    }
	
	@Step
    public void is_link_underlined()
	{
		SDpage.is_link_underlined();
    }
	
	@Step
    public void click_on_segmentlink()
	{
		SDpage.click_on_segmentlink();
    }

	@Step
    public void is_navigate_segment_page()
	{
		SDpage.is_navigate_segment_page();
    }

}
