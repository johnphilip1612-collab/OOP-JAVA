/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consolstructure;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem7 {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             int sum = 0;
             while (true) {
                 System.out.print("Enter a number: ");
                 String input = scanner.nextLine();
                 try {
                     int number = Integer.parseInt(input);
                     if (number == 0) {
                         break;
                     }
                     sum += number;
                 } catch (NumberFormatException e) {
                     System.out.println("Error: invalid number!");
                 }
             }
             System.out.println("Sum: " + sum);
         }
    }
}

