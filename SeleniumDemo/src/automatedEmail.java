import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automatedEmail {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/chatu/OneDrive/Desktop/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ASKXGp0vwMyO-xR0wkGGUzlPzMpdw5bMF-K97M3_nDmI8QrEhJdojvoT0tTGU9BuA3oeC9gfo4RYdA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-955576516%3A1707161915537046&theme=glif");
		Thread.sleep(8000);

		WebElement emailField = driver.findElement(By.id("identifierId"));
		emailField.sendKeys("anant.chaturvedi.786@gmail.com");
		emailField.sendKeys(Keys.RETURN);

		Thread.sleep(8000);

		WebElement passwordInput = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		passwordInput.sendKeys("Sunil@123");
		loginButton.click();
	}
}