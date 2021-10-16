package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import application.Driver;

public class SearchPage {

	WebDriver driver = Driver.getInstance().getDriver();

	By searchKey = By.className("search-box");
	By searchButton = By.xpath("//i[@class='search-icon']");
	By closeButton = By.xpath("//div[@class='modal-close']");
	public void performSearch() {
		searchItem();
	}
	
	private void searchItem() {

		driver.findElement(closeButton).click();
		driver.findElement(searchKey).sendKeys("masa", Keys.ENTER);
	}

	public String openSecondPage() {
		
		String hrefLink = driver.findElement(By.xpath("//*[@data-id='34259747']/div[1]/a")).getAttribute("href");
		driver.get(hrefLink);
		return hrefLink;
	}
	
}
