public class Skeleton extends Boss{
    private int arrowCount;

    public Skeleton() {
        super();
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        return "Skeleton [health=" + getHealth() + ", damage=" + getDamage() + ", weapon=" + getWeapon().getWeaponType() + " - " + getWeapon().getWeaponName() + ", arrowCount=" + arrowCount + "]";
    }
}
