package stringaddcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static final String CUSTOM_DELIMITER_REGEX = "//(.)\n(.*)";
    static String delimiter = ",:";

    public static int splitAndSum(String text) {
        if (isNotValidate(text)) {
            return 0;
        }

        extractDelimiter(text);
        text = sanitzeText(text);

        String[] tokens = text.split("[" + delimiter + "]");
        validateTokens(tokens);
        return sum(tokens);
    }

    private static void extractDelimiter(String text) {
        Matcher m = Pattern.compile(CUSTOM_DELIMITER_REGEX).matcher(text);
        if (m.find()) {
            delimiter += m.group(1);
        }
    }

    private static String sanitzeText(String text) {
        Matcher m = Pattern.compile(CUSTOM_DELIMITER_REGEX).matcher(text);
        if (m.find()) {
            return m.group(2);
        }
        return text;
    }

    private static void validateTokens(String[] tokens) {
        for (String token : tokens) {
            catchNegativeNum(Integer.parseInt(token));
        }
    }

    private static int sum(String[] tokens) {
        int result = 0;
        for (String token : tokens) {
            result += Integer.parseInt(token);
        }
        return result;
    }

    private static void catchNegativeNum(int number) {
        if (number < 0) {
            throw new RuntimeException();
        }
    }

    public static boolean isNotValidate(String text) {
        return text == null || text.isEmpty();
    }
}
