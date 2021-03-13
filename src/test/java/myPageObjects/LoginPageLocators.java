package myPageObjects;

import org.openqa.selenium.By;

public class LoginPageLocators {
    public static final By email = By.xpath("//*[@type='email']");
    public static final By passwordField = By.cssSelector("[type='password']");
    public static final By button = By.tagName("button");
    public static final By error = By.className("error");
    public static final By playlistAdd = By.xpath("//i[@class='fa fa-plus-circle control create']");
    public static final By newPlaylistNameField = By.xpath("//form[@class='create']/input");
}
