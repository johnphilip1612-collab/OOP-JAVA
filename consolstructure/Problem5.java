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
public class Problem5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input an alphabet: ");
            String input = scanner.nextLine();
            
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Error: Please enter a single letter from the alphabet.");
            } else {
                char character = Character.toLowerCase(input.charAt(0));
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            }
        }
    }
}
