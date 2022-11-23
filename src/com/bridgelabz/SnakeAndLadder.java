package com.bridgelabz;

import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int currentPosition=43;
        int snake= (int) Math.floor(Math.random() * 10) %3;
        int checkPosition =(int) Math.floor(Math.random() * 10) %6 +1;
        if(snake==1) {
            currentPosition =currentPosition + checkPosition;
            System.out.println("Ladder Moves Ahead");
        }
        else if(snake==2)  {
            currentPosition =currentPosition - checkPosition;
            System.out.println("Snake Moves Behind");
        }
        else {
            currentPosition=currentPosition;
            System.out.println("No Play");

        }
        System.out.println("current postion after 43 is: " + currentPosition);

    }}