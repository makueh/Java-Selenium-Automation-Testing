package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import application.Driver;

public class ProductPage {
	
	WebDriver driver = Driver.getInstance().getDriver();

	By productContainer = By.className("products-container");
	By productIndex = By.xpath("//li[@product-index]");
	By addToCartButton = By.xpath("//button[@class='add-to-basket']");
	By price = By.xpath("//*[@class=\'prc-slg\']");
	
	public String getProductPrice() {
		
		addToCart();
		return driver.findElement(price).getText();				
	}

	private void pickProductAndOpenPage() {
		
		List<WebElement> listOfItems = driver.findElements(productContainer).get(0).findElements(productIndex);
		WebElement randomElement = listOfItems.get(new Random().nextInt(listOfItems.size()));   
		randomElement.click();
	}
	
	private void addToCart() {
		
		WebElement addToCart = driver.findElement(addToCartButton);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", addToCart);
	}
	

}
