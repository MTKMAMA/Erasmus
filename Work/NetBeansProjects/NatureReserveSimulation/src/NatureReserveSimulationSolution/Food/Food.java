/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationTest.Food;

/**
 *
 * @author Erasmus3
 */
public class Food {
    private String name;
    private int nutritionValue;

    public Food(String name, int nutritionValue) {
        this.name = name;
        this.nutritionValue = nutritionValue;
    }

    public String getName() {
        return name;
    }

    public int getNutritionValue() {
        return nutritionValue;
    }
}
