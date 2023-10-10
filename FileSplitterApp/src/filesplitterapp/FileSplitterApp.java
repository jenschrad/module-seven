
package filesplitterapp;


public class FileSplitterApp {

    public static void main(String[] args) {
        // make sure user provides args
        if (args.length != 2) {
            // inform user with usage msg 
            System.out.println("Usage: java FileSplitterApp SourceFile numOfPieces");
            return;
        }
        
        // get the file name and assign it
        String sourceFileName = args[0];
        // get number of pieces to split and convert string to int then assign
        int numOfPieces = Integer.parseInt(args[1]);
        
        // call file splitter class and split file method and pass args
        FileSplitter.splitFile(sourceFileName, numOfPieces); 
        
    }
    
}
