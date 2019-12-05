/***********************************************************************
 * Programmer: Simrat Braha
 * Class: CS30S
 *
 * Assignment: December Exam
 * Program Name: EmployeePayroll
 *
 * Description: brief description of program
 ***********************************************************************/
 
// ********** Import Java Libraries **********
 
    import javax.swing.*;
    import java.io.*;
    //import java.text.DecimalFormat;
    //import java.util.Scanner;

public class EmployeePayroll {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********** Declaration of Constants **********
    
    // ********** Declaration of Variables **********

        String strin = "";                                                      // string data input from keyboard
        String strout = "";                                                     // processed info string to be output
        String bannerOut = "";                                                  // string to print banner to message dialogs
        
        String prompt = "";                                                     // prompt for use in input dialogs
        
        String delim = "[ :]+";                                                 // delimiter string for splitting input string
        String[] tokens;                                                        // string array for gathering input
        
        String info = "December Exam";                                          // assignment information
        String nl = System.lineSeparator();                                     // new line character for file writing
            	
    // ********** Create Objects **********
    
        //Scanner scanner = new Scanner(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
        
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print Output Banner **********

        ProgramInfo.printBanner(info);                                          // call printBanner method
        ProgramInfo.fileBanner(fout, info);                                     // call fileBanner method
	    	
    // ********** Get Input **********
    
        //prompt = "Enter your prompt text here";
        //strin = JOptionPane.showInputDialog(bannerOut + prompt);

    // ********** Processing **********

    // ********** Print Output **********
    
    // ********** Closing Message **********
        
        ProgramInfo.closingMessage(fout, nl);                                   // call closingMessage method
        
    // ********** Close Streams **********
        
        //fin.close();                                                          // close input buffer stream
        fout.close();                                                           // close output stream
        
    }  // end main
    
// ********** Static Methods **********

}  // end class
