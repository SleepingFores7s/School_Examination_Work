package Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools;

import javax.swing.JOptionPane;

public class Popups {

    private final String TITEL_MESSAGE = "Plant Care";
    private final String whatPlantMessage = "Vilken växt ska få vätska?";
    private final String emptyPlantMessage = "Inget skrevs in, var vänlig försök igen.";
    private String plantInput;

    //Opens a JOptionPane to allow the user to input a plant's name
    public String getPlantInput() {
        do {
            this.plantInput = JOptionPane.showInputDialog(null, whatPlantMessage);

            //Checks if the String is null or empty and reacts accordingly
            if (this.plantInput == null) {

                int confirmExit = JOptionPane.showConfirmDialog(
                        null,
                        "Are you sure you want to cancel?",
                        TITEL_MESSAGE,
                        JOptionPane.YES_OPTION
                );

                if(confirmExit == 0 || confirmExit == -1) {
                    //Log message to check for errors
                    System.out.println("Log message: Exiting System through getPlant()");
                    System.exit(0);
                }
            }else if(this.plantInput.isEmpty()) {
                openInformationWindow(emptyPlantMessage);
            }
        }while (this.plantInput == null);
        return this.plantInput;
    }
    public void openInformationWindow(String messageText) {

        JOptionPane.showOptionDialog(
                null,
                (messageText),
                TITEL_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                null,
                0
        );

    }

}
