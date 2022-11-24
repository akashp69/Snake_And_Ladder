package com.bridgelabz;

import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {

        int currentPosition = 96;
        int snake = (int) Math.floor(Math.random() * 10) % 3;
        int checkPosition = (int) Math.floor(Math.random() * 10) % 6 + 1;
        if (snake == 1) {
            currentPosition = currentPosition + checkPosition;
            if (currentPosition <= 100)
                System.out.println("Ladder Option Moves Ahead " + currentPosition);
        } else if (snake == 2) {
            currentPosition = currentPosition - checkPosition;
            System.out.println("Snake Option Moves Behind " + currentPosition);
        } else {
            currentPosition = currentPosition;
            System.out.println("No Play");
        }
        if (currentPosition <= 100)
            System.out.println("current postion after die throw is: " + currentPosition);
        else
            System.out.println("Throw Die Again");
        while (currentPosition==100){
            System.out.println("Game Win");
            break;
        }
    }

}