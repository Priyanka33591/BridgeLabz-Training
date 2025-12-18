public class AveragePercentOfMarks {
    public static void main(String[] args) {
        int Maths = 94;
        int Physics = 95;
        int Chemistry = 96;
        int totalMarks = Maths + Physics + Chemistry;
        double averageMarks = (totalMarks / 3.0) * 100;
        System.out.println("Sam's average marks in PCM is : " + averageMarks);
    }
}
