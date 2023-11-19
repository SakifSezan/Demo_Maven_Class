package StepDefinition;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDep {

WebDriver driver;
	@Given("^Open hp Application <URL>$")
public void open_hp_Application_URL() throws Throwable {
	System.setProperty("Webdriver.chrome.driver", "C:\\ChromeDriver\\chrome.exe\"");
	ChromeOptions TX = new ChromeOptions();
	TX.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver();
	//driver.get("https://www.southwest.com/");
	driver.get("https://www.paychex.com/login");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
}

@Then("^Mouse hover to shop$")
public void mouse_hover_to_shop() throws Throwable {
	Actions A = new Actions(driver);
	A.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[1]/div[2]/nav/div[1]/div/div[1]/div/div/div[3]/span[1]"))).build().perform();
	
	driver.findElement(By.id("onetrust-accept-btn-handler"));
	
}

@Then("^Click laptops$")
public void click_laptops() throws Throwable {
	Actions B = new Actions(driver);
	B.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[1]/div[2]/nav/div[2]/div[2]/div[3]/div[1]/ul/div[1]/div[2]/ul/a[1]/div/div/li/label")));
	B.click();
	
}

@Then("^Open laptop page$")
public void open_laptop_page() throws Throwable {
   
 
}
@Then("^Mouse hover to all catagories$")
public void mouse_hover_to_all_catagories() throws Throwable {
	Actions A = new Actions(driver);
	A.moveToElement(driver.findElement(By.id("a2700.product_home_newuser.header.i9.94e867afeoEg3D"))).build().perform();
	
   
}

@Then("^Dropdown to Fashion & Beauty$")
public void dropdown_to_Fashion_Beauty() throws Throwable {
	//Select B = new Select(driver.findElement(By.id("a2700.product_home_newuser.header.i10.94e867afeoEg3D")));
	
    
}

@Then("^Click Jewelery page$")
public void click_Jewelery_page() throws Throwable {
   
}
@Then("^Scroll down to Sony xperia$")
public void scroll_down_to_Sony_xperia() throws Throwable {
    
	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	Thread.sleep(5000);
	WebElement A = driver.findElement(By.xpath("//a[text()='Sony xperia z5']"));
	A.click();
	Thread.sleep(3000);
	driver.close();
	
}
@Then("^Handle Frame$")
public void handle_Frame() throws Throwable {
  
	((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	
	JavascriptExecutor JS  = (JavascriptExecutor)driver;
	JS.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value= '09/20/2023'");
	JS.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value= '09/30/2023'");
}

@Then("^Window handle$")
public void window_handle() throws Throwable {
	
	WebElement A = driver.findElement(By.xpath("//a[contains(text(),'Paychex Flex login')]"));
	A.click();
	
	Set<String>allwindow = driver.getWindowHandles();
    Iterator<String> B = allwindow.iterator();
   
    String parentwindow = B.next();
    String childwindow = B.next();
    
    driver.switchTo().window(childwindow);
    System.out.println("This is the Child Window");
    Thread.sleep(5000);
    
    driver.switchTo().window(parentwindow);
    System.out.println("This is the Parent Window");
    Thread.sleep(5000);
    driver.quit();
    
    
   
}


@Then("^Select depart/arriaval dates$")
public void select_depart_arriaval_dates() throws Throwable {
	JavascriptExecutor TX  = (JavascriptExecutor)driver;
	TX.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value= '09/20/2023'");
	TX.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value= '09/30/2023'");
}
}


