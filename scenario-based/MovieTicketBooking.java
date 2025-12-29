// Program: Movie Ticket Booking App
// Features: Switch + If, multiple customers, clean variable names, pricing logic

import java.util.*;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nEnter Movie Type: 1.Action  2.Romantic  3.Comedy");
            int movieType = sc.nextInt();

            System.out.print("Seat Type (gold/silver): ");
            String seat = sc.next().toLowerCase();

            System.out.print("Snacks required? (yes/no): ");
            String snacks = sc.next().toLowerCase();

            int price = 0;

            switch(movieType){
                case 1 -> price = 200;
                case 2 -> price = 180;
                case 3 -> price = 150;
                default -> System.out.println("Invalid Movie Type!");
            }

            if(seat.equals("gold")) price += 80;
            else if(seat.equals("silver")) price += 40;

            if(snacks.equals("yes")) price += 100;

            System.out.println("Total Ticket Price: ₹" + price);

            System.out.print("More customers? (y/n): ");
            if(sc.next().equalsIgnoreCase("n")) break;
        }
        sc.close();
    }
}
