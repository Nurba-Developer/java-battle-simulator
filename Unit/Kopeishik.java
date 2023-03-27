package Unit;

public class Kopeishik extends Hero {

    public Kopeishik(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage, int defense, int speed,
            int posX, int posY) {
        super(name, hp, speed, minDamage, maxDamage, attack, defense, maxHp, posX, posY);

    }

    public Kopeishik(String name, Vector2D coords) {
        super(name, 70.f, 6, 2, 4, 10, 10, 70, coords.posX, coords.posY);
    }

    public void runAway() {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Kopeishik.super.name)
                .append("\t| ATK:\t").append(Kopeishik.super.attack)
                .append("\t| HP:\t").append(Kopeishik.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Kopeishik.super.coords.posX).append(".")
                .append(Kopeishik.super.coords.posY);
    }

}
