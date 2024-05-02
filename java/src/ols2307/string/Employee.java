package ols2307.string;

import java.util.Scanner;

public class Employee {
    static String generateId(String oldId) {
        String nextId = oldId.substring(1);
        int nextSl = Integer.parseInt(nextId);
        nextSl++;
        if (nextSl < 10)
            nextId = "E00" + nextSl;
        else if (nextSl < 100)
            nextId = "E0" + nextSl;
        else
            nextId = "E" + nextSl;
        return nextId;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an employee id: ");
        String oldId = scanner.next();
        scanner.close();
        System.out.println("The next employee id is: " + generateId(oldId));
    }
}
