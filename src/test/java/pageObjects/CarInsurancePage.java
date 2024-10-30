package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarInsurancePage extends BasePage {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

	public CarInsurancePage(WebDriver driver) {
		super(driver); //Invoking the BasePage Constructor
	}

	
	//Located all the webElements necessary. 
	@FindBy(xpath = "//span[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']")
	WebElement clickHere;

	@FindBy(xpath = "//input[@class='form-control' and @name='searchTerm']")
	WebElement City_Rto_searchbar;

	@FindBy(xpath = "//div[@class='options open']//div[1]")
	WebElement dropdown_RTO_Options;

	@FindBy(xpath = "//input[@placeholder='Search Car Make']")
	WebElement car_searchbar;

	@FindBy(xpath = "//div[@class='options open']//div[1]")
	WebElement car_search_options;

	@FindBy(xpath = "//li[normalize-space()='Petrol']")
	WebElement select_fuleType;

	@FindBy(xpath = "//input[@placeholder='Search Car Vaiants']")
	WebElement carvarient_SearchBox;

	@FindBy(xpath = "//div[@class='options open']/div[1]")
	WebElement clickCarVarient;

	@FindBy(xpath = "//input[@placeholder='Full name']")
	WebElement name_Bar;

	@FindBy(xpath = "//input[@placeholder='Mobile number']")
	WebElement mobile_bar;

	@FindBy(xpath = "//div[@class='errorMsg']")
	List<WebElement> errMsgs;

	@FindBy(xpath = "//button[@class='primaryBtnV2 width-100']")
	WebElement FindPlanBtn;

	
	//Added all the action methods necessary. 
	public void clickHereBtn() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']")));
		wait.until(ExpectedConditions.elementToBeClickable(clickHere));
		clickHere.click();
	}

	public void Search_City_Rto(String RTO_City) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='form-control' and @name='searchTerm']")));
		wait.until(ExpectedConditions.elementToBeClickable(City_Rto_searchbar));
		City_Rto_searchbar.sendKeys(RTO_City);
	}

	public void click_RTO_Option() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='options open']//div[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown_RTO_Options));
		dropdown_RTO_Options.click();
	}

	public void carSearch(String CarBrand) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search Car Make']")));
		wait.until(ExpectedConditions.elementToBeClickable(car_searchbar));
		car_searchbar.sendKeys(CarBrand);
	}

	public void clickcarOptions() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='options open']//div[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(car_search_options));
		car_search_options.click();
	}

	public void click_fuelType() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[normalize-space()='Petrol']")));
		wait.until(ExpectedConditions.elementToBeClickable(select_fuleType));
		select_fuleType.click();
	}

	public void car_varient(String Car_Varient) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search Car Vaiants']")));
		wait.until(ExpectedConditions.elementToBeClickable(carvarient_SearchBox));
		carvarient_SearchBox.sendKeys(Car_Varient);// "2.3 VTi AUTO TRANSMISSION (2254 cc)"
	}

	public void clk_CarVarient() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='options open']/div[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(clickCarVarient));
		clickCarVarient.click();
	}

	public void send_name(String Name) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Full name']")));
		wait.until(ExpectedConditions.elementToBeClickable(name_Bar));
		name_Bar.sendKeys(Name);
	}

	public void enter_mobileNo(String MobileNo) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Mobile number']")));
		wait.until(ExpectedConditions.elementToBeClickable(mobile_bar));
		mobile_bar.sendKeys(MobileNo);
	}

	public void printErrMsgs() {
		for (WebElement x : errMsgs) {
			System.out.println(x.getText());
		}
	}

	public void clickFindPlan() {
		FindPlanBtn.click();
	}

}
