// Program: Rohan's Library Reminder
// Features: Fine calculator, 5 books using loop, ₹5/day late

import java.util.*;

public class LibraryReminder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.print("\nEnter due date (in days): ");
            int due = sc.nextInt();

            System.out.print("Enter return date (in days): ");
            int ret = sc.nextInt();

            if(ret > due){
                int fine = (ret - due) * 5;
                System.out.println("Late! Fine = ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine!");
            }
        }
        sc.close();
    }
}
