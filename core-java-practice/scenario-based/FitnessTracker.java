// Program: Sandeep’s Fitness Challenge Tracker
// Features: Stores push-ups for a week, uses for-each, continues on rest day, calculates total & average

import java.util.*;

public class FitnessTracker {
    public static void main(String[] args) {
        int[] pushUps = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter push-ups for 7 days (enter 0 for rest day):");

        for(int i=0;i<7;i++){
            pushUps[i] = sc.nextInt();
        }

        int total = 0;
        int count = 0;

        for(int p : pushUps){
            if(p == 0) continue;  // Skip rest
            total += p;
            count++;
        }

        double avg = count>0 ? (double)total/count : 0;

        System.out.println("Total Push-ups (excluding rest): " + total);
        System.out.println("Average per workout day: " + avg);
        sc.close();
    }
}
