/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasigbasicdatatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class problem2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input a value for inches:");
            double inch = sc.nextDouble();
            
            double meter = inch * 0.0254;
            
            System.out.println(inch + " inches is " + meter + "meters");
        }
        
    }
}

