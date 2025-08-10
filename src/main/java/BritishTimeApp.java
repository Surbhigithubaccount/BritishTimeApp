import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class BritishTimeApp {

    public static void main(String[] args) {
        System.out.println("Enter times in HH:MM. Empty line to exit.");

        TimeParser parser = new TimeParser();
        TimeFormatter formatter = new BritishTimeFormatter(new NumberToWords());

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while ((input = reader.readLine()) != null) {
                input = input.trim();
                if (input.isEmpty()) break;

                try {
                    LocalTime time = parser.parse(input);
                    String spoken = formatter.format(time);
                    System.out.printf("%s ==> %s%n", input, spoken);
                } catch (IllegalArgumentException e) {
                    System.err.println("Invalid time: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}
