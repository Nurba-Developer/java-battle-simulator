package Unit;

public abstract class Mag extends Hero {

    protected int mana;
    protected int maxMana;

    public Mag(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage, int defense,
            int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, speed, minDamage, maxDamage, attack, defense, maxHp, posX, posY);

        this.mana = mana;
        this.maxMana = maxMana;
    }
}
