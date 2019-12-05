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

        printBanner(info);                                                      // call printBanner method
        fileBanner(fout, info);                                                 // call fileBanner method
	    	
    // ********** Get Input **********
    
        //prompt = "Enter your prompt text here";
        //strin = JOptionPane.showInputDialog(bannerOut + prompt);

    // ********** Processing **********

    // ********** Print Output **********
    
    // ********** Closing Message **********
        
        closingMessage(fout);                                                   // call closingMessage method
        
    // ********** Close Streams **********
        
        //fin.close();                                                          // close input buffer stream
        fout.close();                                                           // close output stream
        
    }  // end main
    
// ********** Static Methods **********
    
    /***********************************************************
    * Description: Create a banner string used to print to the
    *              console
    * 
    * Interface:
    * 
    * @param    info
    * 
    * @return
    ***********************************************************/
    public static void printBanner(String info){ // begin class
        System.out.println("*******************************************");
        System.out.println("Name: Simrat Braha");
        System.out.println("Class: CS30S");
        System.out.println("Assignment: " + info);
        System.out.println("*******************************************");
    } // end class

    /***********************************************************
    * Description: Create a banner string used to print to a
    *              message dialog or console window
    * 
    * Interface:
    * 
    * @param    info
    * @param    nl
    * 
    * @return   outputBanner
    ***********************************************************/
    public static String outputBanner(String info, String nl){ // begin class
        String outputBanner = "";
        outputBanner = "*******************************************" + nl;
        outputBanner += "Name: Simrat Braha" + nl;
        outputBanner += "Class: CS30S" + nl;
        outputBanner += "Assignment: " + info + nl;
        outputBanner += "*******************************************" + nl + nl;
        return outputBanner;
    } // end class
    
    /***********************************************************
    * Description: Print banner to output file
    * 
    * Interface:
    * 
    * @param    fout
    * @param    info
    * 
    * @return  none
    ***********************************************************/
    public static void fileBanner(PrintWriter fout, String info){ // begin class
     	fout.println("*******************************************");
    	fout.println("Name: Simrat Braha");
    	fout.println("Class: CS30S");
    	fout.println("Assignment: " + info);
    	fout.println("*******************************************");      
    } // end class
    
    /***********************************************************
    * Description: Print closing message to console and output
    *              file
    * 
    * Interface:
    * 
    * @param fout
    * 
    * @return
    ***********************************************************/
    public static void closingMessage(PrintWriter fout){ // begin class
        System.out.println("end of processing");
        fout.println("end of processing");
    } // end class

}  // end class
