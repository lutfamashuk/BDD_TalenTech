package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageObjects {
	
	public static String homepageURL= "https://demo.oscommerce.com/";
	public static String homepageTitle= "osCommerce Demo";
	
	public static String loginpageURL= "https://demo.oscommerce.com/login.php";
	
	public static String email =  "lutfamashuk@yahoo.com"; 
	public static String password = "talentech123"; 

	public static String AccountviewURL= "https://demo.oscommerce.com/account_edit.php";
	
	public static String PrintersURL= "https://demo.oscommerce.com/index.php?cPath=1_5";

	@FindBy
	(id= "tdb3")
	public static	WebElement myAccountButton;
	
	@FindBy
	(name= "email_address")
	public static	WebElement emailTextBox;

	@FindBy
	(xpath= "//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[2]/td[2]/input")
	public static	WebElement passwordTextbox;

	@FindBy
	(css= "#tdb1 > span.ui-button-icon-primary.ui-icon.ui-icon-key\r\n")
	public static	WebElement signInButton;
	
	
	@FindBy
	(xpath= "//*[@id=\"bodyContent\"]/div/div[1]/ul/li[1]/a")
	public static WebElement MyAccount; 
	
	@FindBy
	(xpath= "//*[@id=\"columnLeft\"]/div[1]/div[2]/a[1]")
	public static WebElement Hardware; 
	
	@FindBy
	(xpath= "//*[@id=\"bodyContent\"]/div/div/table/tbody/tr[3]/td[1]/a/img")
	public static WebElement Printers; 
	 
	
}
