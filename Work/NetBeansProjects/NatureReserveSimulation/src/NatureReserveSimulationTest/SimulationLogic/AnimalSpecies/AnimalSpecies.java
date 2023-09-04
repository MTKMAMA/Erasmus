
import NatureReserveSimulationTest.Food.Food;
import java.util.Set;

import java.util.Set;

public class AnimalSpecies {
    private String name;
    private int maximumEnergy;
    private Set<Food> allowedFoods;

    public AnimalSpecies(String name, int maximumEnergy, Set<Food> allowedFoods) {
        this.name = name;
        this.maximumEnergy = maximumEnergy;
        this.allowedFoods = allowedFoods;
    }

    public String getName() {
        return name;
    }

    public int getMaximumEnergy() {
        return maximumEnergy;
    }

    public Set<Food> getAllowedFoods() {
        return allowedFoods;
    }
}
