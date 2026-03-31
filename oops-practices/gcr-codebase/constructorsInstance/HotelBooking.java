class HotelBooking {
    String guestName, roomType;
    int nights;

    HotelBooking(){ guestName="Not Assigned"; roomType="Standard"; nights=1; }
    HotelBooking(String g,String r,int n){ guestName=g; roomType=r; nights=n; }
    HotelBooking(HotelBooking h){ guestName=h.guestName; roomType=h.roomType; nights=h.nights; }
}
