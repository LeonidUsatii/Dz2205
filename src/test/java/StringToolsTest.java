import group25.StringTools;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToolsTest {
    @Test
    public void firstToUpperCase_FirstToUpperCaseReturned() {
        assertEquals("Apple", StringTools.FirstToUpperCase("apple"));
    }
    @Test
    public void isStartingFromCapital_isStartingFromCapitalReturned() {
        assertEquals(true, StringTools.isStartingFromCapital("Apple"));
    }

}
