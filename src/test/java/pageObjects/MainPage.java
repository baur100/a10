package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    Logger logger = LogManager.getLogger(MainPage.class);
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getHomeButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        return driver.findElement(By.cssSelector(".home"));
    }
    private void clickPlusButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fa-plus-circle")));
        for(int i=0;i<5;i++){
            try{
                driver.findElement(By.cssSelector(".fa-plus-circle")).click();
                break;
            } catch (ElementClickInterceptedException err){
                logger.fatal("Exception + "+err.getMessage());
            }
        }
    }

    private WebElement getNewPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }
    public boolean isMainPage(){
        try{
            return getHomeButton().isDisplayed();
        } catch (TimeoutException ignored){
            return false;
        }
    }
    private WebElement getEditField(){
        return driver.findElement(By.xpath("//*[@type='text']"));
    }
    public String createPlaylist(String name){
        logger.info("Playlist name = "+name);
        clickPlusButton();
        getNewPlaylistField().sendKeys(name);
        getNewPlaylistField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId, String playlistName) {
        WebElement newPlaylist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", newPlaylist);

        return newPlaylist.getText().equals(playlistName) && newPlaylist.isDisplayed();
    }

    public void renamePlaylist(String playlistId, String newName) {
        wait.until(ExpectedConditions.visibilityOf(getHomeButton()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ig){}
        logger.debug("New name = "+newName);
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        doubleClick(playlist);
        getEditField().sendKeys(newName);
        getEditField().sendKeys(Keys.ENTER);

    }
    public void doubleClick(WebElement playlist){
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        for (int i = 0;i<55;i++){
            try {
                getEditField().sendKeys(Keys.CONTROL+"a");
                break;
            } catch (ElementNotInteractableException ignored){
                System.out.println("bbad");
            }
        }
    }
}
