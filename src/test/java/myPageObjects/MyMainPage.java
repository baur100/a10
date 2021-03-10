package myPageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyMainPage extends BasePage{


    public MyMainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getHomeButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        return driver.findElement(By.cssSelector(".home"));
    }
    Actions actions = new Actions(driver);

    private void clickAddPlayListButton() {
        wait.until(ExpectedConditions.elementToBeClickable(LoginPageLocators.playlistAdd));
        for (int i = 0; i<5;i++) {
            try {
                driver.findElement(LoginPageLocators.playlistAdd).click();
                break;
            } catch (ElementClickInterceptedException ignored) {}
        }

    }

    private WebElement newPlayListNameField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageLocators.newPlaylistNameField));
        return driver.findElement(LoginPageLocators.newPlaylistNameField);
    }


    public boolean isMainPage() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException ignore) {
            return false;
        }
    }

    public String createPlaylist(String playListName) throws InterruptedException {
        String id = "";
        clickAddPlayListButton();
        Thread.sleep(3000);
        newPlayListNameField().sendKeys(playListName);
        newPlayListNameField().submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String id, String playListName) {
        boolean exist;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+id+"']"));
        WebElement playListNameHeader = driver.findElement(By.xpath("//*[@id='playlistWrapper']/h1/span"));
        exist = playlist.isDisplayed() && playlist.getText().equals(playListName) && playListNameHeader.getText().equals(playListName);
        return exist;
    }

    public void renamePlaylist(String playListId, String newListName) {
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playListId+"']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        wait.until(ExpectedConditions.elementToBeClickable(playlist));
        actions.doubleClick(playlist).perform();
        WebElement playlistRenameForm = driver.findElement(By.xpath("//li[@class='playlist playlist editing']/input"));
        wait.until(ExpectedConditions.elementToBeClickable(playlistRenameForm));
        playlistRenameForm.sendKeys(Keys.CONTROL, "A");
        playlistRenameForm.sendKeys(newListName);
        playlistRenameForm.sendKeys(Keys.ENTER);
//        driver.getCurrentUrl().equals();

    }

    public boolean isPlayListVisible (String playListId, String playListName) throws InterruptedException {
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playListId+"']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Thread.sleep(5000);
        return true;
    }
}
