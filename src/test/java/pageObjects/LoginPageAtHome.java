//package pageObjects;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

/////////Идея POM-Каждый Вэб элемент это отдельное поле в классе!!!/////////////////////////////////////

//public class LoginPageAtHome {
//    private WebDriver driver; // Для начала работы нам нужен драйвер(создаем копию большого Вэб драйвера)
//    WebDriverWait wait;// 4-й шаг Создаем ожидалку
//
//    public LoginPageAtHome(WebDriver driver) {   //0-й шаг Создаем конструктор
//        this.driver = driver;
//        wait = new WebDriverWait(driver, 10);// 5-й шаг Создаем ожидалку
//    }
//
//    //1-й шаг Создаю геттеры для каждого вэб элемента кот будут возвращать Вэб элемент
//    private WebElement getEmailField() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='email']")));//6 -й шаг вставляем ожидалку
//
//        return driver.findElement(By.cssSelector("[type='email']"));
//    }
//
//    private WebElement getPasswordField() {
//        return driver.findElement(By.xpath("//*[@type='password']"));
//    }
//
//    private WebElement getLoginButton() {
//        return driver.findElement(By.cssSelector("button"));
//    }
//
//    /////////////////////////////////////////////////////////////////////////////////////////
////2-й шаг Создаю методы(функцию) для Login Application

//    public MainPageAtHome loginToApplication(String username, String password) {
//        getEmailField().sendKeys(username);
//        getPasswordField().sendKeys(password);
//        getLoginButton().click();
//        return new MainPageAtHome(driver);
//    }
//
//    ////////////////////////////////////////////////////////////////////////////////////////////
////7 ой шаг Создаем метод kот будет отрывать Login Page
//    public void open() {
//        driver.get("https://koelapp.testpro.io");
//
//
//    }
//
//    private WebElement getError() {
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
//       return driver
//    }
//
//    public boolean isError() {
//    }
//}
