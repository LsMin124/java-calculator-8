package calculator;

import converter.NumberConverter;
import parser.ExpressionParser;

import java.util.Arrays;

public class StringCalculator {
    private final ExpressionParser parser;
    private final NumberConverter converter;

    public StringCalculator() {
        this.parser = new ExpressionParser();
        this.converter = new NumberConverter();
    }

    public int add(String text) {
        if (isBlank(text)) {
            return 0;
        }

        String[] stringNumbers = parser.parse(text);

        int[] numbers = converter.convert(stringNumbers);

        return sum(numbers);
    }

    private boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }

    private int sum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
