package constants;

public final class RegexExpression {

    public RegexExpression() {
    }
    public static final String EMAIL_PATTERN = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String IPV4_PATTERN = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
    public static final String MASTER_CARD_NUMBER_PATTERN = "^4[0-9]{12}(?:[0-9]{3})?$";
    public static final String BUILD_NUMBER = "^(\\d+)";
    public static final String STREET_NAME = "(\\b[A-Z]\\w*\\b)\\s(Drive|Road|Line|Street)";
    public static final String SUITE_NUMBER = "(Apartment|Suite|Office)\\s\\d{1,4}";
    public static final String TOWN_NAME = "\\n\\b[A-Z]\\w+";
    public static final String POST_INDEX = "\\b[A-Z]{1,2}\\s\\d+";
    public static final String COUNTRY_NAME = "\\b[A-Z]{2,3}$";
}
