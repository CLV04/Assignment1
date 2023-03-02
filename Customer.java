package assignment1;
public class Customer {
    private String name;
    private int balance;
    private Basket basket;

    public Customer(String customerName, int initialBalance){
        name = customerName;
        balance = initialBalance;
        basket = new Basket();
    }
    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }
    public Basket getBasket(){
        return basket;
    }

    public int addFunds(int amountToAdd) throws IllegalArgumentException{
        if (amountToAdd < 0){
            throw new IllegalArgumentException("A negative amount of money cannot be added to balance");
        }
        balance += amountToAdd;
        return balance;
    }


    public int addToBasket(Reservation reservationInput) throws IllegalArgumentException{
        int numberOfReservations;
        if(reservationInput.reservationName().equals(name)){
            numberOfReservations =  basket.add(reservationInput);

            return numberOfReservations;
        }
        else {
            throw new IllegalArgumentException("Current customer name must match name on reservation");
        }


    }

    public int addToBasket(Hotel hotel, String roomType, int nights, boolean breakfast){
        Reservation reservation;
        if (breakfast == false){
            reservation = new HotelReservation(name, hotel, roomType, nights);
        }
        else{
            reservation = new BnBReservation(name, hotel, roomType, nights);
        }
        basket.add(reservation);

        return basket.getNumOfReservations();
    }

    public int addToBasket(Airport arrival, Airport departure){
        Reservation reservation = new FlightReservation(name, arrival, departure);

        return basket.add(reservation);
    }

    public boolean removeFromBasket(Reservation reservation){
       return basket.remove(reservation);
    }

    public int checkOut(){
        if (balance < basket.getTotalCost()){
            throw new IllegalStateException("Balance is too low");
        }
        else{
            balance = balance - basket.getTotalCost();
            basket.clear();

            return balance;
        }
    }
}
