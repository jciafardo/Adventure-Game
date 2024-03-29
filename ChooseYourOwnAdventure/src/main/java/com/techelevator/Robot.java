package com.techelevator;

public class Robot {

    private final int MIN_HEALTH = 0;
    private int health  = 100;



    // getters
    public int getHealth(){
        return health;
    }

    // setters

    public void setHealth(int health){
        this.health = health;
    }


    public void fightRobot(Player player, Robot robot){
        boolean robotWins = ((int)(Math.random() * 10)) <= 5;

        int healthDeduction = (int) (Math.random() * 20);
        if(robotWins) {
            player.setHealth(player.getHealth() - healthDeduction);
            System.out.println("Oh no! The robot is too fast. Your health is down to " + player.getHealth());
        } else {
            robot.setHealth(robot.getHealth() - healthDeduction);

            System.out.println("You damaged the robot it's health is down to " + robot.getHealth());
            if(robot.getHealth() <= 0){
                System.out.println("Player wins robot is gone");
            }
        }


    }


}
