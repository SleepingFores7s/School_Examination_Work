package Java_Utveckling.ExaminationWork_2;

import java.io.FileWriter;
import java.io.IOException;

public class Java_Inlamningsuppgift_2_1 {
    static final String OUTPUT_FILE_RESULT = "src/Java_Utveckling.ExaminationWork_2/Texts/Dice Roll Results.txt";

    public static void main(String[] args) {

        Dice.createFile();
        int[] returnedList = Dice.createArray();
        int[] returnedSmallList = Dice.analyseArray(returnedList);

        for (int i = 0; i < returnedSmallList.length; i++) {
            System.out.println("Nr of " + (i + 1) + "'s rolled: " + returnedSmallList[i]);
        }
        try (FileWriter fw = new FileWriter(OUTPUT_FILE_RESULT)) {
            for (int i = 0; i < returnedSmallList.length; i++) {
                fw.write(("Nr of " + (i + 1) + "'s rolled: " + returnedSmallList[i] + "\n"));
            }
        } catch (IOException eIo) {
            eIo.printStackTrace();
        }

        FileAnalyzer.fileAnalyzer();
    }
}
/**
 * Egen reflektion---
 * Jag tyckte att denna uppgiften va någolunda enkel, jag fastnade lite i början med hur man skapar en ny fil
 * och hur man skriver/läser till den, men med lite google på w3school så gick det fort.
 * Jag fastnade även på en while() loop en stund för att jag försökte använda
 * "BufferedReader.readLine() != null" som argument inuti while(), men efter lite google på stackoverflow så
 * upptäckte jag att jag att jag hade råkad kolla filen två gånger, en gång inuti while() argumentet, och en gång
 * inuti while() loop body'n så fick ändra det till "((line = BufferedReader.readLin()) != null)" ist. så jag
 * bara kollade nästa linje och inte linjen 2 ner.
 *
 * Användning av AI---
 * Main: metoden så föreslog ai'en att jag kunde göra om mitt filnamn till en konstant ist.
 * om jag använde den på flera ställen.
 * Föreslog även att jag kunde skriva ett personligt felmeddelande om filen inte kunde skrivas till.
 * Visade ett snyggare sätt att sortera min array i analyzeArray med en for-loop ist. för en switch.
 *
 * --Jag hade vilja sett en bättre förklaring på varför IntelliJ vill att jag byter ut .printStackOverflow() mot
 * något mera robust, men jag hittade inte så mycket ang. det, AI nämnde något om en "System.err.println()"
 * men bestämde mig för att inte byta ut den för att jag tycker .printStackOverflow() funkar bra för nu.
 */