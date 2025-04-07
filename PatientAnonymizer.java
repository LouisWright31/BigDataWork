import java.util.regex.*;

public class PatientAnonymizer {
    // Replace patient info with placeholder text
    public static String anonymizeNotes(String input) {
        // Anonymize names, birthdates, and addresses
        input = input.replaceAll("[A-Z][a-z]+ [A-Z][a-z]+", "1.1"); // Name example
        input = input.replaceAll("\\d{2}-\\d{2}-\\d{4}", "1.2"); // Date of birth example
        input = input.replaceAll("\\d+ Regex Lane, [A-Za-z]+, [A-Za-z]+", "1.3"); // Address example
        input = input.replaceAll("[A-Z][a-z]+ Max", "1.4"); // Name-based reference
        
        return input;
    }
    
    public static void main(String[] args) {
        String medicalNote = "During the consultation, Mr. Alex Max, (DOB: 11-03-1965) a gentleman residing at 55 Regex Lane, Liverpool, UK, presented with mild chest pain and occasional shortness of breath during exertion. He has a history of hypertension managed with amlodipine (5mg) daily since 2008.";
        
        String anonymizedNote = anonymizeNotes(medicalNote);
        System.out.println("Anonymised Medical Notes: \n" + anonymizedNote);
    }
}
