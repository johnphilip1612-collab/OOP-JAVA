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
public class Problem8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input number of terms: ");
            int terms = scanner.nextInt();
            
            for (int i = 1; i <= terms; i++) {
                int cube = i * i * i;
                System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
            }
        }
    }
}

