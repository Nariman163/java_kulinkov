import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class TestFirst extends TestBase {

    @Test
    public void setSome() {
        openGroupsPage();
        driver.findElement(By.linkText("print phones")).click();
        try {
            Thread.sleep(20_000);
        } catch (InterruptedException e) {

        }

    }
}
