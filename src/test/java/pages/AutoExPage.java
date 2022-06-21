package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExPage {
    public AutoExPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/test_cases'])[1]")
    public WebElement testCasesLink;

    @FindBy(xpath = "//h2//b")
    public WebElement testCasesText;
}
