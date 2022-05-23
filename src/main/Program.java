package main;

import java.util.Scanner;

public class Program {

    private static int[] poziciok;

    public static void main(String[] args) {
        System.out.println("Torepdó Játék");
    }

    public static void lovesek() {
        Scanner scnr = new Scanner(System.in);
        int[] pozicio = new int [3];
        
        int minimum = 1;
        int maximum = 5;
        
        int randomSzam = (int)(Math.random());
        pozicio[0] = randomSzam;
        pozicio[1] = randomSzam + 1;
        pozicio[2] = randomSzam + 2;
        
        for (int i = 0; i < 5; i++){
            System.out.println("");
        }
        }
}
