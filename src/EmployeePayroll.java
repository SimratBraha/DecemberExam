/***********************************************************************
 * Programmer: Simrat Braha
 * Class: CS30S
 *
 * Assignment: December Exam
 * Program Name: EmployeePayroll
 *
 * Description: Employee client program for employee class
 ***********************************************************************/
 
// ********** Import Java Libraries **********
 
    import java.io.*;
    //import java.text.DecimalFormat;
    //import java.util.Scanner;

public class EmployeePayroll {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********** Declaration of Constants **********
    
        int MAXSIZE = 10;                                                       // max size of array
        
        int EMPLOYEEHOURS = 50;                                                 // hours worked for additional employee
        double EMPLOYEEWAGE = 15.00;                                            // hourly wage for additional employee 
    
    // ********** Declaration of Variables **********

        String strin = "";                                                      // string data input from keyboard
        String strout = "";                                                     // processed info string to be output
        String bannerOut = "";                                                  // string to print banner to message dialogs
        
        String prompt = "";                                                     // prompt for use in input dialogs
        
        String delim = "[ :]+";                                                 // delimiter string for splitting input string
        String[] tokens;                                                        // string array for gathering input
        
        String info = "December Exam";                                          // assignment information
        String nl = System.lineSeparator();                                     // new line character for file writing
        
        Employee staff[] = new Employee[MAXSIZE];                               // array of employee objects
        int actualSize = 0;                                                     // actual size of array
            	
    // ********** Create Objects **********
    
        //Scanner scanner = new Scanner(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
        Employee employee = new Employee();                                     // create additinal employee object
    	
    // ********** Print Output Banner **********

        ProgramInfo.printBanner(info);                                          // call printBanner method
        ProgramInfo.fileBanner(fout, info);                                     // call fileBanner method
	    	
    // ********** Get Input **********

    // ********** Processing **********
    
        employee.setHours(EMPLOYEEHOURS);                                       // set employee hours worked
        employee.setWage(EMPLOYEEWAGE);                                         // set employee hourly wage

        System.out.format("%-10s %-10s %-11s %-16s %-16s %-15s %s", "ID", "Hours", 
                "Wage", "Regular Pay", "Overtime Pay", "Gross Pay", nl);
        System.out.format(nl + "Additional Employee" + nl);
        System.out.println(employee.toString() + nl);                           // call toString method
    
        strin = fin.readLine();                                                 // read a line of data
        //System.out.println(strin);
        
        while(strin != null){ // begin while                                                     
            
            tokens = strin.split(delim);                                        // split strin into tokens
            
            staff[actualSize] = new Employee(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));
            
            System.out.println(staff[actualSize].toString());                   // call toString method
            
            actualSize++;                                                       // increment actual size of array
            
            strin = fin.readLine();                                             // read a line of data
            
        } // end while

    // ********** Print Output **********

    // ********** Closing Message **********
        
        ProgramInfo.closingMessage(fout, nl);                                   // call closingMessage method
        
    // ********** Close Streams **********
        
        fin.close();                                                            // close input buffer stream
        fout.close();                                                           // close output stream
        
    }  // end main
    
// ********** Static Methods **********

}  // end class
