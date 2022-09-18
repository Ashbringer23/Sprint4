package pom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@Getter
public class OrderPage {
    //строка ввода имени
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Имя']")
    private SelenideElement firstNameInput;
    //строка ввода фамилии
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Фамилия']")
    private SelenideElement secondNameInput;
    //строка ввода адреса
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement addressInput;
    //строка выбора станции метро
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Станция метро']")
    private SelenideElement metroInput;
    //лист станций метро
    @FindBy(how = How.CLASS_NAME, using = "select-search__row")
    private ElementsCollection metroList;
    //строка ввода телефона
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneInput;
    //кнопка далее
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement nextButton;

    //поле ввода даты
    @FindBy(how = How.XPATH, using = ".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']")
    private SelenideElement dateInput;
    //выбранная дата календаря
    @FindBy(how = How.XPATH, using = ".//div[contains(@class,'--selected')]")
    private SelenideElement selectedDateElement;
    //поле выбора срока аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-root")
    private SelenideElement leaseInput;
    //выпадающий список срока аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-option")
    private ElementsCollection leaseList;
    //чекбокс черный жемчуг
    @FindBy(how = How.ID, using = "black")
    private SelenideElement blackCheckbox;
    //чекбокс серая безысходность
    @FindBy(how = How.ID, using = "grey")
    private SelenideElement greyCheckbox;
    //поле комментария для курьера
    @FindBy(how = How.XPATH, using = ".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']")
    private SelenideElement commentInput;
    //кнопка заказать в поле заказа
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement orderButton;

    //кнопка подтвердить заказ
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_Buttons__1xGrp']//button[text()='Да']")
    private SelenideElement confirmButton;
    //статус заказа
    @FindBy(how = How.CLASS_NAME, using = "Order_ModalHeader__3FDaJ")
    private SelenideElement statusLabel;

    public void fillUserInfo(String firstName, String secondName, String address, String metro, String phone) {
        firstNameInput.setValue(firstName);
        secondNameInput.setValue(secondName);
        addressInput.setValue(address);
        metroInput.click();
        metroList.findBy(Condition.have(Condition.text(metro))).click();
        phoneInput.setValue(phone);
        nextButton.click();
    }

    public void fillOrderDetails(String date, int period, Color color, String message) {
        dateInput.setValue(date);
        selectedDateElement.click();
        leaseInput.click();
        leaseList.get(period - 1).click();
        if (color == Color.GREY) {
            greyCheckbox.click();
        } else {
            blackCheckbox.click();
        }
        commentInput.setValue(message);
        orderButton.click();
    }

    public void confirmOrder() {
        confirmButton.click();
    }

    public enum Color {
        BLACK, GREY
    }
}
