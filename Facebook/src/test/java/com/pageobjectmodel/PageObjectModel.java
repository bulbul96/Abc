package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
WebDriver driver;
public PageObjectModel(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@name='email']")
private WebElement email;
public WebElement getEmail() {
	return email;
}
//public void setEmail(WebElement email) {
//	this.email = email;
//}
@FindBy(xpath="//input[@id='pass']")
private WebElement password;
public WebElement getPassword() {
	return password;
}
//public void setPassword(WebElement password) {
//	this.password = password;
//}
@FindBy(xpath="//input[@value='Log In']")
private WebElement login;
public WebElement getLogin() {
	return login;
}
//public void setLogin(WebElement login) {
//	this.login = login;
//}


}


