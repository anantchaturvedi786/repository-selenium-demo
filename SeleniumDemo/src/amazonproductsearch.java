import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class amazonproductsearch {
	
	private WebDriver driver;
	
	@BeforeClass
	
	public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/chatu/OneDrive/Desktop/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
	
	@Test
    public void amazonProductSearchTest() throws InterruptedException {
        driver.get("https://www.ubuy.co.in/");
        
        
        WebElement searchInput = driver.findElement(By.xpath("//input[@title='Search']"));
        searchInput.sendKeys("Tshirt");
     
        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'search-button') and contains(@class, 'submit')]"));
        button.click();
        Thread.sleep(4000);

        WebElement selecttshirt = driver.findElement(By.xpath("//h2[@class='product-title']"));
        selecttshirt.click();
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath_of_next_element")));
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //WebElement addToCartButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='add-to-cart-btn']")));
        //Thread.sleep(4000);
        
        //---
        //WebElement addtocart = driver.findElement(By.xpath("//button[@class='btn btn-primary add-to-cart-btn' and contains(text(), 'Add to cart')]"));
        //addtocart.click();
        //Thread.sleep(4000);

        //WebElement addToCartButton = driver.findElement(By.id("add-to-cart-btn"));
        //WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-btn']"));
        
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element22 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='add-to-cart-btn']")));
        element22.click();

        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-btn']"));

        addToCartButton.click();

        Thread.sleep(8000);  
	}
        
        @AfterClass
        public void tearDown() {
            if (driver != null) {
                driver.quit();
    }
        } 
        }
