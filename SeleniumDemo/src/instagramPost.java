import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramPost {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/chatu/OneDrive/Desktop/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		
		WebElement username= driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		
		username.sendKeys("pihuu__solanki__");
		password.sendKeys("Bugtest123@");
		
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		
		Thread.sleep(2000);
		
		// Example using XPath with the button text
		WebElement createButton = driver.findElement(By.xpath("////*[@id=\"mount_0_0_ME\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[7]/div/span/div/a/div/div[2]/div/div/span/span"));
		createButton.click();
		Thread.sleep(2000);
		
		WebElement selectFromComputer = driver.findElement(By.name("Select From computer"));
		selectFromComputer.click();
		
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
        fileInput.sendKeys("C:\\Users\\chatu\\OneDrive\\Pictures\\Screenshots\\Screenshot (1).png");
				
		Thread.sleep(3000);
		
		WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next']"));
        nextButton.click();
        
        WebElement nextButton1 = driver.findElement(By.xpath("//button[text()='Next']"));
        nextButton1.click();
        
        WebElement nextButton11 = driver.findElement(By.xpath("//button[text()='Next']"));
        nextButton11.click();
        
        WebElement captionField = driver.findElement(By.xpath("//textarea[@aria-label='Write a caption…']"));
        captionField.sendKeys("My automated caption using Selenium!");
        
        WebElement shareButton = (WebElement) driver.findElements(By.tagName("Share")) ;
        shareButton.click();
        driver.quit();
	}	
}