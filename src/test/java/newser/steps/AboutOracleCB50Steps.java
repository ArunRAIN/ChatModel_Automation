package newser.steps;

import net.thucydides.core.annotations.Step;
import newser.pages.AboutOracleCB50Page;

public class AboutOracleCB50Steps 
{

	AboutOracleCB50Page AOpage;
	

	@Step
    public void navigate_About_Oracle()
	{
		AOpage.navigate_About_Oracle();
    }

	
	@Step
    public void is_4_feature_areas_display()
	{
		AOpage.is_4_feature_areas_display();
    }
	
	@Step
    public void is_feature_area_display()
	{
		AOpage.is_feature_area_display();
    }
	
	@Step
    public void is_expected_page()
	{
		AOpage.click_feature_area();
    }
	
}
