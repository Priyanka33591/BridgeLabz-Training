import java.util.*;
public class VotingCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentsAge[] =  new int[10];
        for(int i = 0; i < studentsAge.length;i++){
            studentsAge[i] = scan.nextInt();
            if (studentsAge[i] < 0) {
                System.out.println("Invalid age");
            } else if (studentsAge[i] >= 18) {
                System.out.println("The student with the age " + studentsAge[i] + " can vote");
            } else {
                System.out.println("The student with the age " + studentsAge[i] + " cannot vote");
            }
        }
        scan.close();
    }
}
