import java.util.*;

public class BusRouteTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalDistance = 0;
        double distancePerStop;

        while (true) {
            System.out.print("Enter distance covered to next stop (km): ");
            distancePerStop = sc.nextDouble();
            totalDistance += distancePerStop;

            System.out.print("Do you want to get off the bus? (yes/no): ");
            String choice = sc.next().toLowerCase();

            if(choice.equals("yes")) {
                System.out.println("You got off the bus!");
                break;
            }
        }

        System.out.println("Total distance travelled: " + totalDistance + " km");
        sc.close();
    }
}
