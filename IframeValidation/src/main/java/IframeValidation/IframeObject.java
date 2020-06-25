package IframeValidation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframeObject extends BasePage {

	public IframeObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul/li/a[@href='pages/frame.html']")
	private WebElement iframe;
	
	
	
	
	public  WebElement iframe()
	{
		
		return iframe;
	}
	

}
