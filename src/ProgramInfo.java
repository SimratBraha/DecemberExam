/***********************************************************************
 * Programmer: Simrat Braha
 * Class: CS30S
 *
 * Assignment: December Exam
 * Program Name: ProgramInfo
 *
 * Description: Print output banners and program info to console and
 *              output file.
 ***********************************************************************/
 
// ********** Import Java Libraries **********

    import java.io.PrintWriter;

public class ProgramInfo {  // begin class
    
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
    * @return
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
    public static void closingMessage(PrintWriter fout, String nl){ // begin class
        System.out.println(nl + "end of processing");
        fout.println(nl + "end of processing");
    } // end class

}  // end class