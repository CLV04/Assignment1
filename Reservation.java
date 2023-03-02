package assignment1;
public abstract class Reservation {
    private String name;

    public Reservation(String clientName) {
        name = clientName;
    }

    public final String reservationName(){

        return name;
    }

    public abstract int getCost();

    public abstract boolean equals(Object obj);

}
