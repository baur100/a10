package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    JavascriptExecutor js ;



    public MainPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver,10);
    }
    private WebElement getHomeButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        return driver.findElement(By.cssSelector(".home"));
    }
    public boolean isMainPage(){
        try{
            return getHomeButton().isDisplayed();
        } catch (TimeoutException ignored){
            return false;
        }
    }
    public WebElement getPlusButton(){
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/nav/section[2]/h1/i")));

        return driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/section[2]/h1/i"));

    }

   public WebElement getPlaylistField(){
       return driver.findElement(By.cssSelector("[type='text']"));
    }

    public String createPlaylist(String name){
        Actions actions = new  Actions(driver);
        actions.moveToElement(getPlusButton()).click().build().perform();
         getPlaylistField().sendKeys(name);
        String s= getPlaylistField().getAttribute("text");
        // getPlaylistField().submit();




        //String s =getPlaylistField().getAttribute("name");

        return s;
    }

    public boolean isPlaylistExist(String playlistId, String playlistName) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playId = driver.findElement(By.xpath("//*[@id=\"playlists\"]/ul/li[3]/a"));

        js.executeScript("arguments[0].scrollIntoView();", playId);
       // WebElement pName=driver.findElement(By.linkText(playlistId));
        String playlistName1=playId.getText();



        if (playlistName1==playlistName) {
            return true; // if element is displayed
        }else{
            return false;
        }
    }
}
