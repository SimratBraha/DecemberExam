/***********************************************************************
 * Programmer: Simrat Braha
 * Class: CS30S
 *
 * Assignment: December Exam
 * Program Name: Employee
 *
 * Description: Create, give, and change properties of an employee object
 ***********************************************************************/
 
// ********** Import Java Libraries **********

public class Employee {  // begin class
    
    // ********** Class Variables **********
    
        public static int nextID = 1000;                                        // unique ID for each employee
    
    // ********** Instance Variables **********
        
        private final int REGLIMIT = 40;                                        // maximum number of regular hours
        private final double OTMULTIPLIER = 1.5;                                // multiplier for overtime pay
        
        private int ID = 0;                                                     // unique ID
        private int hours = 0;                                                  // weekly worked hours
        private double wage = 0.0;                                              // hourly wage
        
        private double payREG = 0.0;                                            // regular pay
        private double payOT = 0.0;                                             // overtime pay
        private double payGROSS = 0.0;                                          // gross pay
            	
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
        public Employee(){ // begin default constructor
            
            ID = nextID++;                                                      // set and increment ID
            hours = 0;                                                          // weekly worked hours
            wage = 0.0;                                                         // hourly wage
            
        } // end default constructor
        
        /***********************************************************
        * Description: Create a new Employee object
        * 
        * Interface:
        * 
        * @param    h: int: hours worked
        * @param    w: double: hourly wage
        * 
        * @return
        ***********************************************************/
        public Employee(int h, double w){ // begin initialized constructor
            
            ID = nextID++;                                                      // set and increment ID
            hours = h;                                                          // weekly worked hours
            wage = w;                                                           // hourly wage
            
        } // end initialized constructor
    	
    // ********** Getters **********
        
        /***********************************************************
        * Description: Get employee's unique ID
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   ID: int: ID of employee
        ***********************************************************/
        public int getID(){ // begin getter
            
            return this.ID;                                                     // return employee's ID
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's hours worked
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   hours: int: hours worked
        ***********************************************************/
        public int getHours(){ // begin getter
            
            return this.hours;                                                  // return hours worked
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's hourly wage
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   wage: double: hourly wage
        ***********************************************************/
        public double getWage(){ // begin getter
            
            return this.wage;                                                   // return hourly wage
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's regular pay
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   payREG: double: regular pay
        ***********************************************************/
        public double getREG(){ // begin getter
          
            if(hours <= REGLIMIT){ // begin if
                
                payREG = hours * wage;                                          // calculate regular pay
                
            } // end if
            
            else{ // begin else
                
                payREG = (hours - (hours - REGLIMIT)) * wage;                   // calculate regular pay
                
            } // end else
            
            return this.payREG;                                                 // return regular pay
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's overtime pay
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   payOT: double: overtime pay
        ***********************************************************/
        public double getOT(){ // begin getter
          
            if(hours > REGLIMIT){ // begin if
                
                payOT = (hours - REGLIMIT) * (wage * OTMULTIPLIER);             // calculate overtime pay
                
            } // end if
            
            return this.payOT;                                                  // return overtime pay
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's gross pay
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   payGROSS: double: gross pay
        ***********************************************************/
        public double getGROSS(){ // begin getter
          
            payGROSS = payREG + payOT;                                          // calculate gross pay
            
            return this.payGROSS;                                               // return gross pay
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's regular pay
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   data: String: employee data
        ***********************************************************/
        public String toString(){ // begin method
            
            String data = "";
            
            data += String.format("%-10d %-10d $%-10.2f $%-15.2f $%-15.2f $%-15.2f", getID(), 
                    getHours(), getWage(), getREG(), getOT(), getGROSS());      // employee data formatting
            
            return data;                                                        // return employee data
            
        } // end method
	    	
    // ********** Setters **********
        
        /***********************************************************
        * Description: Set a new value for employee's hours worked
        * 
        * Interface:
        * 
        * @param    h: hours: hours worked
        * 
        * @return
        ***********************************************************/
        public void setHours(int h){ // begin setter
            
            hours = h;                                                          // set new hours worked
            
        } // end setter
        
        /***********************************************************
        * Description: Set a new value for employee's hourly wage
        * 
        * Interface:
        * 
        * @param    w: wage: hourly wage
        * 
        * @return
        ***********************************************************/
        public void setWage(double w){ // begin setter
            
            wage = w;                                                           // set new wage
            
        } // end setter

}  // end class