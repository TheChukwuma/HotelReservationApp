package interfaces;

import enums.RoomType;

public interface IRoom {
    public String setRoomNumber();
    public Double setRoomPrice();
    public RoomType setRoomType();
    public String etRoomNumber();
    public Double getRoomPrice();
    public RoomType getRoomType();
    public boolean isFree();

}
