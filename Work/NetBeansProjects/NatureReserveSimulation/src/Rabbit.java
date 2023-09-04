/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erasmus3
 */
public class Rabbit extends Animal {
    public Rabbit() {
        super(new AnimalSpecies("Rabbit", 50, Set.of(new Food("Lettuce", 10))));
    }
}
