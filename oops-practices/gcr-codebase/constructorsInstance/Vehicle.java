class Vehicle {
    String ownerName, vehicleType;
    static double registrationFee=500;

    Vehicle(String o,String v){ ownerName=o; vehicleType=v; }

    void displayVehicleDetails(){
        System.out.println(ownerName+" "+vehicleType+" Fee:"+registrationFee);
    }

    static void updateRegistrationFee(double fee){
        registrationFee=fee;
    }
}
