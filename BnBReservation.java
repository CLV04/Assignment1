package assignment1;
public class BnBReservation extends HotelReservation{
    public BnBReservation(String reservationName, Hotel hotel, String roomType, int nights){
        super(reservationName, hotel, roomType, nights);
    }

    public int getCost(){
        int cost = super.getCost() + 1000 * getNumOfNights();

        return cost;
    }
}
