package WomenDress;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class WomenObject extends BasePage{

	public WomenObject() {
	PageFactory.initElements(driver, this);
	}

//@FindBy(xpath="//li[@class=\"sfHoverForce\"]/a[text()='Women']")
@FindBy(xpath="//div[@id=\"block_top_menu\"]/ul/li/a[@title=\"Women\"]")
private WebElement women;


@FindBy(xpath="//span[@class=\"heading-counter\"]")
private WebElement span;


@FindBys(@FindBy(xpath="//div[@class=\"product-container\"]/div/div/a[@class=\"product_img_link\"]"))
private List<WebElement> womenDressList;

@FindBys(@FindBy(xpath="//div[@class=\"right-block\"]//span[@class=\"price product-price\"]"))
private List<WebElement> priceList;

//get title of special
@FindBy(xpath="//div[@id=\"special_block_right\"]/p/a")
private WebElement special;

//get the prices of special dress
@FindBy(xpath="//div[@class=\"product-content\"]/div/span")
private List<WebElement> spcprice;



public WebElement women()
{
	return women;
}
	
public WebElement span()
{
	return span;
}
	
public List<WebElement> womenDressList()
{
	return womenDressList;
}
	
public List<WebElement> priceList()
{
	return priceList;
}

public WebElement special()
{
	return special;
}

//to get the special dress price
public List<WebElement> spcprice()
{
	return spcprice;
}
	
	
}
