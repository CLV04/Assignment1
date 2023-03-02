package assignment1;

public class Main {
    public static void main(String[] args) {


        Customer customer = new Customer("bob", 100);
        Room[] rooms = {new Room("double")};
        Hotel hotel = new Hotel("barcelo", rooms);
        HotelReservation reservation = new HotelReservation("bob", hotel, "double", 2);
        customer.addToBasket(reservation);



    }
}
