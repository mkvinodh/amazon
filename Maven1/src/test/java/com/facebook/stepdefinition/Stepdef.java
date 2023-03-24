package com.facebook.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import MAVEN_PROJECT.Maven1.Base_Class1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef extends Base_Class1 {
	static WebDriver driver;

	@Given("Useer enter into Adactin Home page")
	public static void user_enter_into_adactin_home_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("User enter the username in the username field")
	public static void user_enter_the_username_in_the_username_field() {
		WebElement username = driver.findElement(By.id("username"));
		sendKeys(username, "Vijayakumar2023");
	}

	@When("User enter the password in the password field")
	public static void user_enter_the_password_in_the_password_field() {
		WebElement password = driver.findElement(By.id("password"));
		sendKeys(password, "J21QN8");
	}

	@Then("user click the login button")
	public void user_click_the_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		click(login);
	}

	@Given("user enter into search page")
	public static void user_enter_into_search_page() {

	}

	@When("user select the Hotel location in location field")
	public static void use_select_the_hotel_location_in_location_field() {
		WebElement location = driver.findElement(By.id("location"));
		single_drop_Down(location, "Index", "5");
	}

	@When("user select the hotel name in Hotel field")
	public static void user_select_the_hotel_name_in_hotel_field() {
		WebElement hotels = driver.findElement(By.id("hotels"));
		single_drop_Down(hotels, "visible_Text", "Hotel Sunshine");
	}

	@When("user select the room type in Room Type field")
	public static void user_select_the_room_type_in_room_type_field() {
		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		single_drop_Down(roomtype, "VisibleText", "Deluxe");
	}

	@When("User choose the number of rooms in Number field")
	public static void User_choose_the_number_of_rooms_in_number_field() {
		WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		single_drop_Down(roomnos, "value", "2");
	}

	@When("user enter the check in date")
	public static void user_enter_the_check_in_date() {
		WebElement checkinDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		sendKeys(checkinDate, "");
		sendKeys(checkinDate, "16/03/2023");
	}

	@When("user enter the checkout date")
	public static void user_enter_the_checkout_date() {
		WebElement checkoutDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		sendKeys(checkoutDate, "");
		sendKeys(checkoutDate, "20/03/2023");
	}
	
	
	

}
