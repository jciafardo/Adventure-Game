package com.techelevator.rooms;

import com.techelevator.Robot;
import com.techelevator.menu.MenuDisplay;
import com.techelevator.Player;

public class GreenRoom {

    private static final String INTRO = "Welcome to the green room! There is a robot powered by ChatGPT and it wants to fight you. What do you do?";

    private static final String OPTION_FIGHT = "Fight the robot";
    private static final String OPTION_LEAVE = "Leave room";
    private static final String[] OPTIONS = {OPTION_FIGHT, OPTION_LEAVE};

    public void onEnterRoom(Player player, Robot robot) {
        while(player.getHealth() > 0 && robot.getHealth() > 0) {
            System.out.println(INTRO);

            String selectedOption = MenuDisplay.prompt(OPTIONS);
            if (selectedOption.equals(OPTION_FIGHT)) {

                robot.fightRobot(player, robot);
            } else if (selectedOption.equals(OPTION_LEAVE)) {
                System.out.println("You exit the room");
                break;
            }
        }
    }

}
