import java.time.LocalTime;

public class BritishTimeFormatter implements TimeFormatter {

    private final NumberToWords numberToWords;

    public BritishTimeFormatter(NumberToWords numberToWords) {
        this.numberToWords = numberToWords;
    }

    @Override
    public String format(LocalTime time) {
        int hour = time.getHour();
        int minute = time.getMinute();

        // Special cases
        if (hour == 0 && minute == 0) return "midnight";
        if (hour == 12 && minute == 0) return "noon";

        int spokenHour = hour % 12 == 0 ? 12 : hour % 12;

        if (minute == 0) {
            return String.format("%s o'clock", numberToWords.convert(spokenHour));
        }
        if (minute == 15) {
            return String.format("quarter past %s", numberToWords.convert(spokenHour));
        }
        if (minute == 30) {
            return String.format("half %s", numberToWords.convert(spokenHour));
        }
        if (minute == 45) {
            int nextHour = spokenHour % 12 + 1;
            return String.format("quarter to %s", numberToWords.convert(nextHour));
        }
        if (minute < 30) {
            return String.format("%s past %s", numberToWords.convert(minute), numberToWords.convert(spokenHour));
        }
        int minsTo = 60 - minute;
        int nextHour = spokenHour % 12 + 1;
        return String.format("%s to %s", numberToWords.convert(minsTo), numberToWords.convert(nextHour));
    }
}

