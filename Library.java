// Outer class
public class Library {
    private String name;

    // Constructor
    public Library(String name) {
        this.name = name;
        System.out.println("Library: " + name);
    }

    // Inner class
    class Book {
        private String title;

        // Constructor
        public Book(String title) {
            this.title = title;
            System.out.println("Book added: " + title);
        }


        public void showDetails() {
            System.out.println(title + " at " + name);
        }
    }

    public Book addBook(String title) {
        return new Book(title);  // creating inner class object
    }
}

