package Objectorienterad_Programmering_och_Java.ExaminationWork_2;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    public String getMembershipStatus(boolean isTest, String userInput) {

        //check the array for any matching names/ID:s
        for(GymMembers members : gymMemberList) {
            if(members.getName().equalsIgnoreCase(userInput) || members.getPersonnummer().equals(userInput)) {
                if(isTest) {
                    return members.getMemberLevel();
                }
                checkDaysSinceLastPayment(false, members.getLatestMembershipPayment());
                return members.getMemberLevel();
            }
        }
        System.out.println("No members with that name/ID in the system.");
        return "No members with that name/ID is present in the system.";
    }
    public long checkDaysSinceLastPayment(boolean isTest, String lastGymPurchase) {

        LocalDate dateNow;

        if(isTest) {
            dateNow = LocalDate.of(2024,11,24);
        }else {
            dateNow = LocalDate.now();
        }
        String[] dateSplitter = lastGymPurchase.split("-");
        int year = Integer.parseInt(dateSplitter[0].trim());
        int month = Integer.parseInt(dateSplitter[1].trim());
        int day = Integer.parseInt(dateSplitter[2].trim());
        LocalDate purchaseDate = LocalDate.of(year, month, day);

        return ChronoUnit.DAYS.between(purchaseDate, dateNow);

    }

    public String subscriptionLogic(long daysBetweenDates) {
        if (daysBetweenDates <= 365) {
            return "The customer is an active member.";
        }else{
            return "The customer is not an active member.";
        }
    }
    //Write to File

}
