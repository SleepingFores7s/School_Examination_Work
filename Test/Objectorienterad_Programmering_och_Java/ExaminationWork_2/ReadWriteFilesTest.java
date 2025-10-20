package Objectorienterad_Programmering_och_Java.ExaminationWork_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReadWriteFilesTest {

    ReadWriteFiles readWriteFiles = new ReadWriteFiles();
    ArrayList<GymMembers> gymMembersListTest = new ArrayList<>();
    final boolean isTest = true;

    GymMembers gymMemberTest = new GymMembers(
            "Linda Nyberg",
            "Grangatan 6, 47371 Halmstad",
            "rally@fakemail.se",
            "490827-3164",
            "2023-10-10",
            "2024-10-10",
            "Platina"
    );
    GymMembers gymMemberTest1 = new GymMembers(
            "Oskar Bengtsson",
            "Ängstorget 59, 24436 Lund",
            "lucky@fakemail.com",
            "361015-9737",
            "2021-08-09",
            "2023-08-09",
            "Guld"
    );

    @BeforeEach
    void setUp() {
        String filePathTest = "Test/Objectorienterad_Programmering_och_Java/ExaminationWork_2/TextFilesTests/TextTest.txt";
        readWriteFiles.readFileData(filePathTest);
        gymMembersListTest.add(gymMemberTest);
        gymMembersListTest.add(gymMemberTest1);
    }

    @Test
    public void readFileDataToArrayTest() {

        assertEquals(gymMembersListTest.get(0).toString(), readWriteFiles.gymMemberList.get(0).toString());
        assertEquals(gymMembersListTest.get(1).toString(), readWriteFiles.gymMemberList.get(1).toString());
        assertNotEquals(gymMembersListTest.get(1).toString(), readWriteFiles.gymMemberList.get(0).toString());
        assertNotEquals(gymMembersListTest.get(0).toString(), readWriteFiles.gymMemberList.get(1).toString());

    }

    @Test
    public void checkDataToInputTest() {
        //1
        String userInputNameTest1 = "Linda Nyberg";
        String userInputIDTest1 = "490827-3164";
        String userInputMemberLevelTest1 = "Platina";
        //2
        String userInputNameTest2 = "Oskar Bengtsson";
        String userInputIDTest2 = "361015-9737";
        String userInputMemberLevelTest2 = "Guld";

        assert(readWriteFiles.getMembershipStatus(isTest, userInputNameTest1).equals(userInputMemberLevelTest1));
        assert(readWriteFiles.getMembershipStatus(isTest, userInputIDTest1).equals(userInputMemberLevelTest1));
        assert(readWriteFiles.getMembershipStatus(isTest, userInputNameTest2).equals(userInputMemberLevelTest2));
        assert(readWriteFiles.getMembershipStatus(isTest, userInputIDTest2).equals(userInputMemberLevelTest2));

    }

    @Test
    public void checkDaysSinceLastPaymentTest() {

        // Test date is : 2024-11-24
        String lindaSubscribed = gymMembersListTest.get(0).getLatestMembershipPayment(); //2024-10-10
        String oskarSubscribed = gymMembersListTest.get(1).getLatestMembershipPayment(); //2023-08-09
        String oneYear = "2023-11-25";

        assert(readWriteFiles.checkDaysSinceLastPayment(isTest, lindaSubscribed) < 365);
        assert(readWriteFiles.checkDaysSinceLastPayment(isTest, oskarSubscribed) >= 365);
        assert(readWriteFiles.checkDaysSinceLastPayment(isTest, oneYear) >= 365);

    }

    @Test
    void subscriptionLogic() {



    }



}