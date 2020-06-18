package WomenDress;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	public static WebDriver driver;
	public String browser="chrome";
	
public BasePage() {
		
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\chrome80\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
			}
		
		}
			
			
			
	//Get the title of the page
	public String getTitle()
	{
	String title=driver.getTitle();
	System.out.println("Title is: "+title);
	return title;
	}
	//get the count in the element
	public void getCount(WebElement element)
	{
		System.out.println("The text value is: "+Integer.parseInt(element.getText().split(" ")[2]));	

	}
	
	//get the text in the element
		public void getText(WebElement element)
		{
			System.out.println("The text value is: "+element.getText());	

		}
	
	//get the size of the products and list their title
	public void getSize(List<WebElement> listelmt,String mytext)
	{
		System.out.println("The size is: "+listelmt.size());
		
		switch(mytext)
		{
		case "title":
			System.out.println("The title of items are: ");
			for(WebElement f: listelmt)
			{
				
				System.out.println(f.getAttribute("title"));
				
			}
			break;
		case "price":
			System.out.println("The price of items are: ");
			for(WebElement f: listelmt)
			{
				
				System.out.println(f.getText());
				
			}
			break;
			
		case "discount":
			System.out.println("List Size:"+listelmt.size());
			Double [] darray=new Double[listelmt.size()];
			int count=0;
			if(count!=listelmt.size())
			{
			for(WebElement f: listelmt)
			{
				String [] mstr= {""};
				String str=f.getText();
				System.out.println("Before: "+str);
				if(str.contains("$"))	
				{
				mstr=str.split("\\$");
				str=mstr[1];
				}
				else
				
					if(str.contains("%"))	
					{
						mstr=str.split("\\%");
						str=mstr[0];
					}
			
				
				System.out.println("After: "+str);
				darray[count]=Double.parseDouble(str);
				System.out.println("Converted "+count+"value is :"+darray[count]);
				count++;
			}
			}
			double discount;
			discount=darray[2]+(darray[1]*darray[2]/100);
			System.out.println("calc discount: "+discount);
			if(discount==darray[0])
			{
				System.out.println("Discount calculation is ok!");
			}
			else
			{
				System.out.println("Discount calculation is NOT matching");
			}
			break;
			
		default:
			System.out.println("Entered string value does not match!");
			break;
		}
		
		
	}
	//to compare the size of products in text with the list size
	public void compare(List<WebElement> element, WebElement textelement)
	{
		int textcount=Integer.parseInt(textelement.getText().split(" ")[2]);
		int listcount=element.size();
		if(textcount==listcount)
		{
			System.out.println("Both counts are equal");
		}
		
		
		
	}
	
	
	
}
