package game_logic;

public abstract class Character {
    public String name;
    public int maxHp, hp, xp;

    public Character(String name, int maxHp, int xp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.xp = xp;
    }
    public abstract int attack();
    public abstract int defend();
}
