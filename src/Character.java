public class Character implements Attack{

    @Override
    public String attack() {
        return "Jaa menen ataka kylat...";
    }

    public Character(){
    }

    private String speed;
    private String power;
    private String dexterity;
    private Weapon weapon;

    public Character(String speed, String power, String dexterity) {
        this.speed = speed;
        this.power = power;
        this.dexterity = dexterity;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDexterity() {
        return dexterity;
    }

    public void setDexterity(String dexterity) {
        this.dexterity = dexterity;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Character{" + attack() +
                "speed='" + speed + '\'' +
                ", power='" + power + '\'' +
                ", dexterity='" + dexterity + '\'' +
                ", weapon=" + weapon +
                '}';
    }
}

