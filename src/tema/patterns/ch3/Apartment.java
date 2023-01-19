package tema.patterns.ch3;

public class Apartment {
    private String location;
    private int monthlyRentCost;
    private boolean isRented;

    public Apartment(String location, int monthlyRentCost) {

        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
        this.isRented = false;
}

    public String getLocation() {
        return location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';

    }

}
