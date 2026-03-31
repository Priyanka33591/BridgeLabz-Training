class CarRental {
    String customerName, carModel;
    int rentalDays;
    double costPerDay=1000;

    CarRental(String c,String m,int d){ customerName=c; carModel=m; rentalDays=d; }
    double totalCost(){ return rentalDays*costPerDay; }
}
