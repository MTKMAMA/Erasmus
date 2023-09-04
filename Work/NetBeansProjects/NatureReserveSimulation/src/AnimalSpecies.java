
import java.util.Set;
import java.util.Random;

public class AnimalSpecies {
    private AnimalSpecies species;
    private int currentEnergy;

    public AnimalSpeciesSpecies species) {
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
