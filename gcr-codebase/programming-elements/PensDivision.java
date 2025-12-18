public class PensDivision {
    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfStudents = 3;
        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;
         System.out.println("The Pens per student is : " + pensPerStudent + " and the remaining pens not distributed: " + remainingPens);
    }
}
