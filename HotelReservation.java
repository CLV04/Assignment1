package assignment1;
public class HotelReservation extends Reservation {
    private Hotel hotel;
    private String typeOfRoom;
    private int numberOfNights;
    private int priceForNight;

    public HotelReservation(String nameOnReservation, Hotel hotelName, String roomType, int nights) {
        super(nameOnReservation);
        hotel = hotelName;
        typeOfRoom = roomType;
        numberOfNights = nights;
        Room room = new Room(typeOfRoom);
        priceForNight = room.getPrice();
        hotel.reserveRoom(typeOfRoom);
    }

    public int getNumOfNights() {
        return numberOfNights;
    }
    public int getCost(){
        int price = numberOfNights * priceForNight;
        return price;
    }

    public boolean equals(Object obj){
        boolean equality = false;

        if (obj.getClass() == getClass() && (((HotelReservation)obj).reservationName()).equals(reservationName()) &&
                ((HotelReservation)obj).hotel == hotel && (((HotelReservation)obj).typeOfRoom).equals(typeOfRoom) &&
                ((HotelReservation)obj).numberOfNights == numberOfNights && ((HotelReservation)obj).getCost() == getCost()){
            equality = true;
        }
        return equality;
    }
}
