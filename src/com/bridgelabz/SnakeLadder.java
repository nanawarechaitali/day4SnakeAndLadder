package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder game on Master branch");
        System.out.println("Initial position of the player1 is at 0");


        Random random= new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Player is rolling dice and get" + " "+dice);
    }
}
