package demo.game;

public class Wizard extends PlayerCharacter implements Playable {
    public int power;

    public Wizard(String name, int age, int currentLevel, int power) {
        super(name, age, currentLevel);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void attack() {
        System.out.println("Attacking with power: " + power);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "power=" + power +
                '}';
    }

    @Override
    public void levelUp() {
        int level = getCurrentLevel() + 1;
        setCurrentLevel(level);
        power += 50;
    }
}
