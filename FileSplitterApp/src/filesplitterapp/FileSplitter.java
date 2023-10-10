
package filesplitterapp;

import java.io.*;

public class FileSplitter {
    // method for splitting file that takes 2 params: file name and # to split
    public static void splitFile(String sourceFileName, int numOfPieces) {
        // try-catch to read source file
        try(FileInputStream inputFile = new FileInputStream(sourceFileName)){
            // get file size and assign to var
            long fileSize = new File(sourceFileName).length();
            // get piece size by dividing file size by # of pieces
            long pieceSize = fileSize / numOfPieces;
            
            // byte array buffer that reads/writes to/from source and output
            byte[] buffer = new byte[(int) pieceSize];
            
            // for loop that iterates based on # of pieces 
            for (int i = 1; i <= numOfPieces; i++) {
                // try block to create output files 
                try (FileOutputStream outputFile = new FileOutputStream(sourceFileName + "." + i)) {
                    // reads data into buffer and stores bytes in var
                    int bytesRead = inputFile.read(buffer);
                    
                    // check end of source file and break loop if so
                    if (bytesRead == -1) {
                        break;
                    }
                    // writes data to output file
                    outputFile.write(buffer, 0, bytesRead);
                }
            } 
            // display that file was successfully split into n pieces
            System.out.println("File split into " + numOfPieces + " pieces");
        // catch exceptions and print stack trace
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
