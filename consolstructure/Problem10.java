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
public class Problem10 {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Input the number: ");
             int n = scanner.nextInt();
             
             // Generating the first triangle
             for (int i = 0; i < n; i++) {
                 for (int j = 0; j < n; j++) {
                     if (j < i) {
                         System.out.print(" ");
                     } else {
                         System.out.print("*");
                     }
                 }
                 System.out.println();
             }
             
             // Generating the second triangle
             for (int i = n; i > 0; i--) {
                 for (int j = 0; j < n; j++) {
                     if (j < i) {
                         System.out.print("*");
                     }
                 }
                 System.out.println();
             }}
    }
}

