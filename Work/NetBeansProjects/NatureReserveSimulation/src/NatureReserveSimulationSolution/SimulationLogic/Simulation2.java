/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import NatureReserveSimulationTest.Food.Food;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulation {
    private List<Animal> animals;

    public Simulation(List<Class<? extends Animal>> animalTypes, List<Food> knownFoods, int numAnimals) {
        animals = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numAnimals; i++) {
            Class<? extends Animal> animalType = animalTypes.get(random.nextInt(animalTypes.size()));
            try {
                Animal animal = animalType.getDeclaredConstructor().newInstance();
                animals.add(animal);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void simulateLifespan() {
        Random random = new Random();
        int turn = 0;

        while (!animals.isEmpty()) {
            turn++;
            for (Animal animal : new ArrayList<>(animals)) {
                Food randomFood = knownFoods.get(random.nextInt(knownFoods.size()));
                animal.feed(randomFood);
                if (animal.getCurrentEnergy() == 0) {
                    animals.remove(animal);
                }
            }
        }

        // Calculate and print statistics
        int totalLifespan = turn;
        int minLifespan = turn;
        int maxLifespan = turn;
        for (Animal animal : animals) {
            int lifespan = totalLifespan - animal.getCurrentEnergy();
            if (lifespan < minLifespan) {
                minLifespan = lifespan;
            }
            if (lifespan > maxLifespan) {
                maxLifespan = lifespan;
            }
        }

        double averageLifespan = (double) totalLifespan / animals.size();

        System.out.println("Simulation Statistics:");
        System.out.println("Minimum Lifespan: " + minLifespan);
        System.out.println("Maximum Lifespan: " + maxLifespan);
        System.out.println("Average Lifespan: " + averageLifespan);
    }
}
