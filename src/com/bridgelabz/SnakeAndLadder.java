package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {

        int currentPosition=96;
        int snake= (int) Math.floor(Math.random() * 10) %3;
        int dieNumber =(int) Math.floor(Math.random() * 10) %6 +1;
        if(snake==1) {
            currentPosition=currentPosition + dieNumber;
            if(currentPosition<=100)
                System.out.println("Ladder Option Moves Ahead " +currentPosition );
        }
        else if(snake==2)  {
            currentPosition =currentPosition - dieNumber;
            System.out.println("Snake Option Moves Behind " +currentPosition );
        }
        else {
            currentPosition=currentPosition;
            System.out.println("No Play");
        }
        if(currentPosition<=100)
            System.out.println("current postion after roll die is: " + currentPosition);
        else
            System.out.println("Throw Die Again");

    }}