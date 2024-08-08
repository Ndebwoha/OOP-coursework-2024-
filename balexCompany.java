/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isaiah.oopcoursework;

/**
 *
 * @author Ndebwoha
 */
public class balexCompany {
    public void calculatePay(double basePay, int hoursWorked) {
        // Constants for minimum wage and maximum hours
        final double MIN_WAGE = 8.00;
        final int MAX_HOURS = 60;
        // Error check
        if (basePay < MIN_WAGE) {
            System.out.println("Error: Base pay must be at least $" + MIN_WAGE + " per hour.");
            return;
        }
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked cannot exceed " + MAX_HOURS + " hours.");
            return;
        }
        // Calculate total pay
        double totalPay;
        if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked;
        } 
        else {
            int overtimeHours = hoursWorked - 40;
            totalPay = (basePay * 40) + (overtimeHours * basePay * 1.5);
        }
        // Print total pay
        System.out.println("The total pay for " + hoursWorked + " hours at $" + basePay + " per hour is $" + totalPay);
    }
}

   