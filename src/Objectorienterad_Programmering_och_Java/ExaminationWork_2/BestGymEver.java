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
            JOptionPane.showMessageDialog(null, membershipStatus);



        }while(programLoop);

    }
}
