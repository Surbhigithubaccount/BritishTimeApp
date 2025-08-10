
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class BritishTimeFormatterTest {

    private final NumberToWords ntw = new NumberToWords();
    private final TimeFormatter formatter = new BritishTimeFormatter(ntw);

    @Test
    void testNoonAndMidnight() {
        assertEquals("noon", formatter.format(LocalTime.of(12, 0)));
        assertEquals("midnight", formatter.format(LocalTime.of(0, 0)));
    }

    @Test
    void testHalfPast() {
        assertEquals("half ten", formatter.format(LocalTime.of(10, 30)));
    }

    @Test
    void testQuarterPastAndTo() {
        assertEquals("quarter past three", formatter.format(LocalTime.of(3, 15)));
        assertEquals("quarter to five", formatter.format(LocalTime.of(4, 45)));
    }

    @Test
    void testPastMinutes() {
        assertEquals("five past two", formatter.format(LocalTime.of(2, 5)));
    }

    @Test
    void testToMinutes() {
        assertEquals("twenty to seven", formatter.format(LocalTime.of(6, 40)));
    }
}
