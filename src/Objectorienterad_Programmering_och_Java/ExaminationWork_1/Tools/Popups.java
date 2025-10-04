package Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools;

import javax.swing.JOptionPane;

public class Popups {

    private final String TITEL_MESSAGE = "Plant Care";
    private final String whatPlantMessage = "Vilken växt ska få vätska?";
    private final String emptyPlantMessage = "Inget skrevs in, var vänlig försök igen.";
    private final String exitConfirmationMessage = "Are you sure you want to cancel?";
    private String plantInput;

    //Opens a JOptionPane to allow the user to input a plant's name
    public String getPlantInput() {
        do {
            //Asks the user for a plant input
            this.plantInput = JOptionPane.showInputDialog(
                    null,
                    whatPlantMessage
            );

            openNullChecker(this.plantInput);
        }while (this.plantInput == null || this.plantInput.isEmpty());

        return this.plantInput;
    }

    //Generic information window
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

    //Checks if user input is null or empty
    public void openNullChecker(String stringCheck) {

        if (stringCheck == null) {

            openExitConfirmation();

        }else if(stringCheck.isEmpty()) {

            openInformationWindow(emptyPlantMessage);

        }

    }

    //Asks if the user is sure in exiting
    public void openExitConfirmation() {

        int confirmExit = JOptionPane.showConfirmDialog(
                null,
                exitConfirmationMessage,
                TITEL_MESSAGE,
                JOptionPane.YES_OPTION
        );

        exitConditionCheck(confirmExit);
    }

    //Exits
    public void exitConditionCheck(int exitCheck) {

        if(exitCheck == 0 || exitCheck == -1) {
            //Log message to check for errors
            System.out.println("Log message: Exiting System through openExitConfirmation()");
            System.exit(0);
        }

    }

}
