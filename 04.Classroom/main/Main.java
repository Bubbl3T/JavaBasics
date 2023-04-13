package main;

import java.util.Scanner;

import classroom.Classroom;

public class Main {

    public static void main(String[] args) {
        setupClassroom();
    }

    private static void setupClassroom() {
        Scanner sc = new Scanner(System.in);
        Classroom classroom = Classroom.createClassroom();
        classroom.startClass();
        boolean continueMenu = true;
        while (continueMenu) {
            printMenu();
            switch(sc.nextInt()) {
            case 1:
                classroom.speedUpFans();
                break;
            case 2:
                classroom.speedDownFans();
                break;
            case 3:
            default:
                continueMenu = false;
            }

        }
        classroom.endClass();
        sc.close();
    }

    private static void printMenu() {
        System.out.println("\nWhat do you want to do today?\n" +
                    "1: Turn up fan speed.\n" +
                    "2: Turn down fan speed.\n" + 
                    "3: End class.");
    }



}