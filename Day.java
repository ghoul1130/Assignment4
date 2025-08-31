public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5);

    private int dayNumber;   // private field

    // Constructor
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    // Method to return day number
    public int getDayNumber() {
        return dayNumber;
    }

    // Method that always returns false
    public boolean isHoliday() {
        return false;
    }
}
