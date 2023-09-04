/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationTest.SimulationLogic;

/**
 *
 * @author Erasmus3
 */
import java.util.Random;

public class Animal {
    private AnimalSpecies species;
    private int currentEnergy;

    public Animal(AnimalSpecies species) {
        this.species = species;
        this.currentEnergy = species.getMaximumEnergy();
    }

    public void feed(Food food) {
        if (species.getAllowedFoods().contains(food)) {
            currentEnergy += 1;
            // Ensure currentEnergy doesn't exceed maximumEnergy
            if (currentEnergy > species.getMaximumEnergy()) {
                currentEnergy = species.getMaximumEnergy();
            }
        } else {
            currentEnergy -= 1;
            // If energy reaches zero, the animal dies
            if (currentEnergy <= 0) {
                currentEnergy = 0;
            }
        }
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }
}
