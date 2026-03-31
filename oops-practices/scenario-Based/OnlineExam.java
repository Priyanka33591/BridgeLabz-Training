class ExamTimeExpiredException extends Exception {}

interface EvaluationStrategy {
    int evaluate();
}

class ObjectiveEval implements EvaluationStrategy {
    public int evaluate() { return 80; }
}

public class OnlineExam {
    public static void main(String[] args) {
        EvaluationStrategy e = new ObjectiveEval();
        System.out.println(e.evaluate());
    }
}
