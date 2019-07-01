package main.java;

import main.java.counter.BillCounter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter your amount: ");
        long start, end, total;
        try (Scanner scanner = new Scanner(System.in)){
            Integer amount = scanner.nextInt();
            scanner.nextLine();
            if (amount >= 24565 && amount <= 35789) {
                start = System.currentTimeMillis();
                BillCounter.countBills(amount);
                end = System.currentTimeMillis();
                total = end - start;
                System.out.println("Executing time is: " + total + " miliseconds");
            } else {
                BillCounter.countBills(amount);
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("You entered incorrect amount!");
        }
    }
}

