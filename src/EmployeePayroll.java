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
    
        int MAXSIZE = 10;                                                       // max size of array
    
    // ********** Declaration of Variables **********

        String strin = "";                                                      // string data input from keyboard
        String strout = "";                                                     // processed info string to be output
        String bannerOut = "";                                                  // string to print banner to message dialogs
        
        String prompt = "";                                                     // prompt for use in input dialogs
        
        String delim = "[ :]+";                                                 // delimiter string for splitting input string
        String[] tokens;                                                        // string array for gathering input
        
        String info = "December Exam";                                          // assignment information
        String nl = System.lineSeparator();                                     // new line character for file writing
        
        Employee staff[] = new Employee[MAXSIZE];                               // array of employees
        int actualSize = 0;                                                     // actual size of array
        
        int length = 0;                                                         // length of tokens
        
        int hours = 0;                                                          // hours worked
        int wage = 0;                                                           // hourly wage
            	
    // ********** Create Objects **********
    
        //Scanner scanner = new Scanner(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
        Employee employee = new Employee();                                     // create employee object
    	
    // ********** Print Output Banner **********

        ProgramInfo.printBanner(info);                                          // call printBanner method
        ProgramInfo.fileBanner(fout, info);                                     // call fileBanner method
	    	
    // ********** Get Input **********
    
        //prompt = "Enter your prompt text here";
        //strin = JOptionPane.showInputDialog(bannerOut + prompt);
        
        strin = fin.readLine();
        //System.out.println(strin);
        
        while(strin != null){ // begin while
            
            tokens = strin.split(delim);
            length = tokens.length;
            //System.out.println(length);
            
            hours = Integer.parseInt(tokens[0]);
            //wage = Double.parseDouble(tokens[1]);
            
            strin = fin.readLine();
            
        } // end while
        
        employee.setHours(50);                                                  // set employee hours worked
        employee.setWage(15.00);                                                // set employee hourly wage
        
        System.out.println(employee.toString());                                // call toString method

    // ********** Processing **********    

    // ********** Print Output **********

    // ********** Closing Message **********
        
        ProgramInfo.closingMessage(fout, nl);                                   // call closingMessage method
        
    // ********** Close Streams **********
        
        fin.close();                                                            // close input buffer stream
        fout.close();                                                           // close output stream
        
    }  // end main
    
// ********** Static Methods **********

}  // end class
