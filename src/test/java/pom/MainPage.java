package pom;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

@Getter
public class MainPage {
    //главная(корневая) страница
    @FindBy(how = How.ID, using = "root")
    private SelenideElement rootPage;
    //главная страница
    @FindBy(how = How.CLASS_NAME, using = "App_App__15LM-")
    private SelenideElement mainPage;
    //контент
    @FindBy(how = How.CLASS_NAME, using = "Home_HomePage__ZXKIX")
    private SelenideElement content;
    //хедер
    @FindBy(how = How.CLASS_NAME, using = "Header_Header__214zg")
    private SelenideElement header;
    //первая часть страницы
    @FindBy(how = How.CLASS_NAME, using = "Home_FirstPart__3g6vG")
    private SelenideElement firstPartPage;
    //вторая часть страницы
    @FindBy(how = How.CLASS_NAME, using = "Home_SecondPart__T0Okx")
    private SelenideElement secondPartPage;
    //третья часть страницы
    @FindBy(how = How.CLASS_NAME, using = "Home_ThirdPart__LSTEE")
    private SelenideElement thirdPartPage;
    //четвертая часть страницы
    @FindBy(how = How.CLASS_NAME, using = "Home_FourPart__1uthg")
    private SelenideElement fourthPartPage;

    //логотип
    @FindBy(how = How.CLASS_NAME, using = "Header_Logo__23yGT")
    private SelenideElement logo;
    //ссылка на яндекс
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement yandexLink;
    //ссылка на самокат
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement scooterLink;
    //дисклеймер
    @FindBy(how = How.CLASS_NAME, using = "Header_Disclaimer__3VEni")
    private SelenideElement disclaimer;
    //панель хедера с кнопками
    @FindBy(how = How.CLASS_NAME, using = "Header_Nav__AGCXC")
    private SelenideElement headerButtonPanel;
    //кнопка заказать сверху
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement headerOrderButton;
    //кнопка статус заказа
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement orderStatusButton;
    //панель поиска заказа
    @FindBy(how = How.CLASS_NAME, using = "Header_SearchInput__3YRIQ")
    private SelenideElement orderSearchPanel;
    //поле ввода для поиска заказа
    @FindBy(how = How.CLASS_NAME, using = "Input_InputContainer__3NykH")
    private SelenideElement orderEntryField;
    //сообщения об ошибке
    @FindBy(how = How.CLASS_NAME, using = "Input_ErrorMessage__3HvIb")
    private List<SelenideElement> errorMessages;
    //подсказака поля ввода для поиска заказа
    @FindBy(how = How.XPATH, using = ".//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    private SelenideElement hintOrderEntryField;
    //кнопка поиска заказа
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement searchButton;
    //картинка скутера празрачная
    @FindBy(how = How.CLASS_NAME, using = "Home_BluePrint__TGX2n")
    private SelenideElement scooterTransparentPicture;
    //картинка скутера заполненная
    @FindBy(how = How.CLASS_NAME, using = "Home_Scooter__3YdJy")
    private SelenideElement scooterFilledPicture;
    //стрелка вниз
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_ArrowDown__fnDme Home_Animated__17o7s Home_Bounce__O19_v']")
    private SelenideElement arrowToDown;
    //заголовок страницы
    @FindBy(how = How.CLASS_NAME, using = "Home_Header__iJKdX")
    private SelenideElement pageTitle;
    //подзаголовки страницы
    @FindBy(how = How.CLASS_NAME, using = "Home_SubHeader__zwi_E")
    private List<SelenideElement> pageSubheadings;
    //таблица характеристик
    @FindBy(how = How.CLASS_NAME, using = "Home_Table__2kPxP")
    private SelenideElement characteristicTable;
    //строки таблицы
    @FindBy(how = How.CLASS_NAME, using = "Home_Row__jdQW2")
    private List<SelenideElement> characteristicTableRows;
    //ячейки таблицы
    @FindBy(how = How.CLASS_NAME, using = "Home_Column__xlKDK")
    private List<SelenideElement> characteristicTableTexts;
    //разделители таблицы
    @FindBy(how = How.CLASS_NAME, using = "Home_Separator__3cWAk")
    private List<SelenideElement> characteristicTableSeparators;
    //первая строка таблицы
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Row__jdQW2 Home_FirstRow__1pAl9']")
    private SelenideElement characteristicTableFirstRow;
    //дорожная карта покупки самоката
    @FindBy(how = How.CLASS_NAME, using = "Home_RoadMap__2tal_")
    private SelenideElement roadMap;
    //элементы дорожной карты
    @FindBy(how = How.CLASS_NAME, using = "Home_StatusBrick__1PsW9")
    private List<SelenideElement> roadMapElements;
    //графические элементы нумерации
    @FindBy(how = How.CLASS_NAME, using = "Home_StatusCircle__3_aTp")
    private List<SelenideElement> roadMapGraphics;
    //тексы элементов дорожной карты
    @FindBy(how = How.CLASS_NAME, using = "Home_StatusInfo__HrjoZ")
    private List<SelenideElement> roadMapTexts;
    //заголовки элементов дорожной карты
    @FindBy(how = How.CLASS_NAME, using = "Home_Status__YkfmH")
    private List<SelenideElement> roadMapHeaders;
    //описание элементов дорожной карты
    @FindBy(how = How.CLASS_NAME, using = "Home_StatusDescription__3WGl5")
    private List<SelenideElement> roadMapDescriptions;
    //последний графический элемент нумерации
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusCircle__3_aTp Home_Lineless__2-Rxp']")
    private SelenideElement lastGraphicNumberingElement;
    //контейнер кнопки заказать снизу
    @FindBy(how = How.CLASS_NAME, using = "Home_FinishButton__1_cWm")
    private SelenideElement endPageOrderButtonContainer;
    //кнопка заказать снизу
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_FinishButton__1_cWm']/button")
    private SelenideElement endPageOrderButton;
    //элемент с вопросами
    @FindBy(how = How.CLASS_NAME, using = "Home_FAQ__3uVm4")
    private SelenideElement faqContainer;
    //аккордеон с вопросами
    @FindBy(how = How.CLASS_NAME, using = "accordion")
    private SelenideElement faqAccordion;
    //элементы аккордеона
    @FindBy(how = How.CLASS_NAME, using = "accordion__item")
    private List<SelenideElement> faqAccordionElements;
    //хэдинги аккордеона
    @FindBy(how = How.CLASS_NAME, using = "accordion__heading")
    private List<SelenideElement> faqAccordionHeadings;
    //кнопки аккордеона
    @FindBy(how = How.CLASS_NAME, using = "accordion__button")
    private List<SelenideElement> faqAccordionButtons;
    //содержимое аккордеона
    @FindBy(how = How.CLASS_NAME, using = "accordion__panel")
    private List<SelenideElement> faqAccordionContent;
    //куки
    @FindBy(how = How.CLASS_NAME, using = "App_CookieConsent__1yUIN")
    private SelenideElement cookieContainer;
    //текст куки
    @FindBy(how = How.CLASS_NAME, using = "App_CookieText__1sbqp")
    private SelenideElement cookieText;
    //кнопка куки
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement cookieApplyButton;

    //первый элемент аккордеона
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement scooterCostQuestionButton;
    //подтекст первого элемента аккордеона
    @FindBy(how = How.ID, using = "accordion__panel-0")
    private SelenideElement scooterCostAnswerText;

    //второй элемент аккордеона
    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement fewScootersQuestionButton;
    //подтекст второго элемента аккордеона
    @FindBy(how = How.ID, using = "accordion__panel-1")
    private SelenideElement fewScootersAnswerText;

    //третий элемент аккордеона
    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement leaseTimeQuestionButton;
    //подтекст третьего элемента аккордеона
    @FindBy(how = How.ID, using = "accordion__panel-2")
    private SelenideElement leaseTimeAnswerText;

    //четвертый элемент аккордеона
    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement orderTodayQuestionButton;
    //подтекст четвертого элемента аккордеона
    @FindBy(how = How.ID, using = "accordion__panel-3")
    private SelenideElement orderTodayAnswerText;

    //пятый элемент аккордеона
    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement changeLeaseTimeQuestionButton;
    //подтекст пятого элемента аккордеона
    @FindBy(how = How.ID, using = "accordion__panel-4")
    private SelenideElement changeLeaseTimeAnswerText;

    //шестой элемент аккордеона
    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement scooterChargeQuestionButton;
    //подтекст шестого элемента аккордеона
    @FindBy(how = How.ID, using = "accordion__panel-5")
    private SelenideElement scooterChargeAnswerText;

    //седьмой элемент аккордеона
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement cancelOrderQuestionButton;
    //подтекст седьмого элемента аккордеона
    @FindBy(how = How.ID, using = "accordion__panel-6")
    private SelenideElement cancelOrderAnswerText;

    //восьмой элемент аккордеона
    @FindBy(how = How.ID, using = "accordion__heading-7")
    private SelenideElement mcadQuestionButton;
    //подтекст восьмого элемента аккордеона
    @FindBy(how = How.ID, using = "accordion__panel-7")
    private SelenideElement mcadAnswerText;

    public MainPage applyCookies() {
        if (cookieApplyButton.exists()) cookieApplyButton.click();
        return this;
    }
}
