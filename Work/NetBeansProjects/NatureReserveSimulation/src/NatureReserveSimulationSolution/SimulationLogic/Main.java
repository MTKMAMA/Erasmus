/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NatureReserveSimulationTest.SimulationLogic;
  import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Erasmus3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Class<? extends Animal>> animalTypes = new ArrayList<>();
        animalTypes.add(Lion.class);
        animalTypes.add(Rabbit.class);

        // Create food items
        Food lettuce = new Food("Lettuce", 10);
        Food meat = new Food("Meat", 30);

        List<Food> knownFoods = new ArrayList<>();
        knownFoods.add(lettuce);
        knownFoods.add(meat);

        // Create and run the simulation
        Simulation simulation = new Simulation(animalTypes, knownFoods, 100);
        simulation.simulateLifespan();
    }
}
