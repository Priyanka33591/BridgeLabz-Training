class MovieTicket {
    String movieName, seatNumber;
    double price;
    boolean booked = false;

    void bookTicket(String movie, String seat, double price) {
        if(booked) {
            System.out.println("House full!!! sorry..... Ticket already booked");
        } else {
            booked = true;
            movieName = movie;
            seatNumber = seat;
            this.price = price;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    void display() {
        if(!booked)
            System.out.println("Ticket have not booked yet....");
        else {
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    public static void main(String[] args) {
        MovieTicket m=new MovieTicket();
        m.display();

        m.bookTicket("Dragon","A10",120);
        m.bookTicket("Dragon","A10",120);
        m.bookTicket("Dragon","A10",120);

        System.out.println();
        m.display();
    }
}
