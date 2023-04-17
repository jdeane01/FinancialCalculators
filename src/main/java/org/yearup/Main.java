package org.yearup;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200.0; // 12 months per year, 100 for percentage

        System.out.print("Enter the loan term (in years): ");
        int loanTermInYears = scanner.nextInt();
        int loanTermInMonths = loanTermInYears * 12;

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, loanTermInMonths));
        double totalPayment = monthlyPayment * loanTermInMonths;
        double totalInterest = totalPayment - loanAmount;

        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Payment: %.2f%n", totalPayment);
        System.out.printf("Total Interest: %.2f%n", totalInterest);
    }
}