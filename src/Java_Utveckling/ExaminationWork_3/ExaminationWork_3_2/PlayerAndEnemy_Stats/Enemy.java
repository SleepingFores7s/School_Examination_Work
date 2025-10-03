package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.PlayerAndEnemy_Stats;

public class Enemy {

    private String name;
    private int health;
    private int attack;

    private int healthOriginal;

    public Enemy(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.healthOriginal = health;
        this.attack = attack;
    }

    //Name
    public String getName() {
        return name;
    }

    //Health
    public int getHealth() {
        return health;
    }

    //Attack
    public int getAttack() {
        return attack;
    }

    //Take Damage
    public void takeDamage(int playerDamage) {
        this.health = health - playerDamage;
    }

    //Heal
    public void healDamage(int enemyHeal) {
        if (health >= healthOriginal) {
            this.health = healthOriginal;
        } else {
            this.health = health + enemyHeal;
            if (health >= healthOriginal) {
                this.health = healthOriginal;
            }
        }
    }
}
