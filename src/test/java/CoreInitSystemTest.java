import org.example.InitClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoreInitSystemTest {

InitClass initClass = new InitClass();
    @Test
    public void testMyApp() {
        Assertions.assertEquals("bootcamp", initClass.whoAmI());
    }
}
