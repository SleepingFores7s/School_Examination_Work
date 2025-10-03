package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.Equipment;

public class Armor {

    private String name;
    private int armor;

    public Armor() {

    }

    public int getArmor() {
        return this.armor;
    }

    public void setLeatherArmor() {
        this.name = "Leather Armor";
        this.armor = 5;
    }
    public void setIronArmor() {
        this.name = "Iron Armor";
        this.armor = 10;
    }
    public void setSteelArmor() {
        this.name = "Steel Armor";
        this.armor = 15;
    }
    public void setMithrilArmor() {
        this.name = "Mithril Armor";
        this.armor = 25;
    }
}
