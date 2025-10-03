package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.PlayerAndEnemy_Stats;

import Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.smallTasks.Popups;

public class Player {

    //Essentials
    Popups popup = new Popups();

    private String name;
    private int health;
    private int healthOriginal;
    private int healthAfterArmor;
    private int attack;
    private int attackOriginal;

    private boolean armorEquipped;

    private int monstersHunted;

    public Player(String name) {
        this.name = name;
        this.health = 25;
        this.healthOriginal = health;
        this.attack = 10;
        this.attackOriginal = attack;
        this.monstersHunted = 0;
    }

    //Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Health
    public int getHealth() {
        return health;
    }

    public void setResetHealth() {
        this.health = healthOriginal;
    }

    public void setEquipArmor(int armorValue) {
        this.armorEquipped = true;
        this.healthAfterArmor = this.health + armorValue;
        this.health = this.health + armorValue;
    }

    public void setUnequipArmor() {
        this.armorEquipped = false;
        this.health = healthOriginal;
    }

    //Attack
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setResetAttack() {
        this.attack = attackOriginal;
    }

    public int getAttack() {
        return attack;
    }

    //Monster kills
    public void setMonstersHunted() {
        this.monstersHunted = monstersHunted + 1;
    }

    public int getMonstersHunted() {
        return monstersHunted;
    }

    //Take Damage
    public void takeDamage(int enemyDamage) {
        this.health = health - enemyDamage;
    }

    //Healing With/Without armor
    public void healDamage(int playerHeal) {
        //True
        if (armorEquipped) {

            if (health >= healthAfterArmor) {
                popup.openCombatInfoPopup("Your health is at max.");
            } else {
                this.health = health + playerHeal;
                if (health >= healthAfterArmor) {
                    this.health = healthAfterArmor;
                }
            }

        }
        //False
        if (armorEquipped) {

            if (health >= healthOriginal) {
                popup.openCombatInfoPopup("Your health is at max.");
            } else {
                this.health = health + playerHeal;
                if (health >= healthOriginal) {
                    this.health = healthOriginal;
                }
            }

        }
    }
}
