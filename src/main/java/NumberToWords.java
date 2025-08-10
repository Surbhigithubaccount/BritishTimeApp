
public class NumberToWords {

    private static final String[] SMALL = {
            "zero","one","two","three","four","five","six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
    };
    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty"
    };

    public String convert(int n) {
        if (n < 0 || n > 59) throw new IllegalArgumentException("Out of range: " + n);
        if (n < 20) return SMALL[n];
        int tens = n / 10;
        int ones = n % 10;
        return ones == 0 ? TENS[tens] : TENS[tens] + "-" + SMALL[ones];
    }
}
