package model;

import enums.RoomType;
import interfaces.IRoom;

public class Room implements IRoom {
    private String roomNumber;
    private Double price;
    private RoomType enumeration;


    @Override
    public String setRoomNumber() {
        return null;
    }

    @Override
    public Double setRoomPrice() {
        return null;
    }

    @Override
    public RoomType setRoomType() {
        return null;
    }

    @Override
    public String etRoomNumber() {
        return null;
    }

    @Override
    public Double getRoomPrice() {
        return null;
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }

    @Override
    public boolean isFree() {
        return false;
    }
}
