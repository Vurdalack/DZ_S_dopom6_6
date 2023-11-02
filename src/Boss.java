public class Boss extends GameEntity{
    private Weapon weapon;

    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }
    public Boss() {}
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss [health=" + getHealth() + ", damage=" + getDamage() + ", weapon=" + weapon.getWeaponType() + " - " + weapon.getWeaponName() + "]";
    }
}
