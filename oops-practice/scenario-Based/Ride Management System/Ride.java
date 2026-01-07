class Ride {
    User user;
    Driver driver;
    double fare;

    Ride(User user, Driver driver, double fare) {
        this.user = user;
        this.driver = driver;
        this.fare = fare;
    }

    void showRide() {
        System.out.println("User: " + user.name);
        System.out.println("Driver: " + driver.name);
        System.out.println("Fare: ₹" + fare);
    }
}
