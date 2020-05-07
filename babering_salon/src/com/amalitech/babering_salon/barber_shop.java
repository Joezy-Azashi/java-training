package com.amalitech.babering_salon;

import java.util.*;

public class barber_shop {
	
	//Declaration and Initialization of variables
    public static LinkedList<String> VIPlist = new LinkedList<String>();
    public static LinkedList<String> ORDlist = new LinkedList<String>();
    public static LinkedList<String> waitingline = new LinkedList<String>();
    public static Random random = new Random();
    public static int x;
    public static String str;
    public static String mainSeat = "";
    public static Scanner kybd = new Scanner(System.in);
    public static String vipName;
    public static String ordName;
    public static int ordCounter = 1;
    public static int vipCounter = 1;
    

    //add ordinary and vip to waiting
    static void addBothToQueue() {
        for (int counter = 0; counter < VIPlist.size(); counter++) {
            waitingline.addLast(VIPlist.get(counter));
        }

        for (int counter = 0; counter < ORDlist.size(); counter++) {
            waitingline.add(ORDlist.get(counter));
        }
    }

    //place VIP in VIP seat
    static void addVIPClientsQueue() {
        vipName = "VIP" + vipCounter;
        VIPlist.addFirst(vipName);
        Collections.sort(VIPlist);
        System.out.print(vipName);
        vipCounter++;
    }

    //this method queues VIP clients in the barbering shop
    static void addOrdinaryClientsQueue() {
        ordName = "ORD" + ordCounter;
        ORDlist.addLast(ordName);
        System.out.print(ordName);
        ordCounter++;
    }

    //this method generates a random number
    static void randomNumberGenerator() {
        x = random.nextInt(4);
    }

    //this methods prints a number of --- based on user requirements
    static void dashPrinter(int numOfDashes) {
        for (int counter = 0; counter < numOfDashes; counter++) {
            System.out.print("-");
        }
    }

    //this methods prints a number of +++ based on user requirements
    static void plusPrinter(int numberOfPluses) {
        for (int counter = 0; counter < numberOfPluses; counter++) {
            System.out.print("+");
        }
    }

    //this methods prints a number of spaces based on user requirements
    static void spacePrinter(int numberOfSpaces) {
        for (int counter = 0; counter < numberOfSpaces; counter++) {
            System.out.print(" ");
        }
    }

    //this methods prints a number of arrows based on user requirements
    static void arrowPrinter(int numOfArrows) {
        for (int counter = 0; counter < numOfArrows; counter++) {
            System.out.print(">");
        }
    }

    //this methods prints a number of left brackets based on user requirements
    static void leftBracketPrinter(int numberOfBrackets) {
        for (int counter = 0; counter < numberOfBrackets; counter++) {
            System.out.print("(");
        }
    }

    //this methods prints a number of brackets based on user requirements
    static void rightBracketPrinter(int numberOfBrackets) {
        for (int counter = 0; counter < numberOfBrackets; counter++) {
            System.out.print(")");
        }
    }
    
    
  //main point where program runs
    public static void main(String[] args) {

        spacePrinter(4);
        System.out.print("X");
        spacePrinter(7);
        System.out.print("Events");
        spacePrinter(16);
        System.out.print("State of the Shop");
        System.out.println();

        plusPrinter(1);
        dashPrinter(7);
        plusPrinter(1);
        dashPrinter(12);
        plusPrinter(1);
        dashPrinter(45);
        plusPrinter(1);
        randomNumberGenerator();

        for (int counter = 1; counter <= 20; counter++) {
            str = kybd.nextLine();
            randomNumberGenerator();
            if (str.isEmpty()) {
                if (x == 0) {
                    if (!mainSeat.isEmpty()) {
                        System.out.print(x);
                        spacePrinter(1);
                        dashPrinter(3);
                        arrowPrinter(1);
                        spacePrinter(2);
                        leftBracketPrinter(1);
                        spacePrinter(1);
                        dashPrinter(2);
                        spacePrinter(1);
                        System.out.print(mainSeat);

                        if(!ORDlist.isEmpty()) {
                            ORDlist.remove(0);
                        }
                        spacePrinter(2);
                        rightBracketPrinter(1);
                        spacePrinter(2);
                        mainSeat = "";

                        waitingline.clear();
                        addBothToQueue();
                        System.out.print(waitingline);
                    } else {
                        System.out.print(x);
                        spacePrinter(1);
                        dashPrinter(3);
                        arrowPrinter(1);
                        spacePrinter(2);
                        leftBracketPrinter(1);
                        spacePrinter(1);
                        dashPrinter(7);
                        spacePrinter(2);
                        rightBracketPrinter(1);
                        spacePrinter(2);

                        waitingline.clear();
                        addBothToQueue();
                        waitingline.addLast(mainSeat);
                        System.out.print(waitingline);

                        if (!waitingline.isEmpty()) {
                            mainSeat = waitingline.get(0);
                            waitingline.remove(0);
                            if(!ORDlist.isEmpty()) {
                                ORDlist.remove(0);
                            }
                        } else {

                        }
                    }
                } else if (x == 1) {
                    System.out.print(x);
                    spacePrinter(1);
                    dashPrinter(3);
                    arrowPrinter(1);
                    spacePrinter(2);
                    leftBracketPrinter(1);
                    spacePrinter(1);
                    plusPrinter(2);
                    spacePrinter(1);

                    if (!mainSeat.isEmpty()) {
                        addVIPClientsQueue();
                        spacePrinter(2);
                        rightBracketPrinter(1);
                        spacePrinter(2);

                        waitingline.clear();
                        addBothToQueue();
                        System.out.print(waitingline);
                    } else {
                        if(!waitingline.isEmpty()) {
                            mainSeat = waitingline.get(0);
                            waitingline.remove(0);
                        }
                        if(!VIPlist.isEmpty()) {
                            VIPlist.remove(0);
                        }

                        addVIPClientsQueue();
                        spacePrinter(2);
                        rightBracketPrinter(1);
                        spacePrinter(2);

                        waitingline.clear();
                        addBothToQueue();
                        waitingline.addLast(mainSeat);
                        System.out.print(waitingline);
                    }
            } else if (x == 2 || x == 3) {
                System.out.print(x);
                spacePrinter(1);
                dashPrinter(3);
                arrowPrinter(1);
                spacePrinter(2);
                leftBracketPrinter(1);
                spacePrinter(1);
                plusPrinter(2);
                spacePrinter(1);

                    if (!mainSeat.isEmpty()) {
                        addOrdinaryClientsQueue();
                        mainSeat = ORDlist.get(0);
                        spacePrinter(2);
                        rightBracketPrinter(1);
                        spacePrinter(2);

                        waitingline.clear();
                        addBothToQueue();
                        waitingline.addLast(mainSeat);
                        System.out.print(waitingline);
                    } else {
                        if(!waitingline.isEmpty()) {
                            mainSeat = waitingline.get(0);
                            waitingline.remove(0);
                        }
                        if(!ORDlist.isEmpty()) {
                            ORDlist.remove(0);
                        }

                        addOrdinaryClientsQueue();
                        spacePrinter(2);
                        rightBracketPrinter(1);
                        spacePrinter(2);

                        waitingline.clear();
                        addBothToQueue();
                        waitingline.addLast(mainSeat);
                        System.out.print(waitingline);
                    }
                }
            }
        }
        System.out.println();
        System.out.println(ORDlist);
        System.out.println(VIPlist);

        waitingline.clear();
        addBothToQueue();
        System.out.println(waitingline);
}
    
}

