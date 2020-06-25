package IframeValidationTests;

import org.testng.annotations.Test;

import IframeValidation.BasePage;
import IframeValidation.DraggableObject;

public class DraggableTests {
	
	BasePage b;
	DraggableObject d;

	public DraggableTests() {
		
		b=new BasePage();
		d=new DraggableObject();
		
	}
	@Test
	public void draggableTest()
	{
		//get the title page
		b.getTitle();
		
		d.Home().click();
		
		//click the draggable button
		d.draggable().click();
		
		//get the title of second page
		b.getTitle();
		
		//get the heading in the page
		b.getText(d.heading());
	
		//get the X & Y positions
		b.getPosition(d.dragbox());
		
		b.getCSSProperty(d.dragbox());
		
		//get the new position and check
		
		b.getNewPosition(d.dragbox(),20, 20);
		b.getNewPosition(d.dragbox(), 30, 40);
		b.getNewPosition(d.dragbox(), 80, 70);
		b.getNewPosition(d.dragbox(), -40, -30);
		b.getNewPosition(d.dragbox(), 50, 40);
		
	}
	
	

}
