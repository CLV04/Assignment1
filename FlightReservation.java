package assignment1;
public class FlightReservation extends Reservation {
    private Airport departureAirport;
    private Airport arrivalAirport;

    public FlightReservation(String name, Airport departure, Airport arrival){
        super(name);
        if (departure == arrival){
            throw new IllegalArgumentException("Departure and arrival airports cannot be the same");
        }
        departureAirport = departure;
        arrivalAirport = arrival;
    }

    public int getCost() {
        double totalDistance = (double) Airport.getDistance(departureAirport, arrivalAirport);

        double totalGalons = totalDistance/(167.52);

        double fuelCost = totalGalons * 124;

        double totalCost = fuelCost + departureAirport.getFees() + arrivalAirport.getFees() + 5375;

        int totalCostInt = 0;

        if (totalCost != (int)totalCost){
            totalCostInt = (int) (totalCost + 1 );
        }
        else{
            totalCostInt = (int) totalCost;
        }

        return totalCostInt;

    }

    public boolean equals(Object obj){
        boolean equality = false;

        if (obj.getClass() == getClass() && (((FlightReservation)obj).reservationName()).equals(reservationName())  &&
                ((FlightReservation)obj).arrivalAirport == arrivalAirport && ((FlightReservation)obj).departureAirport == departureAirport){
            equality = true;
        }
        return equality;
    }
}
