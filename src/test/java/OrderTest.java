import org.junit.Assert;
import org.junit.Test;
import pom.MainPage;
import pom.OrderPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.hamcrest.CoreMatchers.containsString;

public class OrderTest {

    private final MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class).applyCookies();

    @Test
    public void testOrder1() {
        mainPage.getHeaderOrderButton().click();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillUserInfo("Артём", "Лолов", "Мосфильмовская", "Сокольники", "88005553535");
        orderPage.fillOrderDetails("22.04.2022", 1, OrderPage.Color.BLACK, "не сломай");
        orderPage.confirmOrder();
        String status = orderPage.getStatusLabel().getText();
        Assert.assertThat(status, containsString("Заказ оформлен"));
    }

    @Test
    public void testOrder2() {
        mainPage.getEndPageOrderButton().scrollTo().click();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillUserInfo("Мурад", "Кидало", "Гагаринский д.3", "Черкизовская", "88007009329");
        orderPage.fillOrderDetails("12.10.2021", 3, OrderPage.Color.GREY, "я тебе нармально сделаю");
        orderPage.confirmOrder();
        String status = page(OrderPage.class).getStatusLabel().getText();
        Assert.assertThat(status, containsString("Заказ оформлен"));
    }

}
