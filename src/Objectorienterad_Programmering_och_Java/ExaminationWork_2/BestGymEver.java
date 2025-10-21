package Objectorienterad_Programmering_och_Java.ExaminationWork_2;

import javax.swing.*;

public class BestGymEver {

    final String GYM_TITLE = "Best Gym Ever!";

    public void MemberProgram() {

        //1. ask the user for name or personnummer
        //2. Import the file data to an object within an Array.
        //3. Check the data for if they are a current member/ past member(use LocalDate) / not a member(not in file)
        //4. Private Trainer file save the name/ personnummer / current date for when a person is at the gym

        //Essentials

        final String GYM_DATA_PATH = "src/Objectorienterad_Programmering_och_Java/ExaminationWork_2/Data till inlämningsuppgift 2.txt";
        ReadWriteFiles readAndWrite = new ReadWriteFiles();
        GymMembers gymMember = new GymMembers();
        boolean programLoop = true;
        String userInput;
        //Reads the file into the array


        //Employee loop
        do{

            readAndWrite.readFileData(GYM_DATA_PATH);
            
            //asks the user for a name/ID
            userInput = JOptionPane.showInputDialog("Input a members Name or ID:number");
            if(userInput == null){
                JOptionPane.showMessageDialog(null, "Closing the program");
                System.exit(0);
            }

            //Check if the name/ID is a member, and if they are it returns that object
            gymMember = readAndWrite.isInputAMember(userInput);

            if(gymMember == null) {
                //If the object is null, empty
                JOptionPane.showMessageDialog(null, "The customer is not a member.");
            }else {
                
                //Gets how long ago in days the last payment was done.
                long daysSinceLastPayment = readAndWrite.checkDaysSinceLastPayment(false, gymMember.getLatestMembershipPayment());
                //Calls and builds the complete information message.
                String completeMessage = getCompleteMessage(daysSinceLastPayment, gymMember);



                //Shows a window with the information message.
                messageWindow(completeMessage);

            }

        }while(true);
    }

    private static String getCompleteMessage(long daysSinceLastPayment, GymMembers gymMember) {
        int daysInAYear = 365;
        long daysUntilNextPayment = (int)(daysInAYear - daysSinceLastPayment);

        String completeMessage;

        //Checks if the last payment was more than 1 year ago and creates the String format accordingly.
        if (daysUntilNextPayment < 0) {
            completeMessage = String.format("Name: %s \nMembership plan: Expired", gymMember.getName());
        } else {
            completeMessage = String.format("Name: %s \nMembership plan: %s\nDays until next payment: %d", gymMember.getName(), gymMember.getMemberLevel(), daysUntilNextPayment);
        }
        return completeMessage;
    }

    private void messageWindow(String message) {

        int jExit = JOptionPane.showConfirmDialog(
                null,
                message,
                GYM_TITLE,
                JOptionPane.DEFAULT_OPTION
        );
        if(jExit == -1) {
            JOptionPane.showMessageDialog(
                    null,
                    "Closing the program.",
                    GYM_TITLE,
                    JOptionPane.PLAIN_MESSAGE
            );
        }

    }
}
