public class Car {
    private final String brand;
    private final String model;
    private final int year;

    // Private constructor
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
    }

    // Getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    // toString method
    @Override
    public String toString() {
        return "Car :: brand='" + brand + "', model='" + model + "', year=" + year + "}";
    }

    // Static nested Builder class
    public static class Builder {
        private String brand;
        private String model;
        private int year;

        // Builder methods (return this for chaining)
        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        // Build method with validation
        public Car build() {
            if (brand == null || brand.trim().isEmpty()) {
                throw new IllegalArgumentException("Brand cannot be null or empty");
            }
            if (year <= 1900) {
                throw new IllegalArgumentException("Year must be > 1900");
            }
            return new Car(this);
        }
    }
}