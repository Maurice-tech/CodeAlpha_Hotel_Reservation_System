package hotel_Administration.model.room;


import hotel_Administration.model.room.enums.RoomType;


public interface IRoom {
    public String getRoomNumber();
    public Double getRoomPrice();
    public RoomType getRoomType();
    public boolean isFree();
}
