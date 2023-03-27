package Unit;

import java.util.ArrayList;

public abstract class Hero implements GameInterfase{

    public String name;
    protected float hp;
    protected int speed;
    protected int minDamage;
    protected int maxDamage;
    protected int attack;
    protected int defense;
    protected int maxHp;
    protected Vector2D coords;
    public String state;
    protected static int heroCnt;

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minDamage + maxDamage )/2)) +
                state;
    }

    public int[] getCoords() {return new int[]{coords.posX, coords.posY};}

    public Hero(String name, float hp, int speed, int minDamage, int maxDamage, int attack, int defense, int maxHp,
            int posX, int posY) {
        this.name = name;
        this.speed = speed;
        this.hp = hp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attack = attack;
        this.defense = defense;
        this.maxHp = maxHp;
        coords = new Vector2D(posX, posY);
        state = " Stand";
        heroCnt++;
    }

    public int getSpeed() {
        return this.speed;
    }

    public float getHp() {
        return this.hp;
    }

    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {}
    public int findNearest(ArrayList<Hero> team){  
        int index = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    protected void getDamage(float damage) {
        hp -= damage;
        if (hp > maxHp)
            hp = maxHp;
        if (hp < 0)
            state = "Die";
    }

    @Override
    public StringBuilder getInfo() {
        return new StringBuilder();
    }
}