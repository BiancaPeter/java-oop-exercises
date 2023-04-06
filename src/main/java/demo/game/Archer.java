package demo.game;

public class Archer extends PlayerCharacter implements Playable {
    private int numberOfArrows;

    public Archer(String name, int age, int currentLevel, int numberOfArrows) {
        super(name, age, currentLevel);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public void attack() {
        numberOfArrows--;
        System.out.println("Attack, number of arrows left " + numberOfArrows);
    }

    @Override
    public String toString() {
        return "Archer{" +
                "numberOfArrows=" + numberOfArrows +
                '}';
    }

    @Override
    public void levelUp() {
        int level = getCurrentLevel() + 1;
        setCurrentLevel(level);
        numberOfArrows += 100;
    }
}
