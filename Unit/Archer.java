package Unit;

import java.util.ArrayList;

public abstract class Archer extends Hero {

    protected int range;
    protected int cartridges;

    public Archer(String name, int speed, float hp, int minDamage, int maxDamage, int attack, int defense, int maxHp,
            int range, int cartridges, int posX, int posY) {
        super(name, hp, speed, minDamage, maxDamage, attack, defense, maxHp, posX, posY);
        this.range = range;
        this.cartridges = cartridges;
    }

    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
        if (state.equals("Die") || cartridges == 0) return;
        Hero victim = team2.get(findNearest(team2));
        float damage = (victim.defense - attack)>0 ? minDamage : (victim.defense - attack)<0 ? maxDamage : (minDamage + maxDamage)/2;
        victim.getDamage(damage);
        for (Hero hero: team1) {
            if (hero.getInfo().toString().split(":")[0].equals("Крестьянин") && hero.state.equals("Stand")) {
                hero.state = "Busy";
                return;
            }
        }
        cartridges--;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minDamage+maxDamage)/2)) +
                " Shots:" + cartridges +
                state;
    }

}
