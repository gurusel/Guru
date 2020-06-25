package IframeValidation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

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
			driver.get("http://www.leafground.com/");
			}
		
		}
			

public void getTitle()
{
	System.out.println(driver.getTitle());
}

public void listSize(List<WebElement> elements)
{
	System.out.println(elements.size());
}

public List<WebElement> listFrame()
{
	
	List<WebElement> elementList=driver.findElements(By.tagName("iframe"));
	return elementList;
}

public void printBody()
{
	System.out.println(driver.findElement(By.tagName("body")).getText().toString());
}

public void clickButton(String id)
{
	WebElement button=driver.findElement(By.id(id));
	System.out.println("Before click " +button.getText().toString());
	button.click();
	System.out.println("After click " +button.getText().toString());
	
}

public void getBodyText(List<WebElement> framelist)
{
	int count=0;
	for(WebElement element:framelist)
	{
		
		System.out.println(element.getAttribute("src").toString());
		
		switch(count)
		{
		case 0:
			switchFrame(0);
			printBody();
			clickButton("Click");
			
			driver.switchTo().defaultContent();
			break;
		
		case 1:
			switchFrame(1);
			
			printBody();
			
			switchFrame(0);
			System.out.println("Nested Frame");
			printBody();
			clickButton("Click1");
			
			
			driver.switchTo().defaultContent();
			break;
			
		case 2:
			switchFrame(2);
			
			printBody();
			
			switchFrame(0);
			System.out.println("Inside Frame");
			printBody();
			
			driver.switchTo().defaultContent();
			break;
		
		default:
			break;
		
		}
		
		
		count++;
	}
	
}



public void switchFrame(int frameindex)
{
	driver.switchTo().frame(frameindex);
	System.out.println("Frame "+(frameindex+1));
	
}


///Draggable reusable functions
public void getText(WebElement element)
{
	System.out.println("Header text content: "+element.getText());
}

public void getPosition(WebElement element)
{
	System.out.println("X position: "+element.getLocation().getX());
	System.out.println("Y position: "+element.getLocation().getY());
	
	System.out.println("Window height:  "+driver.manage().window().getSize().height);
	System.out.println("Window width:  "+driver.manage().window().getSize().width);
	
}

public void getNewPosition(WebElement element,int x, int y)
{
	//element.getLocation().move(x, y);
	Actions ac=new Actions(driver);
	//ac.moveByOffset(x, y).build().perform();
	ac.dragAndDropBy(element, x, y).build().perform();
	
		
	System.out.println("X position: "+element.getLocation().getX());
	System.out.println("Y position: "+element.getLocation().getY());
	
	
}





public void getCSSProperty(WebElement element)
{
	
	
	
	System.out.println(element.getCssValue("style"));
	System.out.println(element.getCssValue("postion"));
	System.out.println(element.getCssValue("border"));
}



}
