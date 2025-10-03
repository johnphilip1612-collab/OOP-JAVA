/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFI;

/**
 *
 * @author User
 */
public class Warrior extends Character {
    private int armor_strength;

    public Warrior(int armor_strength, String name, int health) {
        super(name,health);
      
        this.armor_strength = armor_strength;
    }

    public int getArmorStrength() {
        return armor_strength;
    }

    public void setArmorStrength(int armor_strength) {
        this.armor_strength = armor_strength;
    }

    
    @Override
    public void attack() throws Exception {
        if (getWeapon() == null) {
            throw new Exception("Warrior must have a weapon to attack.");
        }
        // Attack logic here
    }

    public void defend() {
        // Defend logic here
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "armor_strength=" + armor_strength +
                ", name='" + getName() + '\'' +
                ", health=" + getHealth() +
                '}';
    }
}
       

