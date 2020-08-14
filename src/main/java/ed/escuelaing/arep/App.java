package ed.escuelaing.arep;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        port (getPort());
        get("/hello", (req, res) -> "Hello Heroku!!");
    }

    public static int getPort() {
        if (System.getenv("PORT") != null)
        {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
