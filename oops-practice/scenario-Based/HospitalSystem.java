class AppointmentNotAvailableException extends Exception {}

abstract class Person { String name; }
class Doctor extends Person {}
class Patient extends Person {}

public class HospitalSystem {
    static void book() throws AppointmentNotAvailableException {}
    public static void main(String[] args) {}
}
