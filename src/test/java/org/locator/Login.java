package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.sample.BaseClass;

public class Login extends BaseClass {
public Login() {
	PageFactory.initElements(driver, this);
}
@FindAll({@FindBy(id="username"),@FindBy(xpath="//input[@name='usernam']")})
private WebElement username;

@FindAll({@FindBy(id="password"),@FindBy(xpath="//input[@name='passwor']")})
private WebElement password;

@FindAll({@FindBy(id="login"),@FindBy(xpath="//input[@name='logi']")})
private WebElement loginbtn;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginbtn() {
	return loginbtn;
}
}
