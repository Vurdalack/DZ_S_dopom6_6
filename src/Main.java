public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponType.PISTOLE, "МАКАРОВА");


        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setWeapon(bossWeapon);


        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(200);
        skeleton1.setDamage(20);
        skeleton1.setWeapon(new Weapon(WeaponType.POCO, "БОМБЕЗНЫЙ ТЕЛЛЕФОН"));;
        skeleton1.setArrowCount(30);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(250);
        skeleton2.setDamage(25);
        skeleton2.setWeapon(new Weapon(WeaponType.BOMBAAA, "ВЗРЫВ"));
        skeleton2.setArrowCount(40);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }


    }
