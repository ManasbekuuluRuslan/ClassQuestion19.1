public class Main {
    public static void main(String[] args) {
        Character warrior1 = new Warrior("28km","780","tuz atat");
        Warrior warrior2 = new Warrior("24km","640","shamdagay");
        Character archer1 = new Archer("34km","130","bat kachat");
        Archer archer2 = new Archer("36km","160","kuchtuu sekiret");

        Character[] people = {warrior1,warrior2,archer1,archer2};
        for (Character c : people) {
            if (c instanceof Warrior){
                c.setWeapon(new Weapon(WeaponType.AXE));
                c.setWeapon(new Weapon(WeaponType.BOW));
                System.out.println(c.toString());
            } else {
                c.setWeapon(new Weapon(WeaponType.SWORD));
                System.out.println(c.toString());
            }
        }
    }
}