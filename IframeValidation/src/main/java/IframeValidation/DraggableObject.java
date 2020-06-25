package IframeValidation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DraggableObject extends BasePage {

	public DraggableObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//li/a[@href='../home.html']")
	private WebElement Home;
	
	@FindBy(xpath="//li/a[@href='pages/drag.html']")
	private WebElement draggable;
	
	
	@FindBy(xpath="//h1[@class='wp-heading']")
	private WebElement heading;
	
	@FindBy(xpath="//div[@id='draggable']")
	private WebElement dragbox;
	
	public WebElement Home()
	{
		return Home;
		
	}
	public WebElement draggable()
	{
		return draggable;
	}
	public WebElement dragbox()
	{
		return dragbox;
	}
	public WebElement heading()
	{
		return heading;
	}
	

}
