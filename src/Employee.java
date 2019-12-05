/***********************************************************************
 * Programmer: Simrat Braha
 * Class: CS30S
 *
 * Assignment: December Exam
 * Program Name: Employee
 *
 * Description: brief description of program
 ***********************************************************************/
 
// ********** Import Java Libraries **********

public class Employee {  // begin class
    
    // ********** Class Variables **********
    
        public static int nextID = 1000;                                        // unique ID for each employee
    
    // ********** Instance Variables **********
        
        private int ID = 0;                                                     // unique ID
        private int hours = 0;                                                  // weekly worked hours
        private double wage = 0.0;                                              // hourly wage
            	
    // ********** Constructors **********
        
        /***********************************************************
        * Description: Create a new Employee object
        * 
        * Interface:
        * 
        * @param    
        * 
        * @return
        ***********************************************************/
        public Employee(){ // begin constructor
            
            ID = nextID++;                                                      // set and increment ID
            hours = 0;                                                          // weekly worked hours
            wage = 0.0;                                                         // hourly wage
            
        } // end constructor
        
        /***********************************************************
        * Description: Create a new Employee object
        * 
        * Interface:
        * 
        * @param    h: int
        * @param    w: double
        * 
        * @return
        ***********************************************************/
        public Employee(int h, double w){ // begin constructor
            
            ID = nextID++;                                                      // set and increment ID
            hours = h;                                                          // weekly worked hours
            wage = w;                                                           // hourly wage
            
        } // end constructor
    	
    // ********** Getters **********
        
        /***********************************************************
        * Description: Get employee's unique ID
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   ID: int
        ***********************************************************/
        public int getID(){ // begin getter
            
            
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's hours worked
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   hours: int
        ***********************************************************/
        
        /***********************************************************
        * Description: Get employee's hourly wage
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   wage: double
        ***********************************************************/
	    	
    // ********** Setters **********

}  // end class
