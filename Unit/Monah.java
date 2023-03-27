package Unit;

public class Monah extends Mag {

    public Monah(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage,
            int defense, int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, defense, speed, mana, maxMana, posX, posY);

    }

    public Monah(String name, Vector2D coords) {
        super(name, 50.f, 50, 10, 7, 7, 3, 7, 5, 5, coords.posX, coords.posY);

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monah.super.name)
                .append("\t| ATK:\t").append(Monah.super.attack)
                .append("\t| HP:\t").append(Monah.super.hp)
                .append(" \t| MP:\t").append(Monah.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monah.super.coords.posX).append(".")
                .append(Monah.super.coords.posY);
    }

}
