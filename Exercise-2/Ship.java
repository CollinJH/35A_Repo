public class Ship {

    private boolean floating;
    private int capacity;
    private int length;
    private int width;
    private String name;
    private int height;
    private String departureDate;
    private String arrivalDate;
    private String owner;

    public Ship(int capacity, int length, int width, String name, int height, String departureDate, String arrivalDate, String owner) {
        floating = true;
        this.capacity = capacity;
        this.length = length;
        this.width = width;
        this.name = name;
        this.height = height;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.owner = owner;

    }
    // Getters and Setters

    public boolean isFloating() {
        return floating;
    }

    public void setFloating(boolean floating) {
        this.floating = floating;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
