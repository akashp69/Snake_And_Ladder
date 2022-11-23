package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {

        int checkPosition =(int) Math.floor(Math.random() * 10) %6 +1;

        System.out.println("Current position is :" + checkPosition);
    }
}