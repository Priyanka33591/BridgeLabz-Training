class Student {
    String name, rollNumber;
    double m1, m2, m3;

    char grade() {
        double avg = (m1+m2+m3)/3;

        if(avg>=80) return 'A';
        else if(avg>=70) return 'B';
        else if(avg>=60) return 'C';
        else return 'D';
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + m1);
        System.out.println("Mark2: " + m2);
        System.out.println("Mark3: " + m3);
        System.out.println("Grade " + grade());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Thamarai"; s1.rollNumber="ECE001"; s1.m1=80; s1.m2=70; s1.m3=75;

        Student s2 = new Student();
        s2.name="Kannan"; s2.rollNumber="CSC002"; s2.m1=60; s2.m2=65; s2.m3=50;

        s1.display(); s2.display();
    }
}
