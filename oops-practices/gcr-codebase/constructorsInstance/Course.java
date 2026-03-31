class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName="ABC Institute";

    Course(String n,int d,double f){
        courseName=n; duration=d; fee=f;
    }

    void displayCourseDetails(){
        System.out.println(courseName+" "+duration+" "+fee+" "+instituteName);
    }

    static void updateInstituteName(String name){
        instituteName=name;
    }
}
