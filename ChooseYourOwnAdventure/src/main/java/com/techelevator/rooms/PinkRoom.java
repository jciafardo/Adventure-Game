package com.techelevator.rooms;

import com.techelevator.Player;
import com.techelevator.menu.MenuDisplay;

public class PinkRoom {


    private static final String INTRO = "Welcome to the pink room! There are three options to choose from.";

    private static final String OPTION_1 = "Drink the potion";
    private static final String OPTION_2 = "Restore Health";
    private static final String OPTION_3 = "Leave room";
    private static final String[] OPTIONS = {OPTION_1, OPTION_2, OPTION_3};
    
    
    private final String drinkPotion;

    public PinkRoom(String drinkPotion, String restoreHealth) {
        this.drinkPotion = drinkPotion;
        this.restoreHealth = restoreHealth;
    }
    
    private final String restoreHealth;


    public void onEnterRoom(Player player) {

        while(true) {

            System.out.println(INTRO);

            String selectedOption = MenuDisplay.prompt(OPTIONS);
            if(selectedOption.equals(OPTION_1)){
                drinkPotion(player);
            }else if(selectedOption.equals(OPTION_2)){
                restoreHealth(player);
            }else if(selectedOption.equals(OPTION_3)){
                System.out.println("You leave the room");
                break;
            }




        }





    }

    private void restoreHealth(Player player) {
    }

    private void drinkPotion(Player player) {
    }


}
