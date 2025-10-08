package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2;

import Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.PlayerAndEnemy_Stats.Enemy;
import Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.PlayerAndEnemy_Stats.Player;
import Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.smallTasks.Popups;
import Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.smallTasks.combatRandomizer;

public class Combat {

    public void combat(Player player, int enemySelection) {

        //Necessary things
        combatRandomizer combatRandomizer = new combatRandomizer();
        Popups jopPopup = new Popups();

        //Selects enemy name/stats
        Enemy enemy = switch (enemySelection) {
            case 0 -> new Enemy("Wolf", 25, 5);
            case 1 -> new Enemy("Goblin", 50, 10);
            case 2 -> new Enemy("Human", 100, 15);
            default -> null;
        };

        //Combat loop
        do {
            int combatChoice = jopPopup.openCombatSelectionPopup(player.getName() + " hp: " + player.getHealth() +
                    "\n" + enemy.getName() + " hp: " + enemy.getHealth()
            );

            //Combat randomised actions
            int enemyChoice = combatRandomizer.enemyAction();
            int heal = combatRandomizer.heal();
            int enemyHeal = combatRandomizer.heal();

            //Combat damage/block/heal loop
            switch (combatChoice) {
                //Attack
                case 0:
                    if (enemyChoice == 0) {
                        jopPopup.openCombatInfoPopup(player.getName() + " attack the " + enemy.getName() + " for " + player.getAttack() + " dmg");
                        jopPopup.openCombatInfoPopup("The " + enemy.getName() + " attack " + player.getName() + " for " + enemy.getAttack() + " dmg");
                        player.takeDamage(enemy.getAttack());
                        enemy.takeDamage(player.getAttack());
                    } else if (enemyChoice == 1) {
                        //Enemy blocks any damage
                        jopPopup.openCombatInfoPopup("The " + enemy.getName() + " blocked");
                    } else if (enemyChoice == 2) {
                        //player damages enemy, then enemy heals unless hp <= 0
                        jopPopup.openCombatInfoPopup(player.getName() + " attack the " + enemy.getName() + " for " + player.getAttack() + " dmg");
                        enemy.takeDamage(player.getAttack());
                        if (enemy.getHealth() <= 0) {
                            break;
                        }
                        jopPopup.openCombatInfoPopup("The " + enemy.getName() + " healed");
                        enemy.healDamage(enemyHeal);
                    }
                    break;

                //Block
                case 1:
                    if (enemyChoice == 0) {
                        //Player blocks any damage
                        jopPopup.openCombatInfoPopup(player.getName() + " blocked the " + enemy.getName() + ", no damage taken");
                    } else if (enemyChoice == 1) {
                        //Nothing happens, both block
                        jopPopup.openCombatInfoPopup(player.getName() + " blocked.\nThe " + enemy.getName() + " blocked.");
                    } else if (enemyChoice == 2) {
                        //Player blocks, enemy heals
                        enemy.healDamage(enemyHeal);
                        jopPopup.openCombatInfoPopup(player.getName() + " blocked, the " + enemy.getName() + " healed");
                    }
                    break;

                //Heal
                case 2:
                    if (enemyChoice == 0) {
                        //player takes damage, then heals unless hp <= 0
                        jopPopup.openCombatInfoPopup("The " + enemy.getName() + " attack " + player.getName() + " for " + enemy.getAttack() + " dmg");
                        player.takeDamage(enemy.getAttack());
                        if (player.getHealth() <= 0) {
                            break;
                        }
                        jopPopup.openCombatInfoPopup(player.getName() + " healed " + heal + " points of damage.");
                        player.healDamage(heal);
                    } else if (enemyChoice == 1) {
                        //enemy blocks, player heals
                        jopPopup.openCombatInfoPopup("The " + enemy.getName() + " blocked.\n" + player.getName() + " heal " + heal + " points of damage");
                        player.healDamage(heal);
                    } else if (enemyChoice == 2) {
                        //player and enemy heals
                        jopPopup.openCombatInfoPopup(player.getName() + " heal " + heal + " points of damage.\nThe " + enemy.getName() + " heals");
                        player.healDamage(heal);
                        enemy.healDamage(enemyHeal);
                    }
                    break;

                //Run away
                case 3:
                    if (combatRandomizer.flee() == 1) {
                        jopPopup.openCombatInfoPopup(player.getName() + " run away");
                        return;
                    }
                    jopPopup.openCombatInfoPopup(player.getName() + " failed to run away");

                    if (enemyChoice == 0) {
                        jopPopup.openCombatInfoPopup("The " + enemy.getName() + " attacks " + player.getName() + " for " + enemy.getAttack() + " dmg");
                        player.takeDamage(enemy.getAttack());
                        if (player.getHealth() <= 0) {
                            break;
                        }
                    } else if (enemyChoice == 1) {
                        jopPopup.openCombatInfoPopup("The " + enemy.getName() + " blocked");
                    } else if (enemyChoice == 2) {
                        jopPopup.openCombatInfoPopup("The " + enemy.getName() + " healed");
                        enemy.healDamage(enemyHeal);
                    }
                    break;
            }//End of damage/block/heal loop

            //Win / Lose conditions
            if (player.getHealth() <= 0) {
                //Death
                jopPopup.openCombatInfoPopup("Your name will be forever engraved upon this world, Rest in Peace " + player.getName());
                player.setResetHealth();
                System.exit(0);

            } else if (enemy.getHealth() <= 0) {
                //Win
                jopPopup.openCombatInfoPopup("The " + enemy.getName() + " was defeated!\n" + player.getName() + " has emerged victorious!");
                player.setMonstersHunted();
                player.setResetHealth();
                break;
            }

        } while (true);//End of combat loop

    }
}