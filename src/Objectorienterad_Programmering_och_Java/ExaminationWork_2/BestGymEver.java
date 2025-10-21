package Objectorienterad_Programmering_och_Java.ExaminationWork_2;

import javax.swing.*;

public class BestGymEver {
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

            userInput = JOptionPane.showInputDialog("Input a members Name or ID:number");
            System.out.println(userInput);
            if(userInput == null){
                JOptionPane.showMessageDialog(null, "Shutting off the program");
                System.exit(0);
            }

            readAndWrite.readFileData(GYM_DATA_PATH);

            String membershipStatus = readAndWrite.getMembershipStatus(false, userInput);
            long daysSinceLastPayment = readAndWrite.checkDaysSinceLastPayment(false, userInput);
            String activeMembershipCheck = readAndWrite.subscriptionLogic(daysSinceLastPayment);
            int daysUntilNextPayment = (int)(365 - daysSinceLastPayment);

            String completeMessage;
            if(daysUntilNextPayment < 0) {
                completeMessage = String.format("Name: %s \nMembership plan: Expired", userInput);
            }else {
                completeMessage = String.format("Name: %s \nMembership plan: %s\nDays until next payment: %d", userInput, membershipStatus, daysUntilNextPayment);
            }



            JOptionPane.showMessageDialog(
                    null,
                    completeMessage
            );



        }while(programLoop);

    }
}
