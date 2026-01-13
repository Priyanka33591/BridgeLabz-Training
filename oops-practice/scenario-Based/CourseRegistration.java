class CourseLimitExceededException extends Exception {}

class Person { String name; }

class Student extends Person {
    int courses = 0;
    void enroll() throws CourseLimitExceededException {
        if (courses >= 5) throw new CourseLimitExceededException();
        courses++;
    }
}

public class CourseRegistration {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.enroll();
        System.out.println("Enrolled");
    }
}
