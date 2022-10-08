package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.Thread;

public class UtestPage extends BasePage {

    // Buttons
    private String joinButton = "/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a";
    private String nextLocationButton = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a";
    private String nextDevicesButton  = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a";
    private String lastStepButton = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span";
    private String completeButton = "//*[@id=\"laddaBtn\"]";

    // Fields
    private String firstNameField = "//*[@id=\"firstName\"]";
    private String lastNameField = "//*[@id=\"lastName\"]";
    private String emailField = "//*[@id=\"email\"]";
    private String setMonth = "//*[@id=\"birthMonth\"]";
    private String setDay = "//*[@id=\"birthDay\"]";
    private String setYear = "//*[@id=\"birthYear\"]";

    // Devices
    private String setCity = "//*[@id=\"city\"]";
    private String setZip = "//*[@id=\"zip\"]";
    private String setCountry = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]";

    private String setVersion       = "//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span";
    private String writeVersion     = "//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]";
    private String setLanguage      = "//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span";
    private String writeLanguage    = "//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]";
    private String setBrand         = "//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span";
    private String writeBrand       = "//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]";
    private String setModel         = "//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span";
    private String writeModel       = "//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]";
    private String setOS            = "//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span";
    private String writeOS          = "//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]";

    // Last step
    private String setPass = "//*[@id=\"password\"]";
    private String confirmPass = "//*[@id=\"confirmPassword\"]";
    private String acceptTerms = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]";
    private String acceptPrivacy = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]";
    
    public UtestPage(){
        super(driver);
    }

    public void navigateToUtest(){
        navigateTo("https://www.utest.com/");
    }

    public void clickJoinButton(){
        clickElement(joinButton);
    }

    // Fill out the form
    // First name Field
    public void enterFirstName(String criteria){
        write(firstNameField, criteria);
    }
    // Last name Field
    public void enterLastName(String criteria){
        write(lastNameField, criteria);
    }
    // Click on LogIn Button
    public void enterEmail(String criteria){
        //clickElement(loginButton);
        write(emailField, criteria);
    }

    // Set Month
    public void setMonth(){
        selectFromDropDownByText(setMonth, "June");
    }
    // Set Day
    public void setDay(){
        selectFromDropDownByText(setDay, "7");
    }
    // Set Year
    public void setYear(){
        selectFromDropDownByText(setYear, "1993");
    }
    // Funcion esperar
    public void waitFunction(){
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error durante la espera");
        }
    }
    // Click Next Location Button
    public void clickNextLocationButton(){
        clickElement(nextLocationButton);
    }
    // City
    public void setCity(String criteria){
        write(setCity, criteria);
    }
    // Zip
    public void setZip(String criteria){
        write(setZip, criteria);
    }
    // Country
    public void setCountry(){
        selectFromDropDownByText(setCountry, "Colombia");
    }
    // Click Next Devices Button
    public void clickNextDevicesButton(){
        clickElement(nextDevicesButton);
    }
    // Version
    public void setVersion(String criteria){
        //selectFromDropDownByText(setVersion, "Ubuntu");
        clickElement(setVersion);
        write(writeVersion, criteria);
        pressEnter(writeVersion);
    }
    // Language
    public void setLanguage(String criteria){
        //selectFromDropDownByText(setLanguage, "Spanish");
        clickElement(setLanguage);
        write(writeLanguage, criteria);
        pressEnter(writeLanguage);
    }
    // Brand
    public void setBrand(String criteria){
        //selectFromDropDownByText(setBrand, "Samsung");
        clickElement(setBrand);
        write(writeBrand, criteria);
        pressEnter(writeBrand);
    }
    // Model
    public void setModel(String criteria){
        //selectFromDropDownByText(setModel, "Galaxy A");
        clickElement(setModel);
        write(writeModel, criteria);
        pressEnter(writeModel);
    }
    // OS
    public void setOS(String criteria){
        //selectFromDropDownByText(setOS, "Android 7.1.1");
        clickElement(setOS);
        write(writeOS, criteria);
        pressEnter(writeOS);
    }
    public void clickLastStepButton(){
        clickElement(lastStepButton);
    }
    // Set Pass
    public void setPass(String criteria){
        write(setPass, criteria);
    }
    // Confirm Pass
    public void confirmPass(String criteria){
        write(confirmPass, criteria);
    }
    // Accept Terms
    public void clickAcceptTerms(){
        clickElement(acceptTerms);
    }
    // Accept Privacy
    public void clickAcceptPrivacy(){
        clickElement(acceptPrivacy);
    }
    // Complete Setup
    public void clickComplete(){
        clickElement(completeButton);
    }


    // Validación
    //public String validateResult(){
        //return textFromElement(validacion);
    //}
}
