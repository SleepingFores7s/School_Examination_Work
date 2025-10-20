package Objectorienterad_Programmering_och_Java.ExaminationWork_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Member;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReadWriteFilesTest {

    ReadWriteFiles readWriteFiles = new ReadWriteFiles();
    ArrayList<GymMembers> gymMembersListTest = new ArrayList<>();

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

        assert(readWriteFiles.getMembershipStatus(userInputNameTest1).equals(userInputMemberLevelTest1));
        assert(readWriteFiles.getMembershipStatus(userInputIDTest1).equals(userInputMemberLevelTest1));
        assert(readWriteFiles.getMembershipStatus(userInputNameTest2).equals(userInputMemberLevelTest2));
        assert(readWriteFiles.getMembershipStatus(userInputIDTest2).equals(userInputMemberLevelTest2));

    }

    @Test
    public void checkMembershipStatusTest() {

//        assert(gymMembersListTest.get)

    }

}