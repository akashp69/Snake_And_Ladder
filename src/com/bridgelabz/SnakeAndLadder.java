package com.bridgelabz;


public class SnakeAndLadder {
    public static void main(String[] args) {
        int position=0;
        int count=0;
        while(position<=100) {
            count++;
            int snake = (int) Math.floor(Math.random() * 10) % 3;
            int check = (int) Math.floor(Math.random() * 10) % 7;
            if (snake == 1) {
                //Move Forward
                position = position + check;
            } else if (snake == 2) {
                //Move Back
                position = position - check;
                if (position < 0) {
                    position = 0;
                }
            } else {
                //No Play
                count = count - 1;

            }
            System.out.println("No of times dice roll is : " + count);
            System.out.println("current postion  is: " + position);
            if(position==100) {
                position = position - check;
                break;

            }
        }
    }
}