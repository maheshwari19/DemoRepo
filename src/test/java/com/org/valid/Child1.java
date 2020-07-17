package com.org.valid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.locate.ParentClass;

public class Child1 extends ParentClass {
@FindBy(id="email")
private WebElement textusername;
@FindBy(id="pass")
private WebElement textpassword;
@FindBy(xpath="//input[@value='Log In']")
private WebElement loginbuttonclick;
public String getTextusername() {
	return textusername.getAttribute("value");
}
public void setTextusername(String textusername) {
	this.textusername.sendKeys(textusername);
}
public String getTextpassword() {
	return textpassword.getAttribute("value");
}
public void setTextpassword(String textpassword) {
	this.textpassword.sendKeys(textpassword);
}
public WebElement getLoginbuttonclick() {
	return loginbuttonclick;
}
public void setLoginbuttonclick(WebElement loginbuttonclick) {
	this.loginbuttonclick = loginbuttonclick;
}

public Child1(){
	PageFactory.initElements(driver, this);
}
}
