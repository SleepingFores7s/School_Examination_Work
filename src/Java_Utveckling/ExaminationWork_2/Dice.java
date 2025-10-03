package Java_Utveckling.ExaminationWork_2;

import java.io.*;
import java.util.Random;

public class Dice {
    static final String OUTPUT_FILE_START = "src/Java_Utveckling.ExaminationWork_2/Texts/DiceStackNumbers.txt";
    static final int NUMBER_OF_ROLLS = 1000;

    public static void createFile() {

        try (FileWriter fw = new FileWriter(OUTPUT_FILE_START)) {
            Random random = new Random();
            for (int i = 0; i < NUMBER_OF_ROLLS; i++) {
                int randomInt = random.nextInt(1, 7);
                fw.write(String.valueOf(randomInt));
            }
        } catch (IOException eIo) {
            eIo.printStackTrace();
        }
    }

    public static int[] createArray() {

        int[] readRandomList = new int[NUMBER_OF_ROLLS];
        try (BufferedReader buffRead = new BufferedReader(new FileReader(OUTPUT_FILE_START))) {
            String fileRead = buffRead.readLine();
            for (int i = 0; i < fileRead.length(); i++) {
                char tempChar = fileRead.charAt(i);
                readRandomList[i] = Integer.parseInt(String.valueOf(tempChar));
            }
        } catch (FileNotFoundException eFe) {
            System.err.println("Filen kunde inte hittas" + eFe.getMessage());
            eFe.printStackTrace();
        } catch (IOException eIO) {
            eIO.printStackTrace();
        }
        return readRandomList;
    }

    public static int[] analyseArray(int[] recievedArray) {

        int[] smallArray = new int[6];

        for(int i : recievedArray) {
            if(i >= 1 && i <= 6) {
                smallArray[i - 1]++;
            }
        }
        return smallArray;
    }

}
