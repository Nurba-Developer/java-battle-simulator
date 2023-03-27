package Unit;

public class Koldun extends Mag {

    public Koldun(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage,
            int defense, int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, defense, speed, mana, maxMana, posX, posY);
    }

    public Koldun(String name, Vector2D coords) {
        super(name, 50.f, 50, 9, 6, 6, 3, 7, 5, 5, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Koldun.super.name)
                .append("\t| ATK:\t").append(Koldun.super.attack)
                .append("\t| HP:\t").append(Koldun.super.hp)
                .append(" \t| MP:\t").append(Koldun.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Koldun.super.coords.posX).append(".")
                .append(Koldun.super.coords.posY);
    }

}
