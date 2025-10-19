package parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 구분자 기준으로 숫자 문자열 배열 생성

public class ExpressionParser {
    private static final String DEFAULT_DELIMITERS = "[,:]";
    private static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile("//(.)\\\\n(.*)");

    public String[] parse(String text) {
        Matcher matcher = CUSTOM_DELIMITER_PATTERN.matcher(text);
        if (matcher.find()) {
            return parseWithCustomDelimiter(matcher);
        }
        return parseWithDefaultDelimiter(text);

    }

    private String[] parseWithCustomDelimiter(Matcher matcher) {
        String customDelimiter = matcher.group(1);
        String numbersText = matcher.group(2);
        return numbersText.split(Pattern.quote(customDelimiter));
    }

    private String[] parseWithDefaultDelimiter(String text) {
        return text.split(DEFAULT_DELIMITERS);
    }
}
