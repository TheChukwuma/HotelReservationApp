package model;

import enums.RoomPackage;

public class Main {
    public static void main(String[] args) {
        Room room = new Room();

        room.setRoomNumber(101);

        room.setRoomPackage(RoomPackage.PAID);

        System.out.println(room.getRoomPackage());
    }
}
