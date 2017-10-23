package minerva;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Unit test for simple App.
 */
@Features("Проект allure")
@Stories("Задание 1")
public class AppTest {

    @Severity(SeverityLevel.NORMAL)
    @Title("Тест 1")
    @Description("Описание 1")
    @Test
    private void firstMethod() {
        System.out.println("hello");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Title("Тест 2")
    @Description("Описани 2")
    @Test(dependsOnMethods = "firstMethod")
    private void secondMethod() {
        System.out.println("second method");
        Assert.assertTrue(false);
    }
}
