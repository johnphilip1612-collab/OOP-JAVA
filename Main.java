/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFI;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Create warrior without weapon, expect attack error
        Warrior warrior = new Warrior(1000, "Jashi", 1500);
        System.out.println(warrior);
        try {
            warrior.attack();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Assign weapon and attack
        Weapon StormBreaker = new Weapon(1000, 2, "StormBreaker");
        warrior.setWeapon(StormBreaker);
        warrior.attack();
        warrior.defend();
        System.out.println();

        // Create Mage without weapon
        Mage mage = new Mage(1000, "Dave", 1000);
        System.out.println(mage);

        try {
            mage.attack();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Assign weapon and attack
        Weapon GoddestStaff = new Weapon(1000, 5, "GoddestStaff");
        mage.setWeapon(GoddestStaff);
        mage.attack();
        mage.defend();
        mage.defend(); // second defend to show mana depletion effect

        System.out.println(mage);
    }

    private static class Mage {

        private Mage(int i, String Benedetta, int i0) {
            System.out.println("Dashing");
        }
        private void attack() {
            System.out.println("Slashing");
        }

        private void setWeapon(Weapon GoddestStaff) {
            System.out.println("Samurai");
        }

        private void defend() {
            System.out.println("Basic Attack");
        }

       
    }
}