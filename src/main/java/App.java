import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        get("/", (req, res) -> "Application is up and running");
    }
}
