package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.Equipment;

public class Weapons {

    private String name;
    private int damage;

    public Weapons() {
    }

    public int getWeaponDamage() {
        return this.damage;
    }

    public void setShortsword() {
        this.name = "Shortsword";
        this.damage = 13;
    }
    public void setLongsword() {
        this.name = "Longsword";
        this.damage = 15;
    }
    public void setClaymore() {
        this.name = "Claymore";
        this.damage = 20;
    }
    public void setGoldenKatana() {
        this.name = "Mastercrafted Katana";
        this.damage = 30;
    }
}
