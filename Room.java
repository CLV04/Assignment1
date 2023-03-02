package assignment1;
public class Room {
    private String type;
    private int price;
    private boolean availability;

    public Room(String typeOfRoom) throws IllegalArgumentException {
        if ( typeOfRoom.equals("double")) {
            price = 9000;

        }

        else if ( typeOfRoom.equals("queen")){
            price = 11000;
        }

        else if (typeOfRoom.equals("king")){
            price = 15000;
        }
        else{
            throw new IllegalArgumentException("no room of such type can be created");
        }

        type = typeOfRoom;

        availability = true;
    }
    public Room(Room room){

        price = room.price;

        type = room.type;

        availability = room.availability;

    }


    public String getType(){
        return type;
}
    public int getPrice(){
        return price;
    }
    public void changeAvailability(){
        availability = !availability;
    }

    public static Room findAvailableRoom(Room[] rooms, String roomType){

        Room availableRoom = null;

        for(int i = 0; i < rooms.length; i++){
            if (rooms[i] != null && rooms[i].type.equals(roomType) && rooms[i].availability){
                availableRoom = rooms[i];
                break;
            }
        }
        return availableRoom;
    }

    public static boolean makeRoomAvailable(Room[] rooms, String roomType){
        boolean roomAvailability = false;

        for (int i =0; i< rooms.length; i++){
            if (rooms[i].type.equals(roomType) && !rooms[i].availability){
                rooms[i].changeAvailability();
                roomAvailability = true;
                break;
            }
        }
        return roomAvailability;
    }
}
