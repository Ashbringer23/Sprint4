import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.Test;
import pom.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.CoreMatchers.equalTo;

public class MainPageFaqTest {

    private final MainPage page = open("https://qa-scooter.praktikum-services.ru/", MainPage.class).applyCookies();

    @Test
    public void scooterCostQuestionTest() {
        page.getScooterCostQuestionButton().scrollTo().click();
        Assert.assertThat(page.getScooterCostAnswerText().should(Condition.visible).getText(),
                equalTo("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    @Test
    public void fewScootersQuestionTest() {
        page.getFewScootersQuestionButton().scrollTo().click();
        Assert.assertThat(page.getFewScootersAnswerText().should(Condition.visible).getText(),
                equalTo("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    @Test
    public void leaseTimeQuestionTest() {
        page.getLeaseTimeQuestionButton().scrollTo().click();
        Assert.assertThat(page.getLeaseTimeAnswerText().should(Condition.visible).getText(),
                equalTo("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    @Test
    public void orderTodayQuestionTest() {
        page.getOrderTodayQuestionButton().scrollTo().click();
        Assert.assertThat(page.getOrderTodayAnswerText().should(Condition.visible).getText(),
                equalTo("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    @Test
    public void changeLeaseTimeQuestionTest() {
        page.getChangeLeaseTimeQuestionButton().scrollTo().click();
        Assert.assertThat(page.getChangeLeaseTimeAnswerText().should(Condition.visible).getText(),
                equalTo("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    @Test
    public void scooterChargeQuestionTest() {
        page.getScooterChargeQuestionButton().scrollTo().click();
        Assert.assertThat(page.getScooterChargeAnswerText().should(Condition.visible).getText(),
                equalTo("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    @Test
    public void cancelOrderQuestionTest() {
        page.getCancelOrderQuestionButton().scrollTo().click();
        Assert.assertThat(page.getCancelOrderAnswerText().should(Condition.visible).getText(),
                equalTo("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    @Test
    public void mcadQuestionTest() {
        page.getMcadQuestionButton().scrollTo().click();
        Assert.assertThat(page.getMcadAnswerText().should(Condition.visible).getText(),
                equalTo("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }
}
