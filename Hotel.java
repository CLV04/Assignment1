package assignment1;
public class Hotel {
    private String hotel;

    private Room[] rooms;

    public Hotel(String hotelName, Room[] roomArray){

        hotel = hotelName;

        Room [] roomArrayCopy = new Room[roomArray.length];

        for(int i =0; i < roomArray.length; i++){
            roomArrayCopy[i] = new Room(roomArray[i].getType());
        }

        rooms = roomArrayCopy;

    }

    public int reserveRoom(String typeOfRoom) throws IllegalArgumentException{
        Room possibleRoom = Room.findAvailableRoom(rooms, typeOfRoom);

        if (possibleRoom == null){
            throw new IllegalArgumentException();
        }
        else {
            possibleRoom.changeAvailability();
            return possibleRoom.getPrice();
        }
    }

    public boolean cancelRoom(String typeOfRoom){

        boolean roomAvailable = Room.makeRoomAvailable(rooms, typeOfRoom);

        return roomAvailable;
        }


    }

