package Unit;

public class Razboinik extends Hero {
    int disguise;

    public Razboinik(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage,
            int defense, int speed, int disguise, int posX, int posY) {
        super(name, hp, speed, minDamage, maxDamage, attack, defense, maxHp, posX, posY);
        this.disguise = disguise;
    }

    public Razboinik(String name, Vector2D coords) {
        super(name, 70.f, 6, 2, 6, 10, 7, 70, coords.posX, coords.posY);
        this.disguise = 50;
    }

    public void steal(int disguise, Archer Archer) {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник: \t").append(Razboinik.super.name)
                .append("\t| ATK:\t").append(Razboinik.super.attack)
                .append("\t| HP:\t").append(Razboinik.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Razboinik.super.coords.posX).append(".")
                .append(Razboinik.super.coords.posY);
    }
}
