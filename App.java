import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8080); // Required by Azure App Service

        post("/anonymize", (req, res) -> {
            String notes = req.body();
            return Anonymizer.anonymize(notes);
        });

        get("/", (req, res) -> "Medical Notes Anonymizer is running...");
    }
}

