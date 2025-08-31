public class DatabaseConnection {
    private static DatabaseConnection instance;

    // Private constructor
    private DatabaseConnection() {
        System.out.println("Database connected");
    }

    // Public static synchronized method with lazy initialization
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing: " + query);
    }

    public void close(){
        System.out.println("Connection Closed");
    }
}
