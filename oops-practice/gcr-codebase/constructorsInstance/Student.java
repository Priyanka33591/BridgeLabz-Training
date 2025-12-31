class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double c){ CGPA=c; }
    public double getCGPA(){ return CGPA; }
}

class PostgraduateStudent extends Student {
    void show(){ System.out.println(rollNumber+" "+name); }
}
