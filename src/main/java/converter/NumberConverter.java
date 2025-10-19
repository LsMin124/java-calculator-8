package converter;

import java.util.Arrays;

public class NumberConverter {

    public int[] convert(String[] stringNumbers) {
        return Arrays.stream(stringNumbers)
                .mapToInt(this::parseAndValidate)
                .toArray();
    }

    private int parseAndValidate(String stringNumber) {
        int number = parseToInt(stringNumber);
        validateNegative(number);
        return number;
    }

    private int parseToInt(String stringNumber) {
        try {
            return Integer.parseInt(stringNumber.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("입력 형식이 잘못되었습니다: ", e);
        }
    }

    private void validateNegative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("입력값에 음수가 포함되어 있습니다.");
        }
    }
}
