package IframeValidationTests;

//import java.util.List;

//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import IframeValidation.BasePage;
import IframeValidation.IframeObject;

public class IframeTests {

	
	BasePage b;
	IframeObject i;
	public IframeTests() {
		
		b=new BasePage();
		i=new IframeObject();
	}

	@Test
	public void IframeTest()
	{
		
		System.out.println("Iframe Testing Started!!");
		b.getTitle();
		i.iframe().click();
		
		b.getTitle();
		
		
		//getting the list size
		b.listSize(b.listFrame());
		
		//Switching to Frames
		b.getBodyText(b.listFrame());
		
		
		System.out.println("Iframe Testing Ended!!");
		
		
	}
	
	
	
	
}
