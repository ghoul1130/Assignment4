public class Main {
    public static void main(String[] args) {
        //===INNER CLASS===
        System.out.println("===INNER CLASS===");
        Library library = new Library("City Library");

        // Create Book from outside Library
        Library.Book book1 = library.new Book("Java Guide");
        book1.showDetails();
        // Create Book from inside Library
        Library.Book book2 = library.addBook("Data Structures");
        book2.showDetails();

        //===ENUMS CLASS===
        System.out.println("===ENUM CLASS===");
        // Create a Day variable
        Day today = Day.THURSDAY;

        // Use switch statement to print day name
        switch (today) {
            case MONDAY:
                System.out.println("Today is: MONDAY");
                break;
            case TUESDAY:
                System.out.println("Today is: TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("Today is: WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("Today is: THURSDAY");
                break;
            case FRIDAY:
                System.out.println("Today is: FRIDAY");
                break;
            default: System.out.println("Today is: Saturday or Sunday");
        }

        // Loop through all days and print their numbers
        for (Day d : Day.values()) {
            System.out.println("Day: " + d + ", Number: " + d.getDayNumber());
        }

        System.out.println(today.isHoliday());

        //===OBSERVER PATTERN (WEATHER STATION)===
        System.out.println("===OBSERVER PATTERN (WEATHER STATION)===");

        WeatherStation station = new WeatherStation();
        // Create observers
        PhoneDisplay phone = new PhoneDisplay();
        TVDisplay tv = new TVDisplay();
        // Add observers
        station.addObserver(phone);
        station.addObserver(tv);
        // Update temperature
        station.setTemperature(25);
        station.setTemperature(30);

        //===BUILDER PATTERN (CAR)===
        System.out.println("===BUILDER PATTERN (CAR)===");

        try {
            // Valid car using method chaining
            Car car1 = new Car.Builder()
                    .brand("Toyota")
                    .model("Camry")
                    .year(2023)
                    .build(); // method chaining
            System.out.println(car1);

            // Invalid car (brand missing)
            Car car2 = new Car.Builder()
                    .model("Civic")
                    .year(2020)
                    .build();
            System.out.println(car2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //===SINGLETON PATTERN (DB)===
        System.out.println("===BUILDER PATTERN (DB)===");

        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();

        // Compare references
        System.out.println("Same instance: " + (conn1 == conn2));

        // Execute query using one instance
        conn1.executeQuery("SELECT * FROM users");
        //Close Connection
        conn1.close();

        //===POLYMORPHSIM AND INHERITENCE===
        System.out.println("===POLYMORPHSIM AND INHERITENCE===");

        Animal bird = new Bird("Parrot", 2);
        Animal fish = new Fish("Goldfish", 1);
        Animal duck = new Duck("Donald", 3);
        Animal cat = new Cat("Whiskers", 4);

        Animal[] animals = {bird, fish, duck, cat};

        ZooKeeper zooKeeper = new ZooKeeper();

        System.out.println("Feeding all animals:");
        zooKeeper.feedAllAnimals(animals);

        System.out.println("\nMaking each animal sound:");
        zooKeeper.makeAnimalSound(animals);

        System.out.println("\nTotal animals created: " + Animal.getAnimalCount());
    }
}
---OUTPUT---
===INNER CLASS===
Library: City Library
Book added: Java Guide
Java Guide at City Library
Book added: Data Structures
Data Structures at City Library
===ENUM CLASS===
Today is: THURSDAY
Day: MONDAY, Number: 1
Day: TUESDAY, Number: 2
Day: WEDNESDAY, Number: 3
Day: THURSDAY, Number: 4
Day: FRIDAY, Number: 5
false
===OBSERVER PATTERN (WEATHER STATION)===
Temperature changed to 25
Phone shows: 25°C
TV shows: 25°C
Temperature changed to 30
Phone shows: 30°C
TV shows: 30°C
===BUILDER PATTERN (CAR)===
Car :: brand='Toyota', model='Camry', year=2023}
Error: Brand cannot be null or empty
===BUILDER PATTERN (DB)===
Database connected
Same instance: true
Executing: SELECT * FROM users
Connection Closed
===POLYMORPHSIM AND INHERITENCE===
Feeding all animals:
Parrot is eating.
Goldfish is eating.
Donald is eating.
Whiskers is eating.

Making each animal sound:
Parrot chirps!
Goldfish makes bubbly sounds.
Donald quacks!
Whiskers meows!

Total animals created: 4
