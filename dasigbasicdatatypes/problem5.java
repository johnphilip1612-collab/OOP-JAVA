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
public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Input distance in meters: ");
         double distance = input.nextDouble();
         
        System.out.println(" Input hour: ");
          int hour = input.nextInt();
          
        System.out.println(" Input minutes:  ");
         int minutes = input.nextInt();
         
         System.out.println(" Input seconds: ");
          int seconds = input.nextInt();
          int totalSeconds = (hour* 3600) + (minutes * 60) + seconds;
          
          double mps = distance / totalSeconds;
          double kph = (distance / 1000.0) / (totalSeconds / 3600.0);
          double mph = kph / 1.609;
          
          System.out.println("Your speed in meters/second is " + mps);
          System.out.println("Your speed in km/h is " + kph);
          System.out.println("Your speed in miles/h is " + mph);
         
    }
}
