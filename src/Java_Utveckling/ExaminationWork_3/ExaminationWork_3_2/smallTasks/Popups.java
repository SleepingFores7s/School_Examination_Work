package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.smallTasks;

import javax.swing.JOptionPane;

public class Popups {

    //Custom buttons for JOptionPane
    private static final Object[] startChoiceButtons = {"Wolf", "Goblin", "Human", "⚔ Armory ⛊", "Run Away!"};
    private static final Object[] combatSelectionButtons = {"Attack", "Defend", "Heal", "Run away"};
    private static final Object[] combatChoiceButtons = {"Ok"};
    private static final Object[] equipmentButtons = {"Back", "Weapons", "Armors"};
    private Object[] weaponButtons = {"Back"};
    private Object[] armorButtons = {"Back"};

    public String setNamePopup(String messageText) {
        String name = JOptionPane.showInputDialog(null, messageText, "Enemy Encounter", JOptionPane.INFORMATION_MESSAGE);
        if (name == null) {
            System.exit(0);
        }
        return name;
    }

    public int startMenuPopup(Object messageText) {
        int userChoice = JOptionPane.showOptionDialog(
                null,
                (messageText),
                "Enemy Encounter",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null,
                startChoiceButtons,
                startChoiceButtons
        );
        if (userChoice == -1) {
            System.exit(0);
        }
        return userChoice;
    }

    public void setWeaponButtons(int monstersHunted) {

        if (monstersHunted >= 9) {
            this.weaponButtons = new Object[]{"Back", "Unequip", "Shortsword", "Longsword", "Claymore", "Mastersmith Katana"};
        } else if (monstersHunted >= 7) {
            this.weaponButtons = new Object[]{"Back", "Unequip", "Shortsword", "Longsword", "Claymore"};
        } else if (monstersHunted >= 5) {
            this.weaponButtons = new Object[]{"Back", "Unequip", "Shortsword", "Longsword"};
        } else if (monstersHunted >= 2) {
            this.weaponButtons = new Object[]{"Back", "Unequip", "Shortsword"};
        }

    }

    public void setArmorButtons(int monstersHunted) {

        if (monstersHunted >= 9) {
            this.armorButtons = new Object[]{"Back", "Unequip", "Leather Armor", "Iron Armor", "Steel Armor", "Mithril Armor"};
        } else if (monstersHunted >= 7) {
            this.armorButtons = new Object[]{"Back", "Unequip", "Leather Armor", "Iron Armor", "Steel Armor"};
        } else if (monstersHunted >= 5) {
            this.armorButtons = new Object[]{"Back", "Unequip", "Leather Armor", "Iron Armor"};
        } else if (monstersHunted >= 2) {
            this.armorButtons = new Object[]{"Back", "Unequip", "Leather Armor"};
        }
    }

    public int equipmentMenuPopup(String messageText) {

        int equipmentChoice = JOptionPane.showOptionDialog(
                null,
                (messageText),
                "Enemy Encounter",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                equipmentButtons,
                0

        );
        if (equipmentChoice == -1) {
            System.exit(0);
        }
        return equipmentChoice;
    }

    public int weaponMenuPopup(String messageText) {

        int weaponChoice = JOptionPane.showOptionDialog(
                null,
                (messageText),
                "Enemy Encounter",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                weaponButtons,
                0

        );
        if (weaponChoice == -1) {
            System.exit(0);
        }
        return weaponChoice;
    }

    public int armorMenuPopup(String messageText) {

        int armorChoice = JOptionPane.showOptionDialog(
                null,
                (messageText),
                "Enemy Encounter",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                armorButtons,
                0

        );
        if (armorChoice == -1) {
            System.exit(0);
        }
        return armorChoice;
    }

    public int openCombatSelectionPopup(String messageText) {

        int combatChoice = JOptionPane.showOptionDialog(
                null,
                (messageText),
                "Enemy Encounter",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                combatSelectionButtons,
                0

        );
        if (combatChoice == -1) {
            System.exit(0);
        }
        return combatChoice;
    }

    public void openCombatInfoPopup(String messageText) {

        int checker = JOptionPane.showOptionDialog(
                null,
                (messageText),
                "Enemy Encounter",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                combatChoiceButtons,
                0

        );
        if (checker == -1) {
            System.exit(0);
        }
    }
}
