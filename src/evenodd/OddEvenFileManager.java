/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author janellejlo
 */
public class OddEvenFileManager {

    public static final String DATA_PATH = "Data.txt";
    public static final String ODD_PATH =  "OddResults.txt";
    public static final String EVEN_PATH = "EvenResults.txt";


    @SuppressWarnings("ConvertToTryWithResources")
    
    public static void doOddEvenSplitting() throws IOException, NumberFormatException {

    // Reading file, check for even or odd and print into separate file for even and odd
        BufferedReader inputStream = new BufferedReader(new FileReader(new File(DATA_PATH)));
        BufferedWriter oddWriter;
        oddWriter = new BufferedWriter(new FileWriter(new File(ODD_PATH)));
        BufferedWriter evenWriter = new BufferedWriter(new FileWriter(new File(EVEN_PATH)));

        @SuppressWarnings("UnusedAssignment")
        String sourceLine = null;
    
    //For checking even and odd
        while ((sourceLine = inputStream.readLine()) != null) {
            int lineNumber = Integer.parseInt(sourceLine.split(" ")[0]);
 
            if (lineNumber % 2 == 0) {
                evenWriter.write(sourceLine);
                evenWriter.newLine();

            } else {
                oddWriter.write(sourceLine);
                oddWriter.newLine();
            }
        }
        inputStream.close();
        oddWriter.close();
        evenWriter.close();
    }

    public static void main(String[] args) throws IOException, NumberFormatException {
        doOddEvenSplitting();
    }
    //test
}    