package com.techelevator.rooms;

import com.techelevator.Player;
import com.techelevator.menu.MenuDisplay;

public class BlackRoom {

    private static final String INTRO = "Welcome to the black room! There is another door but it is locked.";

    private static final String OPTION_OPEN = "Open the door with the master key";
    private static final String OPTION_PINK_ROOM = "Go to the pink room to get the master key.";
    private static final String OPTION_LOBBY = "Go back to the lobby";
    private static final String[] OPTIONS = {OPTION_OPEN, OPTION_PINK_ROOM, OPTION_LOBBY};

    private final String pinkRoom;

    private final String unlockDoor;



    public BlackRoom(String pinkRoom, String unlockDoor) {
        this.pinkRoom = pinkRoom;
        this.unlockDoor = unlockDoor;
    }




    public void onEnterRoom(Player player) {

        while (true) {

            System.out.println(INTRO);

            String selectedOption = MenuDisplay.prompt(OPTIONS);
            if(selectedOption.equals(OPTION_OPEN)){
                unlockDoor(player);
            }else if(selectedOption.equals(OPTION_PINK_ROOM)){
                pinkRoom(player);
            }else if(selectedOption.equals(OPTION_LOBBY)){
                System.out.println("You leave the room");
                break;
            }




        }
    }

    private void unlockDoor(Player player) {
        System.out.println(" Congratulations! You earned one coin");
    }

    private void pinkRoom(Player player) {
        System.out.println(" Find the master key");
    }


}
