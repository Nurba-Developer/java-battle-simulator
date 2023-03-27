package Unit;

public class Krestyanin extends Hero {
    protected int cartridges;

    protected Krestyanin(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage, int defense,
            int speed, int cartridges, int posX, int posY) {
        super(name, hp, speed, minDamage, maxDamage, attack, defense, maxHp, posX, posY);
        this.cartridges = cartridges;
    }

    public Krestyanin(String name, Vector2D coords) {
        super(name, 50.f, 3, 1, 1, 1, 1, 50, coords.posX, coords.posY);
        this.cartridges = 1;
    }

    protected void armiger(Archer Archer) {
    }

    public int getCartridgesKrestyanin() {
        return this.cartridges;
    }

    public void setCartridgesKrestyanin(int cartridges) {
        this.cartridges = cartridges;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Крестьянин: \t").append(Krestyanin.super.name)
                .append("\t| ATK:\t").append(Krestyanin.super.attack)
                .append("\t| HP:\t").append(Krestyanin.super.hp)
                .append(" \t| Arrows: ").append(Krestyanin.this.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Krestyanin.super.coords.posX).append(".")
                .append(Krestyanin.super.coords.posY);
    }
}
