package de.alextom.mcdart.RoomManager;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RoomManager {
    private final Map<Player, Room> roomList = new HashMap<>();

    public void createRoom(Player player){
        if(havePlayerARoom(player)){
            return;
        }
        Room room = new Room() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
        roomList.put(player, room);
        room.start();
    }

    public void deleteRoom(Player player){
        if(havePlayerARoom(player)){
            Objects.requireNonNull(getPlayerRoom(player)).stop();
        }
    }

    private boolean havePlayerARoom(Player player){
        for(Player players : roomList.keySet()){
            if(players == player){
                return true;
            }
        }
        return false;
    }

    private Room getPlayerRoom(Player player){
        if(havePlayerARoom(player)){
            return roomList.get(player);
        }
        return null;
    }
}
