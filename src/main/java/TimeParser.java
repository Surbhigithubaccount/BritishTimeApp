

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeParser {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("H:mm");

    public LocalTime parse(String input) {
        try {
            return LocalTime.parse(input, FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Time must be in HH:MM 24-hour format.");
        }
    }
}
