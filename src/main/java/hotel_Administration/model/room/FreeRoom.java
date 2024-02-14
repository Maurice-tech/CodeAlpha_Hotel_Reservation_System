package hotel_Administration.model.room;


import hotel_Administration.model.room.enums.RoomType;


public class FreeRoom extends Room {

    public FreeRoom(final String roomNumber, final RoomType enumeration) {
        super(roomNumber, 0.0, enumeration);
    }

    @Override
    public String toString() {
        return "FreeRoom => " + super.toString();
    }

}
