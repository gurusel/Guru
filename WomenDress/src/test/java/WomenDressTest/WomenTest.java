package WomenDressTest;

import org.testng.annotations.Test;

import WomenDress.BasePage;
import WomenDress.WomenObject;

public class WomenTest {

	BasePage b;
	WomenObject w;
	public WomenTest() {
	
		b=new BasePage();
		w=new WomenObject();
	}

	@Test
	public void verifyWomenTest()
	{
		//Get the title page - when page is loaded
		b.getTitle();
		//click the women tab
		w.women().click();
		//Get the title of women page
		b.getTitle();
		//Get the span text to get the count details
		b.getCount(w.span());
		
		//Get the text below the image
		b.getSize(w.womenDressList(),"title");
		
		//Get the price below the image
		b.getSize(w.priceList(),"price");
		
		//compare the women Dresses List and the header count
		b.compare(w.womenDressList(), w.span());
		
		//Get the title of special
		b.getText(w.special());
		
		//get the price details in the special
		b.getSize(w.spcprice(),"price");
		
		//To calculate the discount
		b.getSize(w.spcprice(), "discount");
		
		
		
	}
	
	
}
