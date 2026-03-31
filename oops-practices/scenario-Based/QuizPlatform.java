class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String msg) {
        super(msg);
    }
}

class QuizProcessor {

    static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Answer length mismatch");
        }

        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }
        return score;
    }

    static String getGrade(int score, int total) {
        double percent = (score * 100.0) / total;

        if (percent >= 80) return "A";
        if (percent >= 60) return "B";
        if (percent >= 40) return "C";
        return "Fail";
    }
}
