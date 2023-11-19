package StepDefinition;

import java.time.Duration;

import javax.swing.text.Document;

//import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NewStepDep {

	WebDriver driver;
@Given("^Open application <URL>$")
public void open_application_URL() throws Throwable {
	System.setProperty("Webdriver.chrome.driver", "C:\\ChromeDriver\\chrome.exe\"");
	ChromeOptions TX = new ChromeOptions();
	TX.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver();
	driver.get("https://www.united.com/en/us/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
}

@Then("^Click frame no (\\d+)$")
public void click_frame_no(int arg1) throws Throwable {
	//driver.switchTo().frame("classFrame");
	
	driver.switchTo().frame("packageListFrame");
  
}

@Then("^Click Index$")
public void click_Index() throws Throwable {
	//WebElement A = driver.findElement(By.xpath("/html/body/div[1]/ul/li[7]/a"));
	//A.click();
	
	WebElement B = driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]/a"));
	B.click();
	
}
@Then("^Scroll up/down web page$")
public void scroll_up_down_web_page() throws Throwable {
	
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("scroll(0, 6000)");
	
	WebElement C = driver.findElement(By.xpath("/html/body/main/div[3]/div[2]/div/div[27]/div[1]/div/div[2]/a/p"));
			C.click();
	
	
	
	//Thread.sleep(2000);
	//((JavascriptExecutor)driver).executeScript("scroll(0, -500)");
   
}
@Then("^Enter depart/arriaval dates$")
public void enter_depart_arriaval_dates() throws Throwable {
   
	JavascriptExecutor TX = (JavascriptExecutor)driver;
	TX.executeScript("document.getElementByid('DepartDate').value= '10/20/2023'");
	TX.executeScript("document.getElementByid('ReturnDate').value= '10/30/2023'");
	
}
}
