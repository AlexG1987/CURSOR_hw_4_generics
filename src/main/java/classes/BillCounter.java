package main.java.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class BillCounter {

    public static void countBills(int amount) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(500, 200, 100, 50, 20, 10, 5, 2, 1));
        ListIterator<Integer> listIterator = list.listIterator();
        System.out.println("Count of bills from your amount is: ");
        while (listIterator.hasNext()) {
            Integer next = listIterator.next();
            int count = amount / next;
            if (count != 0) {
                System.out.print(count + "*" + next + "; ");
                amount %= next;
                if (amount == 0) break;
            }
        }
        System.out.println();
    }

}

