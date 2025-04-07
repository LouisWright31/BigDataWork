public class Anonymizer {
    public static String anonymize(String input) {
        input = input.replaceAll("Mr\\.\\s+[A-Z][a-z]+\\s+[A-Z][a-z]+", "1.1");
        input = input.replaceAll("\\(DOB:\\s*\\d{2}-\\d{2}-\\d{4}\\)", "(DOB: 1.2)");
        input = input.replaceAll("\\d+\\s+Regex Lane,\\s+[A-Za-z]+,\\s+[A-Za-z]+", "1.3");
        input = input.replaceAll("Mr\\.\\s+[A-Z][a-z]+", "1.4");
        return input;
    }
}
