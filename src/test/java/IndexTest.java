import org.junit.Test;
import static org.junit.Assert.*;

public class IndexTest {
    @Test public void testAppHasAGreeting() {
        Index classUnderTest = new Index();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
