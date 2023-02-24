public class Weapon implements Attack{
   private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String attack() {
        return "SVD menen atat...";
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponType=" + weaponType +
                '}';
    }
}
