package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2;

import Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.Equipment.Armor;
import Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.Equipment.Weapons;
import Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.PlayerAndEnemy_Stats.Player;
import Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.smallTasks.Popups;

public class GameStart {

    public void gameStart() {

        //Necessary things
        Popups popup = new Popups();
        Weapons weapons = new Weapons();
        Armor armors = new Armor();

        //Asks the name of the player and asks again if name is empty
        Player player = new Player(popup.setNamePopup("What is your name?"));

        //Loops the question for a name to the player if the string is empty
        while (player.getName().isEmpty()) {
            player.setName(popup.setNamePopup("Sorry, i didnt hear you.\nCan you please repeat your name!"));
        }

        //Greeting Message to player
        popup.openCombatInfoPopup("Hello " + player.getName() + "!\nWelcome to this game of monster hunting." +
                "\nIn this game you fight against monsters of your choice," +
                "\nand as you defeat monsters weapons and armors will unlock for you to use." +
                "\n\nGood luck in your hunt!"
        );


        //Sets up the weapon buttons
        popup.setWeaponButtons(player.getMonstersHunted());
        popup.setArmorButtons(player.getMonstersHunted());

        //Start of game loop
        while (true) {

            int enemySelection;
            do {
                //Start Screen
                enemySelection = popup.startMenuPopup(
                        "Hello " + player.getName() + "." +
                                "\nAre you ready to fight some monsters!" +
                                "\nChoose one from the selection below to start." +
                                "\nMonsters Hunted: " + player.getMonstersHunted()
                );

                //Armory Screen
                if (enemySelection == 3) {


                    //Weapon/Armor screen
                    int equipmentChoice;
                    do {

                        equipmentChoice = popup.equipmentMenuPopup("Welcome to the armory.");

                        switch (equipmentChoice) {
                            case 0:

                                break;
                            case 1:
                                //Sets up the weapon buttons before opening the window
                                popup.setWeaponButtons(player.getMonstersHunted());
                                int weaponChoice = popup.weaponMenuPopup("Choose your weapon!" +
                                        "\nMonsters slain: " + player.getMonstersHunted());
                                switch (weaponChoice) {
                                    //Back
                                    case 0: break;
                                    //Unequip Weapon
                                    case 1:
                                        player.setResetAttack();
                                        break;
                                    //Shortsword
                                    case 2:
                                        weapons.setShortsword();
                                        player.setAttack(weapons.getWeaponDamage());
                                        break;
                                    //Longsword
                                    case 3:
                                        weapons.setLongsword();
                                        player.setAttack(weapons.getWeaponDamage());
                                        break;
                                    //Claymore
                                    case 4:
                                        weapons.setClaymore();
                                        player.setAttack(weapons.getWeaponDamage());
                                        break;
                                    //Mastersmith Katana
                                    case 5:
                                        weapons.setGoldenKatana();
                                        player.setAttack(weapons.getWeaponDamage());
                                        break;
                                }

                                break;
                            case 2:
                                //Sets up the armor buttons before opening the window
                                popup.setArmorButtons(player.getMonstersHunted());
                                int armorChoice = popup.armorMenuPopup("Choose your armor!" +
                                        "\nMonsters slain: " + player.getMonstersHunted());
                                switch (armorChoice) {
                                    //Back
                                    case 0: break;
                                    //Unequip Armor
                                    case 1:
                                        player.setResetHealth();
                                        player.setUnequipArmor();
                                        break;
                                    //Leather Armor
                                    case 2:
                                        armors.setLeatherArmor();
                                        player.setEquipArmor(armors.getArmor());
                                        break;
                                    //Iron Armor
                                    case 3:
                                        armors.setIronArmor();
                                        player.setEquipArmor(armors.getArmor());
                                        break;
                                    //Steel Armor
                                    case 4:
                                        armors.setSteelArmor();
                                        player.setEquipArmor(armors.getArmor());
                                        break;
                                    //Mithril Armor
                                    case 5:
                                        armors.setMithrilArmor();
                                        player.setEquipArmor(armors.getArmor());
                                        break;
                                }
                                break;
                        }
                    } while (equipmentChoice != 0);
                }

            } while (enemySelection == 3);

            //Checks if the player wants to quit
            if (enemySelection == 4) {
                popup.openCombatInfoPopup("You ran away.");
                return;
            }

            //Calls combat class with player name and enemy number
            new Combat().combat(player, enemySelection);

        }
    }
}
