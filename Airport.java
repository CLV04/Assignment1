package assignment1;
public class Airport {
    private int xCord;
    private int yCord;
    private int airportFees;

    public Airport(int x, int y, int fees){
        xCord = x;
        yCord = y;
        airportFees = fees;
    }

    public int getFees(){
        return airportFees;

    }

    public static int getDistance(Airport a, Airport b){
        double distance = Math.sqrt( Math.pow(a.xCord - b.xCord, 2) + Math.pow(a.yCord - b.yCord,2));
        int distanceInt = 0;

        if (distance == (int) distance){
            distanceInt = (int) distance;
        }

        else{
            distanceInt = (int) distance + 1;
        }

        return distanceInt;
    }
}



