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
public class problem1 {
   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Input number: ");
           int number = scanner.nextInt();
           
           if (number > 0) {
               System.out.println(number + " is positive");
           } else if (number < 0) {
               System.out.println(number + " is negative");
           } else {
               System.out.println("The number is zero");
           }
       }
    }
}

