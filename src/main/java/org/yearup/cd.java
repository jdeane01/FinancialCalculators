package org.yearup;

import java.util.Scanner;

public class cd {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter amount of deposit: ");
            double deposit = scanner.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double interestRate = scanner.nextDouble() / 100;

            System.out.print("Enter number of years investing: ");
            int years = scanner.nextInt();

            double futureValue = deposit * Math.pow(1 + interestRate, years);

            System.out.printf("Future Deposit Value: $%.2f", futureValue);
            System.out.println();
            System.out.printf("Interest Earned: $%.2f", (futureValue - deposit));
        }
}
