package assignment1;
public class Basket {
    private Reservation[] reservations;
    public Basket(){
        reservations = new Reservation[10];
    }

    public Reservation[] getProducts(){

        Reservation[] reservationsCopy = new Reservation[reservations.length];

        for (int i = 0; i < reservations.length; i++){
            reservationsCopy[i] = reservations[i];
        }
        return reservationsCopy;
    }

    public int add(Reservation reservationInput){
        int reservationNumber = 0;

        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
                reservations[i] = reservationInput;
                break;
            } else if (i == reservations.length - -1) {
                Reservation[] bigger = new Reservation[reservations.length * 2];

                for (int k = 0; k < reservations.length; k++) {
                    bigger[k] = reservations[k];
                    bigger[reservations.length] = reservationInput;
                    reservations = bigger;
                }
            }
        }
        for (int j = 0; j < reservations.length; ++j){
                if (reservations[j] != null){
                    reservationNumber += 1;
                }
        }

        return reservationNumber;
    }

    public boolean remove(Reservation reservationInput){
        boolean removal = false;
        for (int i = 0; i < reservations.length; i++){
            if (reservations [i] != null && reservations[i].equals(reservationInput)){
                reservations[i] = null;

                for (int k = i+1; k < reservations.length; k++){
                    reservations[k-1] = reservations[k];
                }
                removal = true;
                break;
            }
        }
        return removal;
    }
    public void clear() {
        reservations = new Reservation[10];
    }
    public int getNumOfReservations(){
        int NumOfReservations = 0;
        for (int i = 0; i < reservations.length; i++){
            if (reservations[i]!=null) {
                NumOfReservations += 1;
            }
        }

        return NumOfReservations;
    }
    public int getTotalCost(){
        int totalCost = 0;
        for(int i = 0; i < reservations.length; i++){
            if (reservations[i] == null){
                break;
            }
            else {
                totalCost += reservations[i].getCost();
            }
        }

        return totalCost;
    }

}
