package Java_Utveckling.ExaminationWork_2;

import java.io.*;

public class FileAnalyzer {
    static final String OUTPUT_FILE_ANALYZER = "src/Java_Utveckling.ExaminationWork_2/Texts/Analyzer Test.txt";
    public static void fileAnalyzer () {

        try(BufferedReader buffRead = new BufferedReader(new FileReader(OUTPUT_FILE_ANALYZER))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = buffRead.readLine()) != null) {
                    sb.append(line + "\n");
            }
            System.out.println("\nThe amount of characters used in the file \""+ OUTPUT_FILE_ANALYZER +"\" is: " + sb.length());

        }catch (FileNotFoundException eFe) {
            eFe.printStackTrace();
        }catch (IOException eIo) {
            eIo.printStackTrace();
        }
    }
}
