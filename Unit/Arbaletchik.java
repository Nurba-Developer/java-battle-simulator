package Unit;

public class Arbaletchik extends Archer {

    protected Arbaletchik(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage, int defense,
            int speed, int cartridges, int range, int posX, int posY) {
        super(name, speed, hp, minDamage, maxDamage, attack, defense, maxHp, range, cartridges, posX, posY);
    }

    public Arbaletchik(String name, Vector2D coords) {
        super(name, 9, 60.f, 3, 7, 7, 4, 60, 10, 20, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалетчик: \t").append(Arbaletchik.super.name)
                .append("\t| ATK:\t").append(Arbaletchik.super.attack)
                .append("\t| HP:\t").append(Arbaletchik.super.hp)
                .append(" \t| Arrows:").append(Arbaletchik.super.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Arbaletchik.super.coords.posX).append(".")
                .append(Arbaletchik.super.coords.posY);
    }

}
