package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tickets = 0;
        while (!finish(tickets)) {
            System.out.println("Please enter number of tickets(Finish please enter -1):");
            tickets = scanner.nextInt();

            if (!finish(tickets)) {
                System.out.println("How many round-trip tickets:");
                int returns = scanner.nextInt();
                Ticket ticket = new Ticket(tickets, returns);
                ticket.printReceipt();
            } else
                System.out.println("Thank you, have a good trip!");
        }
    }

    private static boolean finish(int tickets) {
        return tickets == -1;
    }
}
