package Objectorienterad_Programmering_och_Java.ExaminationWork_2;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWriteFiles {

    ArrayList<GymMembers> gymMemberList = new ArrayList<>();

    public void readFileData(String filePath) {
        //read the file data to a string
        try(BufferedReader buffRead = new BufferedReader(new FileReader(filePath))) {
            //Reads the file line by line,
            // putting each line into a temp String,
            // then sending it to be processed
            String tempReadInfo;
            while((tempReadInfo = buffRead.readLine()) != null) {
                readDataToObjectArray(tempReadInfo);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File couldn't be found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void readDataToObjectArray(String fileData) {
        //Splits the string into several variables
        //Creates an object
        //Puts object into Array
        String[] splitter = fileData.split(";");
        String name = splitter[0].trim();
        String adress = splitter[1].trim();
        String mailadress = splitter[2].trim();
        String personnummer = splitter[3].trim();
        String boughtMembership = splitter[4].trim();
        String lastAtGym = splitter[5].trim();
        String memberLevel = splitter[6].trim();

        gymMemberList.add(new GymMembers(name, adress, mailadress, personnummer,boughtMembership, lastAtGym, memberLevel));
    }

    //Compare userInput to Array, and if a name/ID:number match send back
    // - current / past or nonexistent member

    public String getMembershipStatus(String userInput) {

        //check the array for any matching names/ID:s
        for(GymMembers members : gymMemberList) {
            if(members.getName().toLowerCase().equals(userInput.toLowerCase()) || members.getPersonnummer().equals(userInput)) {

                System.out.println(members.getMemberLevel());
                return members.getMemberLevel();

            }

        }
        System.out.println("No members with that name/ID in th system.");
        return "No members with that name/ID.";
    }


    //Write to File

}
